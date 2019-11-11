package p496;

import p495.Action;

public class NewInstanceExam {
	public static void main(String[] args){

		try {
			Class clazz = Class.forName(":D");
//			Class clazz = Class.forName(">:(");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
