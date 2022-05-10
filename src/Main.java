public class Main {
    
    public static void main(String[] args)  {
        BankAccount newBankAcctOne = new BankAccount(5000, "Larry");
        BankAccount newBankAcctTwo = new BankAccount(300, "Mary");
        // newBankAcctOne.withdraw(100);
        // newBankAcctTwo.deposit(100);  
        newBankAcctOne.transfer(newBankAcctTwo, 100);
        newBankAcctOne.accountDetails();
        newBankAcctTwo.accountDetails();
        
    }
}
