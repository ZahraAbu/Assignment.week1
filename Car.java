package assignment2.week1;


public class Car {
public static void main(String[] args) {
	Car obj = new Car();
	String Break = obj.applyBreak();
	System.out.println(obj.applyBreak());
	String Gear = obj.applyGear();
	System.out.println(obj.applyGear());
	Boolean switchOn = obj.isSwitchOn();
	System.out.println(obj.isSwitchOn());
	String Accelerate = obj.applyAccelerate();
	System.out.println(obj.applyAccelerate());
}

	private String applyBreak() {
		return "Break Applied";
	}
	
	private String applyGear() {
		return "Gear Applied";
	}
	
	Boolean isSwitchOn() {
		return false;
		}
	
	private String applyAccelerate() {
		return "Accelerate Applied";
	}
	
}
	


