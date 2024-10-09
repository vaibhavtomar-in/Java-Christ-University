public class Bank{
private int accountNo;
private float balance;
private String name;
private String email;
Bank(int accountNo, float balance, String name, String email){
	this( accountNo,  balance,  name);
this.email = email;
}
Bank (int accountNo, float balance, String name){
	this.accountNo = accountNo;
this.balance = balance;
this.name = name;
System.out.println("3 param constructor called");

}
public String getName(){
return name;
}
public String getEmail(){
return email;
}
public int getAccountNumber(){
return accountNo;
}
public float getBalance(){
return balance;
}
public void setName(String name){
this.name = name;
}
public void setEmail(String email){
this.email = email;
}
public void setAccountNo(int accountNo){
this.accountNo = accountNo;
}
public void setBalance(float balance){
System.out.println("trying to set " + this.name + "\'s balance to " + balance );
if (balance<0){
System.out.println("balance cannot be negative");
}
else{
this.balance = balance;
}
}

public void deposit(int deposit){
System.out.println("current balance of "+ this.name + " is "+ this.balance);
System.out.println("deposit amount is " + deposit);
switch(deposit){
case 5000,10000,15000 -> {this.balance +=deposit;
System.out.println("money deposited successfully");
System.out.println("current balance of "+ this.name + " is "+ this.balance);
}
default -> {System.out.println("can only deposit 5000, 10000, 15000");}
}


}

public void withdraw(int withdraw){
if(withdraw<=balance){
this.balance -= withdraw;
System.out.println("current balance of "+ this.name + " is "+ this.balance);
System.out.println("money withdrawn successfully");
System.out.println("current balance of "+ this.name + " is "+ this.balance);
}
else{
System.out.println("Insufficient funds");
}
}
public static void main(String args[]){
Bank obj1 = new Bank(1, 100, "vaibhav", "qwrwe");
Bank obj2 = new Bank(2, 200, "siyona", "fsdg");
obj1.deposit(100);
obj1.deposit(5000);
obj2.withdraw(100);
obj1.setBalance(-2);
}
}
