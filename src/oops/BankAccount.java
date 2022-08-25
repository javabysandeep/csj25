package oops;

public class BankAccount {
    int accountNumber;
    int customerId;
    String accountHolderName;
    String accountType;
    float accountBalance;
    String branch;
    static String bankName ="Bank of Mallya";
    static int rateOfInterest=5;

    float checkBalance(int accountNumber, int customerId){
        if(this.accountNumber==accountNumber && this.customerId==customerId){
            return accountBalance;
        }
        return -1;
    }
    static String displayBankName(){
//        int bankNumber = accountNumber;
        return bankName;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 1;
        bankAccount.customerId = 101;
        bankAccount.accountHolderName="cyber success";
        bankAccount.accountType="current";
        bankAccount.branch="Deccan";
        bankAccount.accountBalance= 100;
        System.out.println(bankAccount.checkBalance(2,101));

        //calling static method
        String bankName = BankAccount.displayBankName();
        System.out.println("Bank name "+bankName);
    }
}











