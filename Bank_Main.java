class BankAccount{
    private  String accountHolder="prnay";
    private  double balance=6777.00;
     public void getAccountHolder() {
        System.out.println("AccountHolder="+accountHolder);
    }
    public void getBalance(){
        System.out.println(" balance="+  balance);

    }
    public  void setAccountHolde(String s){
        accountHolder=s;
    }
     public  void setDalance(double n){
        balance=n;
    }
}
public class Bank_Main {
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.getAccountHolder();
        b.getBalance();
        b.setAccountHolde("uday");
        b.setDalance(999000);
        b.getAccountHolder();
        b.getBalance();

        
    }
    
}
