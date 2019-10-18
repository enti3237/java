package exam;

public class Account20 {
	//필드
	private String ano;
	private String owner;
	private int balance;
	
	//생성자
	public Account20(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//메소드
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getowner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}

}
