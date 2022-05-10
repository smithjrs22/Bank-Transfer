public class BankAccount {
    //attributes
    private  double bankAccountBalance;
    private String accountHolderName;

    //Constructor 
    public BankAccount(double bankAccount, String accountHolder){
        this.bankAccountBalance = bankAccount;
        this.accountHolderName = accountHolder; 
    }

    // public void deposit(double amountToDeposit){
    //     bankAccountBalance = amountToDeposit + bankAccountBalance;
    // }
    public double deposit(double amountToDeposit){
        bankAccountBalance = amountToDeposit + bankAccountBalance;
        return amountToDeposit;

    }

    // public void withdraw(double amountToWithdraw){
    //     bankAccountBalance = bankAccountBalance - amountToWithdraw;
    // }
    public double withdraw(double amountToWithdraw){
        bankAccountBalance = bankAccountBalance - amountToWithdraw;
        return amountToWithdraw;
    }

    public void accountDetails(){
        System.out.println(accountHolderName + " account balance is " + bankAccountBalance);
    }

    public double transfer(BankAccount account, double amount){
        return account.deposit(this.withdraw(amount));
    }

}
