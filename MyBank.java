class MyAccount{
int accNo;
double balance;
MyAccount(){
	System.out.println("In constructor");
}
}
class MyBank{
public static void main(String[] args){
MyAccount ma= new MyAccount();
System.out.println("Balance="+ma.balance);
}
}