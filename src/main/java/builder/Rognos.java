package builder;

import builder.RognosQuery.sourceTypeEnum;

public class Rognos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RognosReport r = new RognosReport("/content/folder[@name='Samples']/folder[@name='Models']/package[@name='GO Sales (query)']/model[@name='model']");
		
		// Create a query with 3 items
		RognosQuery rq = r.addQuery("Query1",sourceTypeEnum.MODEL);
		
		rq.addAggregateDataItem("[Sales (query)].[Sales].[Quantity]","Quantity","total");
		rq.addDataItem("[Sales (query)].[Branch].[Branch code]","Branch code");
		rq.addDataItem("[Sales (query)].[Order].[Order number]","Order number");
		
		// Create a page
		r.addReportPage("Page1");
		
		
		System.out.println("blah");
		r.marshal();
	}

}
