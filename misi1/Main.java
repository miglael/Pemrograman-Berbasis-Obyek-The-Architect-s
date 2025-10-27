public class Main {
	public static void main(String[] args) {
		PC pc = new PC(
			new MotherBoard(1500000),
			new CPU(2500000),
			new RAM(800000),	
			new SSD(1000000),
			new CDROM(300000),
			new Mouse(150000),
			new KeyBoard(200000),
			new Monitor(2000000)
		);
		pc.showDetails();
		PCReportGenerator report = new PCReportGenerator();
        	report.generateReport(pc);
	}
}
