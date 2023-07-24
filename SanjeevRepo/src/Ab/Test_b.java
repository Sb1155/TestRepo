package Ab;

public class Test_b {
	int id;
	String name;
	double bal;
	Test_b(int id,String name,double bal){
		this.id=id;
		this.name=name;
		this.bal=bal;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(bal);
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=bal) {
			bal=bal-amount;
			System.out.println(amount+ "/- withdraw successfully");
			System.out.println("current balance is "+bal+"/-");
		}
		else if(amount==0){
			System.out.println("invalid input");
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	public void deposit(double amt) {
		if(amt>0) {
			bal=bal+amt;
			System.out.println(amt+"/- successfully deposited");
			System.out.println("available balance is "+bal);
		}
		else {
			System.out.println("invalid input"+amt);
		}
	}
}


