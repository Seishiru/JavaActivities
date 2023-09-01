public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 1000.00, "John Doe", "john@example.com", "123-456-7890");
        
        System.out.println("Account information:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Initial Balance: $" + account.getAccountBalance());

        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(800.00);  // This should display an insufficient funds message.
    }
}
