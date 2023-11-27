package com.example.jillela_700743343_hw3;

/*Create main method, follow these steps:

        Create a Bank object with the values "Ranjanish", "524305", and a balance of 30000.

        Call the deposit_money method with the amount 1000.

        Call the deposit_money method with the amount -1000 and handle the NegativeDepositException appropriately.

        Call the getBalance method to get the updated balance after the first deposit.

        Call the withdraw_money method with the amount 50000 and handle the InsufficientBalanceException appropriately.

        Call the withdraw_money method with the amount 20000 and handle the InsufficientBalanceException appropriately.

        Call the getBalance method to get the updated balance after the valid withdrawal.

        Ensure that appropriate exception handling is implemented throughout the main method to handle any potential
        exceptions that may arise during the operations.*/


        /*
        Create repo in git  give public access

        */

public class Customer {
        public static void main (String[] args){
                try {
                        //Create a Bank object with the values "Ranjanish", "524305", and a balance of 30000.
                        Bank myBankAccount = new Bank("Ranjanish", "524305", 30000);
                        //Call the deposit_money method with the amount 1000.
                        myBankAccount.depositmoney(1000);
                        
                //Call the deposit_money method with the amount -1000 and handle the NegativeDepositException appropriately.
                try {
                        myBankAccount.depositmoney(-1000);        
                }
                catch (NegativeDepositException e){
                        System.out.println("\nException during deposit: " +e.getMessage());
                }
                //Call the getBalance method to get the updated balance after the first deposit.
                System.out.println("\nUpdated balance after Deposit is: " +myBankAccount.getBalance());
                
                try {
                //Call the withdraw_money method with the amount 50000 and handle the InsufficientBalanceException appropriately.
                myBankAccount.withdrawmoney(50000);
                }
                catch (InsufficientBalanceException e)
                {
                        System.out.println("\nException during Withdrawal: " +e.getMessage());
                }
                try 
                {
                   //Call the withdraw_money method with the amount 20000 and handle the InsufficientBalanceException appropriately.
                        myBankAccount.withdrawmoney(20000);
                }
                catch (InsufficientBalanceException e)
                {
                        System.out.println("\nException during Withdrawal: " +e.getMessage());
                }
                //Call the getBalance method to get the updated balance after the valid withdrawal.
                System.out.println("\nUpdated balance after the valid withdrawal: " +myBankAccount.getBalance());
        }
        catch (NegativeDepositException e)
        {
                System.out.println("\nException during deposit: " +e.getMessage());
        }
        }

}
