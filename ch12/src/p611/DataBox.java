package p611;

public class DataBox {
	
	private String data;
	
	public synchronized String getData() throws Exception {
		if(this.data == null) {
			wait();
		}

		String rVal = data;
		System.out.println("컨슈머 스레드가 읽은 데이터: " + rVal);
		data = null;
		notify();
		return rVal;
	}
	
	public synchronized void setData(String data) throws Exception {
		if(this.data != null) {
			wait();
		}
		
		this.data = data;
		System.out.println("프로듀서 스레드가 생성한 데이터 : " +data);
		notify();
	}
}