public class BankAccount {
/*Task:
Create a BankAccount class with the following attributes and methods:

Attributes:
account_holder (name of the account holder)
balance (account balance, initially set to 0)
Methods:
deposit(amount): Adds the specified amount to the balance.
withdraw(amount): Subtracts the specified amount from the balance if there are sufficient funds, otherwise print a message saying "Insufficient funds."
get_balance(): Returns the current balance. */

    String account_holder;
    int balance = 0;
    int withdrawal = 0;
    int deposition;


    void depositAmmount() {
        balance += deposition;
        System.out.println(balance);
    }

    void withdrawAmmount() {
        balance -= withdrawal;
        System.out.println(balance);
    }
    void showAmmount() {
        System.out.println(balance);
    }
}
