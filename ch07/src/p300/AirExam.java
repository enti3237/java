package p300;

import p299.SuperAir;

public class AirExam {
	public static void main(String[] args) {
		SuperAir sa = new SuperAir();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAir.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperAir.NORMAL;
		sa.fly();
		sa.land();
	}

}
