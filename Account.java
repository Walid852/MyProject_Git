package com.company;

/**
 * @author adham mohamed gomaa
 * @versoin 1.1
 */

/**
 * class Account which have private members balance and account_number
 */
public class Account {
    /**
     * Attribute describe how much money has a client
     */
    protected int balance;
    /**
     * it is unique number for each client
     */
    protected int account_number;
    /**
     * parameterized constructor sets the balance and the account_number
     * @param balance        of the account
     * @param account_number the number of the account
     */
    public Account(int balance, int account_number)
    {
        this.balance = balance;
        this.account_number = account_number;
    }
    /**
     * default constructors
     */
    Account()
    {}
    /**
     * set functions the balance
     * @param balance describe  money has a client
     */
    public void set_balance(int balance) {
        this.balance = balance;
    }
    /**
     * set functions the account_number
     * @param account_number value set in account_number
     */
    public void set_account_number(int account_number)
    {
        this.account_number = account_number;
    }

    /**
     * get functions to get account_number
     * @return  the account_number
     */
    public int get_account_number()
    {
        return this.account_number;
    }
    /**
     * get functions to get balance
     * @return the balance
     */
    public int get_balance()
    {
        return this.balance;
    }
    /**
     * the to_string function of the parent class
     * @return and display the balance adn the account_number
     */
    public String toString() {
        return "balance: "+balance+"\n"+"AccountNumber: "+account_number+"\n";
    }
    /**
     * deposit function to add money to the balance
     *
     * @param money to be added to the balance
     * @param account_number that will deposit
     * @return balance value updated with money
     */
    int deposit(int money, int account_number)
    {
        if (money != 0)
        {
            balance += money;
            this.account_number = account_number;
            System.out.println("deposit = " + balance);
        }
        return balance;
    }
    /**
     * function withdraw to get money from the balance of the account
     *
     * @param money is the value withdrawn from the account
     * @param account_number that will Withdraw
     * @return true if the parameter passed can be withdrawn else return false
     */
    int withdraw(int money, int account_number)
    {
        this.account_number = account_number;
        if (money != 0 && money <= balance)
        {
            this.balance -= money;
            System.out.println("withdraw = " + balance);
        }
        else
        {
            System.out.println("not enough Money" );
        }
        return balance;
    }
}

