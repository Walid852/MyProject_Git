package com.company;
/**
 * special account class inherited from Account class
 */
public class SpecialAccount extends Account {
    /**
     * parameterized constructor for the child class sets the balance and the account_number
     * @param balance of the account
     ** @param account_number the number of the account
     */
    public SpecialAccount(int balance, int account_number)
    {
        super(balance, account_number);
    }
    /**
     * overrides the withdraw function from the parent class
     * @param money is the value withdrawn from the account
     * @param account_number that will Withdraw
     * @return true if the parameter passed can be withdrawn else return false
     */
    int withdraw(int money,int account_number)
    {
        int Balancee;
        Balancee=this.get_balance();

        if (money != 0 && money<=Balancee+1000)
        {

            Balancee = Balancee - money;
            System.out.println("withdraw= "+Balancee);
        }
        else
        {
            System.out.println("not have enough money");
        }
        return balance;
    }
}
