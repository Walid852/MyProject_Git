package com.company;
import java.util.ArrayList;
/**
 * @author Mostfa Abdelsalam Abdelbaseer
 * @version 1.1
 * @since 2021
 */

/**
 * class describe system for bank and have clientList an his accountList
 */
public class Bank {
    private String name;
    private String address;
    private String phone;
    public ArrayList<Account> accountList = new ArrayList<Account>();
    public ArrayList<Client> clientList = new ArrayList<Client>();

    /**
     * empty constructor put initianl values for bank class parameter
     */
    public Bank() {
        name = "No Name";
        address = "No address";
        phone = "0000000000";

    }

    /**
     * parameterize constructor initianlizes All parameters in Bank class
     *
     * @param name        describe Bank name
     * @param address     describe Bank address
     * @param PhoneNumber describe Bank phone number
     */
    public Bank(String name, String address, String PhoneNumber)
    {
        this.name = name;
        this.address = address;
        phone = PhoneNumber;
    }
    /**
     * To initialize and Update for Bank Name
     *
     * @param name describe Bank name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * To initialize and Update for Bank adress
     *
     * @param address describe Bank adress
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    /**
     * To initialize and Update for Bank phone
     *
     * @param phonenumber describe Bank phone number
     */
    public void setPhone(String phonenumber)
    {
        this.phone = phonenumber;
    }
    /**
     * display Bank name
     *
     * @return Name for Bank
     */
    public String getName()
    {
        return name;
    }
    /**
     * display Bank adress
     *
     * @return adress for Bank
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * display Bank phone number
     *
     * @return phone for Bank
     */
    public String getPhone()
    {
        return phone;
    }
    /**
     * create client and add ClientList and his account and add AccountList
     * @param account  adding account to accountList
     * @param client   adding client to clientList
     */
    public void AddClient(Account account, Client client)
    {
        accountList.add(account);
        clientList.add(client);
    }
    /**
     * display all information for all client
     */
    public void DisPlay()
    {
        for (int i = 0; i < clientList.size(); i++)
        {
            System.out.println(clientList.get(i));
            System.out.println(accountList.get(i));
        }
    }
}