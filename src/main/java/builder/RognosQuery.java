package builder;

import java.util.regex.Pattern;

import javax.management.QueryExp;

import V5_report.DataItem;
import V5_report.ObjectFactory;
import V5_report.QueryExpressionType;
import V5_report.QueryType;
import V5_report.Report;
import V5_report.SourceType;

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
		
		this.setSourceType(ste);
//		rpt.getQueries().getQuery().add(q);
		//return q;
	}
	public QueryType getQueryType(){
		return q;
	}
	
	private SourceType setSourceType(sourceTypeEnum ste){
		
			st = of.createSourceType();
			
			
			switch (ste) {

				case MODEL:
					st.setModel(of.createSourceTypeModel());
					break;
				case SQLQUERY:
					st.setSqlQuery(of.createSourceTypeSqlQuery());
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
		RognosDataItem(String expression, String dataItemName, String aggregateType){
			di = of.createDataItem();
			di.setName(dataItemName);
			
			QueryExpressionType qet = of.createQueryExpressionType();
			
			qet.setValue(expression);

			di.setExpression(qet);
			di.setAggregate(aggregateType);
		}
		private DataItem getDataItem(){
			return di;
		}
	}
	
}
