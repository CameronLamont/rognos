package builder;

import java.io.ByteArrayOutputStream;
import java.io.File;

import builder.RognosQuery.RognosDetailFilter;
import builder.RognosQuery.detailFilterTypeEnum;
import builder.RognosQuery.sourceTypeEnum;

public class Rognos {

	public static void main(String[] args) {
		
		RognosReport r = new RognosReport("Report1");
				
		r.setModelPath("/content/folder[@name='Samples']/folder[@name='Models']/package[@name='GO Sales (query)']/model[@name='model']");
		
		// Create a query with 3 items
		RognosQuery rq = r.addQuery("Query1",sourceTypeEnum.MODEL);
		
		rq.addAggregateDataItem("[Sales (query)].[Sales].[Quantity]","Quantity","total");
		rq.addDataItem("[Sales (query)].[Branch].[Branch code]","Branch code");
		rq.addDataItem("[Sales (query)].[Order].[Order number]","Order number");
		
		RognosDetailFilter rdf;
		rdf = rq.addDetailFilterExpression("[Branch code]=30");
		//rdf = rq.addDetailFilter(detailFilterTypeEnum.DetailFilterExpression);
		
		// Create a page
		RognosPage p = r.addReportPage("Page1");
		
		// Create a list within the page
		RognosList l = p.addList("List1",rq);
		
		//System.out.println("blah");
		System.out.println(r.toString());
		//r.marshal(System.out);
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		r.marshal(boas);
		
		System.out.println(boas.toString());
		
		RognosReport r2 = new RognosReport(new File("CognosDashboard201508271200.xml"));
		
		r2.marshal(boas);
		
		System.out.println(boas.toString());
	}

}
