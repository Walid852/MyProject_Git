package com.company;

/**
 * @author Walid Mohamed Ibrahim
 * @version 1.1
 * @since 2021
 */

/**
 * Class that represent all personal information
 */
public class Client {
    protected String Name;
    protected String NationalID;
    protected String Address;
    protected String Phone;
    protected Account account;

    /**
     * parameterize constructor initializes All parameters in Client class
     * @param name describe Client name
     * @param NationalID describe Client NationalID
     * @param Address describe Client Address
     * @param Phone describe Client phone
     * @param account  object from class Account have two attributes(balance,account number)and describe Client account
     */
    public Client(String name, String NationalID, String Address, String Phone,Account account)
    {
        this.Name=name;
        this.NationalID=NationalID;
        this.Address=Address;
        this.Phone=Phone;
        this.account=account;
    }

    /**
     *default constructors to put default value
     */
    Client()
    {
        this.Name="no name";
        this.NationalID="00000000000";
        this.Address="no Address";
        this.Phone="no Phone";
    }
    /**
     * To initialize and Update for client Name
     * @param name describe Client name
     */
    public void SetName(String name)
    {
        this.Name=name;
    }
    /**
     * display Client name
     * @return Name for client
     */
    public String GetName()
    {
        return this.Name;
    }
    /**
     * To initialize and Update for client NationalId
     * @param NationalId describe Client NationalID
     */
    public void SetNationalID(String NationalId)
    {
        this.NationalID=NationalId;
    }
    /**
     * display Client NationalId
     * @return NationalId for client
     */
    public String GetNationalID()
    {
        return this.NationalID;
    }
    /**
     * To initialize and Update for client Address
     * @param Address describe Client Address
     */
    public void SetAddress(String Address)
    {
        this.Address=Address;
    }
    /**
     * display Client Address
     * @return Address for client
     */
    public String GetAddress()
    {
        return this.Address;
    }
    /**
     * To initialize and Update for client Phone
     * @param Phone describe Client Phone
     */
    public void SetPhone(String Phone)
    {
        this.Phone=Phone;
    }
    /**
     * display Client Phone
     * @return Phone for client
     */
    public String GetPhone()
    {
        return this.Phone;
    }
    /**
     * To initialize and Update for client account
     * @param account describe Client account (balance,account number)
     */
    public void SetAccount(Account account)
    {
        this.account=account;
    }
    /**
     * display Client account
     * @return account for client
     */
    public Account GetAccount()
    {
        return this.account;
    }

    /**
     * function override from parent function toString in class object
     * @return All information for client
     */
    @Override
    public String toString()
    {
        return "Name: "+Name+"\n"+"NationalID: "+NationalID+"\n"+"Address: "+Address+" \n"+"Phone: "+Phone+"\n";
    }
}


