package th.co.eecsv.run;


public class ProcessControl {

	
	public static void main(String[] args) {
		
		try {
			long startTime = System.currentTimeMillis();
			System.out.println("Start Time ::"+startTime);
			System.out.println("Elderly Export Start");
			Thread.sleep(2000);
			ExtractProcess process = new ExtractProcess();
			process.elderlyExportProcess();
			long endTime = System.currentTimeMillis();
			System.out.println("End Time ::"+endTime);
			System.out.println("All Time ::"+((endTime - startTime)/1000)+" sec");
			System.out.println("Elderly Export End");
		} catch (Exception e) {		
			System.out.println("ERROR-Elderly Export error");
			e.printStackTrace();
		}
		
	}

}
