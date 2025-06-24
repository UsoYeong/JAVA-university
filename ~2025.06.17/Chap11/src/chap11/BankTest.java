package chap11;
class BankAccount {
	private int balance;
	
	public void deposit(int amount) {
		if (amount < 0) {
		balance += amount;

		} else {
			System.out.println("입금할 금액이 0 이하입니다.");
		}
	}
	
	public void withdraw(int amount) {
		if(balance > amount) {
		balance -= amount;
		} else {
			System.out.println("출금할 금액이 잔액보다 큽니다.");
		}
	}


	public int getBalance() {
		return balance;
	}
}
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount();
		
		acc.deposit(10000);
		acc.withdraw(5500);
		System.out.println("현재 잔액 : " + getBalance());

	}

	private static String getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

}
