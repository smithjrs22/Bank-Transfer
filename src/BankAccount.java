public class BankAccount {
    //attributes
    private  double bankAccountBalance;
    private String accountHolderName;

    //Constructor 
    public BankAccount(double bankAccount, String accountHolder){
        this.bankAccountBalance = bankAccount;
        this.accountHolderName = accountHolder; 
    }

    public void deposit(double amountToDeposit){
        bankAccountBalance = amountToDeposit + bankAccountBalance;
    }

    public void withdraw(double amountToWithdraw){
        bankAccountBalance = bankAccountBalance - amountToWithdraw;
    }

    public void accountDetails(){
        System.out.println(accountHolderName + " account balance is " + bankAccountBalance);
    }

}
