package in.co.oop;

public class automobile2 {
	private String color;
	private int speed;
	private String make;
	private String break1;
	private String accelerator;
	private 
	public String setBreak2 (){
		return break1;
	}
	public void setBreak1(String break1) {
		this.break1 = break1;
	}
	public String getAccelerator() {
		return accelerator;
	}
	public void setAccelerator(String accelerator) {
		this.accelerator = accelerator;
	}
	private int $NO_OF_GEARS ;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int get$NO_OF_GEARS() {
		return $NO_OF_GEARS;
	}
	public void set$NO_OF_GEARS(int $no_OF_GEARS) {
		$NO_OF_GEARS = $no_OF_GEARS;
		
		if(speed<=30) {
			System.out.println(1);
		}
		
	}
	

}
