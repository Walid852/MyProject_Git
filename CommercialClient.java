package com.company;

/**
 * @author Walid Mohamed Ibrahim
 * @version 1.1
 * @since 2021
 */

/**
 * Class extends from class client but that represent organization not personal
 * So that not have national id but have commercial id
 */
public class CommercialClient extends Client
{
    /**
     * commercialId is the same national id  but for organization
     */
    protected String commercialId;

    /**
     * parameterize constructor initializes All parameters in CommercialClient class
     * and call constructor for client constructor by super()
     * @param name describe name for organization
     * @param Address describe Address for organization
     * @param Phone describe Phone for organization
     * @param account object from class Account have two attributes(balance,account number)and describe organization account
     * @param commercialId describe commercialId for organization
     */
    CommercialClient(String name, String Address, String Phone,Account account,String commercialId)
    {
        super(name,"00000000000000", Address, Phone, account);
        this.commercialId=commercialId;
    }
    /**
     * * To initialize and Update for organization CommercialID
     * @param CommercialID describe ID number organization
     */
    void SetCommercialID(String CommercialID)
    {
        this.commercialId=CommercialID;
    }
    /**
     *  display organization CommercialID
     * @return CommercialID
     */
    String GetCommercialID()
    {
        return this.commercialId;
    }
    /**
     *function override from  function toString in class Client
     *@return All information for organization
     */
    @Override
    public String toString()
    {
        return "Name: "+Name+" \n"+"CommercialID: "+commercialId+" \n"+"Address: "+Address+"\n"+"Phone: "+Phone+" \n";
    }
}