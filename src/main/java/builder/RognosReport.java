package builder;

import V5_report.*;
import builder.RognosQuery.sourceTypeEnum;

import javax.xml.bind.*;

public class RognosReport {

	private ObjectFactory of;
	private Report rpt;
	
	public RognosReport(String modelPath){
		of = new ObjectFactory();
		rpt = of.createReport();
		
		// set default style version and expression locale
		rpt.setUseStyleVersion("10");
		rpt.setExpressionLocale("en-us");
		
		// set model path
		//rpt.setModelPath("/content/folder[@name='Samples']/folder[@name='Models']/package[@name='GO Sales (query)']/model[@name='model']");
		rpt.setModelPath(modelPath);
		
		
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

	public Page addReportPage(String pageName){
		LayoutType.ReportPages rp = rpt.getLayouts().getLayout().getReportPages();
		Page p = of.createPage();
		p.setName(pageName);
		
		rp.getPageOrPageSetOrBookletItem().add(p);
		return p;
	}
	
	
	
	public void marshal() {
        try {
        	//JAXBElement<Report> mr = rpt.;
            JAXBContext jc = JAXBContext.newInstance( "V5_report" );
            Marshaller m = jc.createMarshaller();
            m.marshal( rpt, System.out );
        } catch( JAXBException jbe ){
            // ...
        	System.out.println(jbe.toString());
        }
    }

	public RognosQuery addQuery(String queryName, sourceTypeEnum ste) {
		RognosQuery q = new RognosQuery(rpt,queryName,ste);
		
		rpt.getQueries().getQuery().add(q.getQueryType());
		
		return q;
		
	}
}
