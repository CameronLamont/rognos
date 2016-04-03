package builder;

import V5_report.*;
import builder.RognosQuery.sourceTypeEnum;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.*;

public class RognosReport {

	private ObjectFactory of;
	private Report rpt;
	
	public RognosReport(){
		of = new ObjectFactory();
		rpt = of.createReport();
		
		// set default style version and expression locale
		rpt.setUseStyleVersion("10");
		rpt.setExpressionLocale("en-us");

		// set default drill behaviour
		DrillBehavior db = of.createDrillBehavior();
		db.setModelBasedDrillThru(true);
		rpt.setDrillBehavior(db);
		

		// create new queries,layouts
		rpt.setQueries( new Report.Queries());
		rpt.setLayouts( new Layouts());
		
		rpt.getLayouts().setLayout(new LayoutType());
		rpt.getLayouts().getLayout().setReportPages(of.createLayoutTypeReportPages());
		
	}
	
	public RognosReport(File f){
		rpt = unmarshal(f);
	}
	
	public RognosReport(String reportName){
		this();
		this.setReportName(reportName);
		
	}
	
	public RognosReport(String reportName, String modelPath){
		this();
		this.setReportName(reportName);
		
		// set model path
		//rpt.setModelPath("/content/folder[@name='Samples']/folder[@name='Models']/package[@name='GO Sales (query)']/model[@name='model']");
		this.setModelPath(modelPath);
		
	}
	public void setReportName(String reportName){
		rpt.setReportName(reportName);
	}
	
	public void setModelPath(String modelPath){
		rpt.setModelPath(modelPath);
	}
	
	public RognosPage addReportPage(String pageName){
		LayoutType.ReportPages rp = rpt.getLayouts().getLayout().getReportPages();
		
		RognosPage p = new RognosPage(pageName);
		
		
		rp.getPageOrPageSetOrBookletItem().add(p.getPage());
		return p;
	}
	
	public void marshal(){
		this.marshal(System.out);
	}
	
	
	public void marshal(OutputStream os) {
        try {
        	//JAXBElement<Report> mr = rpt.;
            JAXBContext jc = JAXBContext.newInstance( "V5_report" );
            Marshaller m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal( rpt, os );
            
        } catch( JAXBException jbe ){
            // ...
        	System.out.println(jbe.toString());
        }
    }
	
	public Report unmarshal(File f){
		 try {
	        	//JAXBElement<Report> mr = rpt.;
	            JAXBContext jc = JAXBContext.newInstance( "V5_report" );
	            Unmarshaller u = jc.createUnmarshaller();
	            //m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            //m.marshal( rpt, os );
	            return (Report)u.unmarshal(f);
	            
	        } catch( JAXBException jbe ){
	            // ...
	        	System.out.println(jbe.toString());
	        	return null;
	        }
	}

	public RognosQuery addModelQuery(String queryName){
		return this.addQuery(queryName, sourceTypeEnum.MODEL);
	}
	
	public RognosQuery addSQLQuery(String queryName){
		return this.addQuery(queryName, sourceTypeEnum.SQLQUERY);
	}
	
	public RognosQuery addQuery(String queryName, sourceTypeEnum ste) {
		RognosQuery q = new RognosQuery(rpt,queryName,ste);
		
		rpt.getQueries().getQuery().add(q.getQueryType());
		
		return q;
		
	}
}
