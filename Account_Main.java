class Account{
    public void showAccount(int accountNumber){
        System.out.println("accountnumber="+accountNumber);

    }
}
class SavingAccount extends  Account{
    public void showSavingDetails(double interstRate){
        System.out.println(" interstRate="+ interstRate);
    }
}
class FixedDepositAccount extends SavingAccount{
    public  void lockInYear(int lockInYear){
        System.out.println("lockinyear="+lockInYear);
    }
}
public class Account_Main {
    public static void main(String[] args) {
        FixedDepositAccount f=new FixedDepositAccount();
        f.showAccount(123445);
        f.showSavingDetails(300000);
        f.lockInYear(2026);

        
    }
    
}
