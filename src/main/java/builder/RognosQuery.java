package builder;

import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.management.QueryExp;

import V5_report.DataItem;
import V5_report.DetailFilter;
import V5_report.FilterDefinition;
import V5_report.ObjectFactory;
import V5_report.QueryExpressionType;
import V5_report.QueryType;
import V5_report.Report;
import V5_report.SourceType;
import V5_report.SourceType.SqlQuery.MdProjectedItems.MdProjectedItem;

public class RognosQuery {
	
	private ObjectFactory of;
	private QueryType q;
	private String queryName;
	private SourceType st;
	
	public enum sourceTypeEnum{
		MODEL,
		SQLQUERY,
		MDXQUERY
	};
	
	public RognosQuery(Report rpt, String queryName, sourceTypeEnum ste){
		of = new ObjectFactory();
		q = of.createQueryType();
		q.setName(queryName);
		
		q.setSelection(of.createSelection());
		q.setDetailFilters(of.createQueryTypeDetailFilters());
		q.setSummaryFilters(of.createQueryTypeSummaryFilters());
		
		this.setSourceType(ste);
//		rpt.getQueries().getQuery().add(q);
		//return q;
	}
	public QueryType getQueryType(){
		return q;
	}
	
	public String getSQLText(){
		return q.getSource().getSqlQuery().getSqlText();
	}
	
	public void setSQL(String sqlName, String sqlText,String dataSource,String type){
		q.getSource().getSqlQuery().setName(sqlName);;
		q.getSource().getSqlQuery().setDataSource(dataSource);
		q.getSource().getSqlQuery().setType(type);
		q.getSource().getSqlQuery().setSqlText(sqlText);
	}
	
	private SourceType setSourceType(sourceTypeEnum ste){
		
			st = of.createSourceType();
			
			
			switch (ste) {

				case MODEL:
					st.setModel(of.createSourceTypeModel());
					break;
				case SQLQUERY:
					st.setSqlQuery(of.createSourceTypeSqlQuery());
					st.getSqlQuery().setMdProjectedItems(of.createSourceTypeSqlQueryMdProjectedItems());
					
					//TODO add support for hard coded sql
					System.out.println("Setup SQL Query here");
					break;
				case MDXQUERY:
					st.setMdxQuery(of.createSourceTypeMdxQuery());
					//TODO add support for hard coded MDX (low priority)
					System.out.println("Setup MDX Query here");
				default:
					System.out.println("???");
			};
			q.setSource(st);
			return st;
	}
	
	public RognosDataItem addSQLDataItem(String sqlName,String projectedItem){
		// use projected item as data item name
		return addSQLDataItem(sqlName,projectedItem,projectedItem);
	}
	public RognosDataItem addSQLDataItem(String sqlName,String projectedItem,String dataItemName){
		RognosDataItem rdi = new RognosDataItem("[" + sqlName + "].[" + projectedItem + "]",dataItemName,"none");
		
		MdProjectedItem pi = of.createSourceTypeSqlQueryMdProjectedItemsMdProjectedItem();
		pi.setName(projectedItem);
		q.getSource().getSqlQuery().getMdProjectedItems().getMdProjectedItem().add(pi);
		
		return rdi;
	}
	
	public RognosDataItem addDataItem(String namespace,String querySubject, String dataItemName) {
		
		return this.addDataItem("[" + namespace + "].[" + querySubject + "].[" + dataItemName + "]", dataItemName);
	}
	
	public RognosDataItem addDataItem(String expression) {

		// Derive the dataItemName from the last element in the string
		String[] expparts = expression.split(Pattern.quote("."));
		String dataItemName = expparts[expparts.length-1];
		dataItemName = dataItemName.replace("[", "");
		dataItemName = dataItemName.replace("]", "");
		
		RognosDataItem rdi = new RognosDataItem(expression,dataItemName,"none");
				
		q.getSelection().getDataItemElement().add(rdi.getDataItem());
		
		return this.addDataItem(expression,dataItemName);
	}
	
	public RognosDataItem addDataItem(String expression, String dataItemName) {

		RognosDataItem rdi = new RognosDataItem(expression,dataItemName,"none");
				
		q.getSelection().getDataItemElement().add(rdi.getDataItem());
		
		return rdi;
	}
	
	
	public RognosDataItem addAggregateDataItem(String expression, String dataItemName, String aggregateType) {
		
		RognosDataItem rdi = new RognosDataItem(expression, dataItemName,aggregateType);
				
		q.getSelection().getDataItemElement().add(rdi.getDataItem());
		return rdi;
	}
	
	
	public class RognosDataItem{
		private DataItem di;
		private MdProjectedItem pi;
		RognosDataItem(String expression, String dataItemName, String aggregateType){
			di = of.createDataItem();
			di.setName(dataItemName);
			
			QueryExpressionType qet = of.createQueryExpressionType();
			
			qet.setValue(expression);

			di.setExpression(qet);
			if(aggregateType.length()>0){
				di.setAggregate(aggregateType);
			}
		}
		RognosDataItem(DataItem di_in){
			di = di_in;
		}
		RognosDataItem(MdProjectedItem pi_in){
			this(pi_in,pi_in.getName());
		}
		RognosDataItem(MdProjectedItem pi_in,String dataItemName){
			this(pi_in.getName(),dataItemName,"");
			pi = pi_in;
		}
		private String getDataItemLabel(){
			return di.getLabel();
		}
		private void setDataItemLabel(String label_in){
			di.setLabel(label_in);
		}
		
		private DataItem getDataItem(){
			return di;
		}
		public String getDataItemName() {

			return di.getName();
		}
	}
	
	public enum detailFilterTypeEnum{
			DetailFilterCompare,
			DetailFilterInValues,
			DetailFilterNull,
			DetailFilterNot,
			DetailFilterInMembers,
			DetailFilterOr,
			DetailFilterAnd,
			DetailFilterRange,
			DetailFilterStringCompare
		}
	
	public RognosDetailFilter addDetailFilter(detailFilterTypeEnum ft){
		RognosDetailFilter rdf;
		
		rdf = null;
		try {
			rdf = (RognosDetailFilter)Class.forName("Rognos" + ft.toString()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rdf;
	}
	
	public class RognosDetailFilter {
		protected DetailFilter df;
		protected RognosDataItem rdi;
		
		
		RognosDetailFilter(){
			this("required",false);
		}
		RognosDetailFilter(String use, boolean postAutoAggregation){
			df = of.createDetailFilter();
			df.setUse(use);
			df.setPostAutoAggregation(postAutoAggregation);
			df.setFilterDefinition(of.createFilterDefinition());
		}
		
		private DetailFilter getDetailFilter(){
			return df;
		}
	
		private RognosDataItem getDataItem(){
			return rdi;
		}
	}
	
	public class RognosDetailFilterCompare extends RognosDetailFilter{
		private FilterDefinition.FilterCompare f;
		
		RognosDetailFilterCompare(){
			super();
			f = of.createFilterDefinitionFilterCompare();
		}
		RognosDetailFilterCompare(RognosDataItem rdi_in, String dataType, String operator){
			this();
			this.setDataItem(rdi_in, dataType, operator);
		}
		
		private void setDataItem(RognosDataItem rdi_in, String dataType, String operator){
			rdi = rdi_in;
			
			df.getFilterDefinition().setFilterCompare(f);
			f.setRefDataItem(rdi.getDataItemName());
			f.setDataType(dataType);
			f.setOperator(dataType);
			
		}
		
		private void setFilterValue(String filterValue){
			f.setFilterValue(filterValue);
		}
		
	}
	
	
	public class RognosDetailFilterInValues extends RognosDetailFilter{
		private FilterDefinition.FilterInValues f;
		
		RognosDetailFilterInValues(){
			super();
			f = of.createFilterDefinitionFilterInValues();
		}
		RognosDetailFilterInValues(RognosDataItem rdi_in, String dataType){
			this();
			this.setDataItem(rdi_in, dataType);
		}
		
		private void setDataItem(RognosDataItem rdi_in, String dataType){
			rdi = rdi_in;
			
			df.getFilterDefinition().setFilterInValues(f);
			f.setFilterValues(of.createFilterDefinitionFilterInValuesFilterValues());
			f.setRefDataItem(rdi.getDataItemName());
			f.setDataType(dataType);
			
		}
		
		private void addFilterValue(String filterValue){
			
			f.getFilterValues().getFilterValue().add(filterValue);
		}
		
	}

	public java.util.List<RognosDataItem> getDataItems(){
		java.util.List<RognosDataItem> rdilist = new ArrayList<RognosDataItem>();
		
		RognosDataItem rdi;
		
		for(Object di: q.getSelection().getDataItemElement()){
			rdi = new RognosDataItem((DataItem)di);
			rdilist.add(rdi);
		}
		
		return rdilist;
	}

	public String getName() {

		return q.getName();
	}
	
}
