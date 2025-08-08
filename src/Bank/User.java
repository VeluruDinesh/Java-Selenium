package Bank;
class User{
	private String User_Name;
	private int Account_Number;
	
	
	User(String name,int account) {
		this.User_Name=name;
		this.Account_Number=account;
		
		

	}
	public String getUser() {
		return User_Name;
	}
	public int getAccount() {
		return Account_Number;
	}

	
}