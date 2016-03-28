package builder;

public class Rognos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RognosReport r = new RognosReport("/content/folder[@name='Samples']/folder[@name='Models']/package[@name='GO Sales (query)']/model[@name='model']");
		
		r.addQuery("Query1",true);
		r.addReportPage("Page1");
		
		System.out.println("blah");
		r.marshal();
	}

}
