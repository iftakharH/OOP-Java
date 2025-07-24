public class Main {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("ACC001", "John Doe", 1000.0);
        
        System.out.println("Initial Account Information:");
        account.displayAccountInfo();
        
        // Deposit money
        System.out.println("\nDepositing $500...");
        if (account.deposit(500)) {
            System.out.println("Deposit successful!");
        }
        account.displayAccountInfo();
        
        // Withdraw money
        System.out.println("\nWithdrawing $200...");
        if (account.withdraw(200)) {
            System.out.println("Withdrawal successful!");
        }
        account.displayAccountInfo();
        
        // Try invalid withdrawal
        System.out.println("\nTrying to withdraw $2000...");
        if (!account.withdraw(2000)) {
            System.out.println("Withdrawal failed: Insufficient balance!");
        }
        
        // Demonstrate encapsulation - direct access to private fields is not allowed
        // account.balance = -100; // This would cause compilation error
        System.out.println("\nFinal balance: $" + account.getBalance());
    }
}