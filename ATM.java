import java.util.Scanner;

class BankAccount
{
    private double balance;
   
    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Transaction failed.\nInsufficient balance or invalid amount.");
        }
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Transaction successfull.\nDeposited: " + amount);
        }
        else
        {
            System.out.println("Transaction failed.\nInvalid amount.");
        }
    }

    public double checkBalance() 
    {
        return balance;
    }
}

public class ATM
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(500); 
        boolean exit = true;
    
        while (exit)
        {
            System.out.println("ATM Machine:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposite");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) 
            {
                System.out.println("Invalid input.\nPlease enter a number between 1 and 4.");
                scanner.next(); 
                System.out.print("Choose an option: ");
            }
            
            int choice = scanner.nextInt();
        
            switch (choice) 
            {                
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    while (!scanner.hasNextDouble()) 
                    {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); 
                        System.out.print("Enter amount to withdraw: ");
                    }
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    while (!scanner.hasNextDouble()) 
                    {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); 
                        System.out.print("Enter amount to deposit: ");
                    }
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.checkBalance());
                    break;
                case 4:
                    exit = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}