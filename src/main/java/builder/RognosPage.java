package builder;

import V5_report.DefaultStyles.DefaultStyle;
import V5_report.ObjectFactory;
import V5_report.Page;
import V5_report.Page.PageBody;
import V5_report.Page.PageFooter;
import V5_report.Page.PageHeader;

public class RognosPage {
	private ObjectFactory of;
	private Page p;
	
	RognosPage(String pageName){
		DefaultStyle ds;
		
		of = new ObjectFactory();
		p = of.createPage();
		
		p.setName(pageName);
		
		// set the pages default style
		p.setStyle(of.createStyle());
		p.getStyle().setDefaultStyles(of.createDefaultStyles());
		ds = of.createDefaultStylesDefaultStyle();
		ds.setRefStyle("pg");
		p.getStyle().getDefaultStyles().getDefaultStyle().add(ds);
		
		
		// create header, body footer, per page
		this.addPageHeader();
		this.addPageBody();
		
		this.addPageFooter();
	}
	
	
	
	public PageBody addPageBody(){
		DefaultStyle ds;
		
		// create pageBody etc
		PageBody pb = of.createPagePageBody();
		pb.setContents(of.createContents());
		

		pb.setStyle(of.createStyle());
		pb.getStyle().setDefaultStyles(of.createDefaultStyles());
		ds = of.createDefaultStylesDefaultStyle();
		ds.setRefStyle("pb");
		pb.getStyle().getDefaultStyles().getDefaultStyle().add(ds);
		
		p.setPageBody(pb);
		
		return pb;
	}
	

	public PageHeader addPageHeader(){
		DefaultStyle ds;
		
		// create pageHeader etc
		PageHeader ph = of.createPagePageHeader();
		
		ph.setContents(of.createContents());
		
		ph.setStyle(of.createStyle());
		ph.getStyle().setDefaultStyles(of.createDefaultStyles());
		ds = of.createDefaultStylesDefaultStyle();
		ds.setRefStyle("ph");
		ph.getStyle().getDefaultStyles().getDefaultStyle().add(ds);
		
		
		p.setPageHeader(ph);
		
		return ph;
	}
	
	public PageFooter addPageFooter(){
		
		DefaultStyle ds;
		// create pageHeader etc
		PageFooter pf = of.createPagePageFooter();
		
		pf.setContents(of.createContents());
		
		pf.setStyle(of.createStyle());
		pf.getStyle().setDefaultStyles(of.createDefaultStyles());
		ds = of.createDefaultStylesDefaultStyle();
		ds.setRefStyle("pf");
		pf.getStyle().getDefaultStyles().getDefaultStyle().add(ds);
		
		p.setPageFooter(pf);
		
		return pf;
	}
	
	public Page getPage(){
		return p;
	}
	public String getPageName(){
		return p.getName();
	}



	public RognosList addList(String listName, RognosQuery rq) {
		
		RognosList l = new RognosList(listName, rq);
		
		//add to Collection of lists
		p.getPageBody().getContents().getLayoutElement().add(l.getList());
		
		return l;
		
	}
}
