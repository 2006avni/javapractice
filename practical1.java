class Account{
int acc_no;
String name;
double amount;
Account(int acc_no, String name, double amount)
{
System.out.println("Constructing cube");
this.acc_no=acc_no;
this.name=name;
this.amount=amount;
System.out.println("Account="+acc_no + "Name="+name + "Amount="+amount);
}
}
public class practical1{
public static void main(String[] args){
Account acc = new Account(101,"Rahul",5000);
}
}

