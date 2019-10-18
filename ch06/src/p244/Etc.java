package p244;

public class Etc {
	private static Etc instance = new Etc();
	
	private Etc() {}
	
	public static Etc getInstance() {
		return instance;
	}
}
