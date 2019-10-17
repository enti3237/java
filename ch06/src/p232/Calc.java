package p232;

public class Calc {
	//정사각형의 넓이
	public double areaRec(double width) {
		return width * width;
	}

	//직사각형의 넓이 (오버로드 메소드)
	public double areaRec(double width, double height) {
		return width * height;
	}
}
