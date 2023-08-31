import java.util.Scanner;

class UserBankAccount {
    int account_number;
    int pin;
    int balance_amount;

    public UserBankAccount(int account_number, int pin) {
        this.account_number = account_number;
        this.pin = pin;
        this.balance_amount = 0;
    }
}

public class atm
{
    public static void withdraw(UserBankAccount account)
    {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your account number: ");
            int enteredAccountNumber = sc.nextInt();
            
            System.out.print("Enter your PIN: ");
            int enteredPIN = sc.nextInt();
            
            if (enteredAccountNumber == account.account_number && enteredPIN == account.pin)
            {
                System.out.print("Enter the amount to withdraw: Rs. ");
                int withdrawAmount = sc.nextInt();
                
                if (withdrawAmount > 0 && withdrawAmount <= account.balance_amount)
                    {
                    account.balance_amount -= withdrawAmount;
                    System.out.println("Withdrawal successful. Your new balance is: Rs. " + account.balance_amount);
                    }
                else
                    {
                    System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
            }
                else
                {
                System.out.println("Invalid account number or PIN. Please try again.");
                }
      //c.close();
    }

        
        


    public static void deposit(UserBankAccount account)
    {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your account number: ");
            int enteredAccountNumber = sc.nextInt();
            
            System.out.print("Enter your PIN: ");
            int enteredPIN = sc.nextInt();
            
            if (enteredAccountNumber == account.account_number && enteredPIN == account.pin) {
                System.out.print("Enter the amount to deposit: Rs. ");
                int depositAmount = sc.nextInt();
                
                if (depositAmount > 0)
                    {
                    account.balance_amount += depositAmount;
                    System.out.println("Deposit successful. Your new balance is: Rs. " + account.balance_amount);
                    }
                else
                    {
                    System.out.println("Invalid deposit amount. Please enter a positive amount.");
                    }
            }
            else
            {
                System.out.println("Invalid account number or PIN. Please try again.");
            }
      // sc.close();
    }


    public static void checkBalance(UserBankAccount account)
    {
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your account number: ");
            int enteredAccountNumber = sc.nextInt();
            
            System.out.print("Enter your PIN: ");
            int enteredPIN = sc.nextInt();
            
            if (enteredAccountNumber == account.account_number && enteredPIN == account.pin)
                {
                System.out.println("Your current balance is: Rs. " + account.balance_amount);
                }
            else
                {
                System.out.println("Invalid account number or PIN. Please try again.");
                }
                //1sc.close();
    }
    



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        UserBankAccount userAccount = new UserBankAccount(123456, 1234);

        while (true)
        {
            System.out.println("1] View login details\n2] View balance\n3] Deposit\n4] Withdraw\n5] Exit");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Account Number: " + userAccount.account_number);
                
                    break;
                case 2:
                    checkBalance(userAccount);
                    break;
                case 3:
                    deposit(userAccount);
                    
                    break;
                    
                case 4:
                    withdraw(userAccount);
                    
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

