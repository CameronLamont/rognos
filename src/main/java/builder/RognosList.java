package builder;

import java.util.ArrayList;

import V5_report.Contents;
import V5_report.Contents.TextItem;
import V5_report.DataSourceType.DataItemLabel;
import V5_report.DataSourceType.DataItemValue;
import V5_report.DefaultStyles.DefaultStyle;
import V5_report.List;
import V5_report.List.ListColumns.ListColumn;
import V5_report.ObjectFactory;
import builder.RognosQuery.RognosDataItem;

public class RognosList {
	private ObjectFactory of;
	private List l;
	private RognosQuery rq;
	private RognosPage pg;
	
	public RognosPage getPage() {
		return pg;
	}

	public void setPage(RognosPage pg) {
		this.pg = pg;
	}

	public RognosList(RognosPage page, String listName, RognosQuery refQuery){
		this(page,listName);
			
		this.setRefQuery(refQuery);

	}

	public RognosList(RognosPage page, String listName) {
		DefaultStyle ds;
		
		of = new ObjectFactory();
		l = of.createList();
		
		this.setPage(page);
		
		l.setName(listName);

		l.setNoDataHandler(of.createNoDataHandler());
		l.getNoDataHandler().setContents(of.createContents());
		//l.getNoDataHandler().getContents().getLayoutElement().add
		addStaticTextItem(l.getNoDataHandler().getContents(),"No Data Available");
		
		// add style for the list
		l.setStyle(of.createStyle());
		l.getStyle().setDefaultStyles(of.createDefaultStyles());
		ds = of.createDefaultStylesDefaultStyle();
		ds.setRefStyle("ls");
		l.getStyle().getDefaultStyles().getDefaultStyle().add(ds);
				
		l.setListColumns(of.createListListColumns());
	}
	
	private void setRefQuery(RognosQuery refQuery){
		setRefQuery(refQuery,true);
	}
	
	private void setRefQuery(RognosQuery refQuery,boolean addColumns){
		
		
		// Link Query TODO add to query collection of references
		l.setRefQuery(refQuery.getName());
		rq = refQuery;
		
		
		if(addColumns){
			// get data items attached to the query
			java.util.List<RognosDataItem> rdilist = rq.getDataItems();

			for(RognosDataItem rdi: rdilist){
				// for each data item create a column, title and body
				addListColumn(rdi);
				
				}
		}
		
	}

	
	public ListColumn addListColumn(RognosDataItem rdi) {
		DefaultStyle ds;
		ListColumn lc = new ListColumn();
		
		lc.setListColumnTitle(of.createListListColumnsListColumnListColumnTitle());
		
		lc.getListColumnTitle().setStyle(of.createStyle());
		
		ds = of.createDefaultStylesDefaultStyle();
		ds.setRefStyle("lt");
		lc.getListColumnTitle().getStyle().setDefaultStyles(of.createDefaultStyles());
		lc.getListColumnTitle().getStyle().getDefaultStyles().getDefaultStyle().add(ds);
		
		
		lc.getListColumnTitle().setContents(of.createContents());
		addDataItemLabel(lc.getListColumnTitle().getContents(), rdi.getDataItemName());
		
		lc.setListColumnBody(of.createListListColumnsListColumnListColumnBody());
		
		lc.getListColumnBody().setStyle(of.createStyle());
		ds = of.createDefaultStylesDefaultStyle();
		ds.setRefStyle("lc"); // sometimes this is 'lm' m for measure?
		lc.getListColumnBody().getStyle().setDefaultStyles(of.createDefaultStyles());
		lc.getListColumnBody().getStyle().getDefaultStyles().getDefaultStyle().add(ds);
		
		
		lc.getListColumnBody().setContents(of.createContents());
		addDataItemValue(lc.getListColumnBody().getContents(), rdi.getDataItemName());
		
		// add the column to the columns collection
		l.getListColumns().getListColumn().add(lc);
		
		return lc;
	}
	
	private TextItem addDataItemValue(Contents cont,String refDataItem){
		TextItem ti = of.createContentsTextItem();
		ti.setDataSource(of.createDataSourceType());
		DataItemValue val = of.createDataSourceTypeDataItemValue();
		val.setRefDataItem(refDataItem);
		ti.getDataSource().setDataItemValue(val);
		
		cont.getLayoutElement().add(ti);
		return ti;
	}
	
	
	private TextItem addDataItemLabel(Contents cont,String refDataItem){
		TextItem ti = of.createContentsTextItem();
		ti.setDataSource(of.createDataSourceType());
		DataItemLabel lbl = of.createDataSourceTypeDataItemLabel();
		lbl.setRefDataItem(refDataItem);
		ti.getDataSource().setDataItemLabel(lbl);
		
		cont.getLayoutElement().add(ti);
		return ti;
	}
	
	private TextItem addStaticTextItem(Contents cont,String staticValue){
		TextItem ti = of.createContentsTextItem();
		ti.setDataSource(of.createDataSourceType());
		ti.getDataSource().setStaticValue(staticValue);
		
		cont.getLayoutElement().add(ti);
		return ti;
	}

	public List getList() {
		// 
		return l;
	}
}
