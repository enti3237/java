package p611;

public class DataBox {
	
	private String data;
	
	public synchronized String getData() throws Exception {
		if(this.data == null) {
			wait();
		}

		String rVal = data;
		System.out.println("������ �����尡 ���� ������: " + rVal);
		data = null;
		notify();
		return rVal;
	}
	
	public synchronized void setData(String data) throws Exception {
		if(this.data != null) {
			wait();
		}
		
		this.data = data;
		System.out.println("���ε༭ �����尡 ������ ������ : " +data);
		notify();
	}
}