public class PC {
	private MotherBoard motherboard;
	private CPU cpu;
	private RAM ram;
	private SSD ssd;
	private CDROM cdrom;
	private Mouse mouse;
	private KeyBoard keyboard;
	private Monitor monitor;

	public PC(MotherBoard motherboard, CPU cpu, RAM ram, SSD ssd, CDROM cdrom, Mouse mouse, KeyBoard keyboard, Monitor monitor) {
		this.motherboard = motherboard;
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		this.cdrom = cdrom;
		this.mouse = mouse;
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
	

	public double calculateTotalPrice() {
		return motherboard.getPrice() + cpu.getPrice() + ram.getPrice() + ssd.getPrice() + cdrom.getPrice() + mouse.getPrice() + keyboard.getPrice() + monitor.getPrice();
	}

	public void showDetails() {
		System.out.println("--- Detail Komponen PC ---");
		System.out.println("Motherboard : " + motherboard.getPrice());
		System.out.println("CPU         : " + cpu.getPrice());
		System.out.println("RAM         : " + ram.getPrice());
		System.out.println("SSD         : " + ssd.getPrice());
		System.out.println("CD/DVD ROM  : " + cdrom.getPrice());
		System.out.println("Mouse       : " + mouse.getPrice());
		System.out.println("Keyboard    : " + keyboard.getPrice());
		System.out.println("Monitor     : " + monitor.getPrice());
		System.out.println("-----------------------------");
		System.out.println("Total Harga : " + calculateTotalPrice());
	}
	
	public void generateReport() {
		System.out.println("--- PC Build Report ---");
		System.out.println("CPU: " + this.cpu.getName());
		System.out.println("Motherboard: " + this.motherboard.getName());
		System.out.println("RAM: " + this.ram.getName());
		System.out.println("SSD: " + this.ssd.getName());
		System.out.println("CD/DVD ROM: " + this.cdrom.getName());
	 	System.out.println("Mouse: " + this.mouse.getName());
		System.out.println("Keyboard: " + this.keyboard.getName());
		System.out.println("Monitor: " + this.monitor.getName());
		System.out.println("-----------------------");
	}

}
