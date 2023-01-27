package in.co.oop;



public class automobile3 {
private String color;
private String make;
private int model;

public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public void setGears(String gears) {
	Gears = gears;
}
private String Gears;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getGears() {
	return Gears;
}
public int getGears(int gears) {
	switch (gears) {
	case 1:
		System.out.println("speed is 0-20");
		break; 
	case 2 :
		System.out.println("speed is 20-40");
break;


	case 3 :
		System.out.println("speed is 40-60");
break;

	case 4 :
		System.out.println("speed is 60-80");
break;

	case 5 :
		System.out.println("speed is 80-100 ");
break;

default:
	case 6 :
		System.out.println("out of the range");
break;

}
	return gears;
}
}