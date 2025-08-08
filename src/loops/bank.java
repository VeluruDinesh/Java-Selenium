package loops;

public class bank {
	private int withdraw;
	private int deposit;
	public int Balance=500000;
	public int getWithdraw(){
		return withdraw;
			
	}
	public void setWithdraw(int newWithdraw) {
		this.withdraw=newWithdraw;
		if(newWithdraw <= Balance) {
			Balance-=newWithdraw;
			System.out.println("Your Balance : "+ Balance);
		}
		else{
			System.out.println("insufficent balanace");
		}
	
	}
	public int getDeposit(){
		return deposit;
		
		
	}
	public void setDeposit(int newDeposit) {
		this.deposit=newDeposit;
		if(newDeposit <= Balance) {
			Balance+=newDeposit;
			System.out.println("Your Balance : "+ Balance);
		}
		else{
			System.out.println("insufficent balanace");
		}
		
	}
	

	public static void main(String[] args) {
		bank Myobj=new bank();
		Myobj.setWithdraw(10000);
		Myobj.setDeposit(28000);


		}

}
