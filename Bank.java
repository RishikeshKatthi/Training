package com.example.jillela_700743343_hw3;

import javax.naming.InsufficientResourcesException;

/*
Please implement the `Bank` class with the following properties:
        1. `customerName`: A string representing the customer's name.
        2. `accountNumber`: A string representing the account number of the customer.
        3. `balance`: A numeric value representing the current balance in the account.

        Create getter methods for all three properties.

        Additionally, create two methods:

        1. `deposit_money(deposit_amount)`: This method takes an integer `deposit_amount` as a parameter and adds
        it to the balance. If the `deposit_amount` is negative, throw a custom exception called `NegativeDepositException`
        with the message "Deposit amount must be positive."

        2. `withdraw_money(withdrawal_amount)`: This method takes an integer `withdrawal_amount` as a parameter.
        If the account balance is greater than or equal to the `withdrawal_amount`, deduct the withdrawal amount from
        the balance. Otherwise, throw a custom exception called `InsufficientBalanceException` with the
        message "You don't have sufficient balance to withdraw [withdrawal_amount]. Your current balance is [balance]."
*/

class NegativeDepositException extends Exception{
        public NegativeDepositException(String message){
                super(message);
        }
}

class InsufficientBalanceException extends Exception{
        public InsufficientBalanceException(String message){
                super(message);
        }
}

public class Bank {
        private String customerName;
        private String accountNumber;
        private int balance;

        public Bank(String customerName, String accountNumber, int balance){
                this.customerName = customerName;
                this.accountNumber = accountNumber;
                this.balance = balance;        
        }

        public String getCustomerName(){
                return customerName;
        }
        public String getAccountNumber(){
                return accountNumber;
        }
        public int getBalance(){
                return balance;
        }

        public void depositmoney(int depositAmount) throws NegativeDepositException {
                if (depositAmount < 0){
                        throw new NegativeDepositException("Deposit amount must be positive.");
                }
                else 
               { balance += depositAmount;
                System.out.println("\nDesposit of " +depositAmount + " is Successful. \nNew balance is: " +balance);
                }
        }
        
         public void withdrawmoney(int withdrawalAmount) throws InsufficientBalanceException {
                if (balance >= withdrawalAmount){
                        balance -= withdrawalAmount;
                        System.out.println("\nWithdrawal of " +withdrawalAmount + " is Successful. \nNew balance is: " +balance);      
                }
                else 
                {
                throw new InsufficientBalanceException("\nYou don't have sufficient balance to withdraw " +withdrawalAmount + "\nYour current balance is: " +balance);
                }
        }
        public static void main(String[] args){
                Bank myAccount = new Bank("Rishikesh", "987654321", 1100);
                try {
                        myAccount.depositmoney(200);
                        myAccount.withdrawmoney(400);
                        myAccount.withdrawmoney(1000);
                }
                catch (NegativeDepositException | InsufficientBalanceException e){
                        System.out.println("\nException: " + e.getMessage());
                }
        }       
}
