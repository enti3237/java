package p213;

public class Car {

	/* //필드
	private String company = "현대자동차";
	private String model;
	private String color;
	private String maxSpeed;
	
	//생성자
	public Car(String company, String model, String color, String maxSpeed) {
		this.company = company;
		this.model   = model;
		this.color   = color;
		this.maxSpeed= maxSpeed;
	} */

	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;

	public Car(){
	}
	
	public Car(String model){
		this(model, "은색", 250);
	}
	
	public Car(String model, String color){
		this(model, color, 250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model   = model;
		this.color   = color;
		this.maxSpeed= maxSpeed;
	}	
}
