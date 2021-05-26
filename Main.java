package com.company;
import java.util.Scanner;

/**
 *creating object for Client and account and bank
 */
public class Main {
    /**
     * Function that representing all operation want User perform
     */
    public static void Menu()
    {
        System.out.println("""
                1- Add New Client
                2- list All Client and his account
                3- deposit
                4-Withdraw
                5-Exit""");
    }

    static int balance = 0, money = 0, Process = 0;
    static String phone = "", Address = "", name = "", typeClient = "", typeAccount = "";
    static String national_Id = "";
    static String Commercial_Id = "";
    static int AccountNumber =345;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank("QNB", "14-Eltahrer-Dokki", "19666");
        while (true)
        {
            System.out.println("Welcome to QNB Bank");
            Menu();
            int option = input.nextInt();
            if (option == 1)
            {
                while(true)
                {
                    System.out.println("What is type of client ");
                    typeClient = input.next();
                    System.out.println("What is type of Account");
                    typeAccount = input.next();
                    if (typeClient.equalsIgnoreCase("client"))
                    {
                        System.out.println("What is national Id ");
                        national_Id = input.next();
                        break;
                    }
                    else if (typeClient.equalsIgnoreCase("commercialClient"))
                    {
                        System.out.println("What is Commercial Id");
                        Commercial_Id = input.next();
                        break;
                    }
                    else
                    {
                        System.out.println("Please Enter correct typeClient and typeAccount "+"\n");
                    }
                }
                System.out.println("What is name ");
                name = input.next();
                System.out.println("What is Address ");
                Address = input.next();
                System.out.println("What is phone ");
                phone = input.next();
                System.out.println("What is balance");
                balance = input.nextInt();
                AccountNumber+=19;
                if (typeAccount.equalsIgnoreCase("Account") & typeClient.equalsIgnoreCase("client"))
                {
                    Account account = new Account(balance, AccountNumber);
                    Client client = new Client(name, national_Id, Address, phone, account);
                    bank.AddClient(account, client);

                }
                else if (typeAccount.equalsIgnoreCase("specialAccount") & typeClient.equalsIgnoreCase("commercialClient"))
                {
                    SpecialAccount account = new SpecialAccount(balance, AccountNumber);
                    CommercialClient client = new CommercialClient(name, Address, phone, account, Commercial_Id);
                    bank.AddClient(account, client);

                }
                else if (typeAccount.equalsIgnoreCase("Account") & typeClient.equalsIgnoreCase("commercialClient"))
                {
                    Account account = new Account(balance, AccountNumber);
                    CommercialClient client = new CommercialClient(name, Address, phone, account, Commercial_Id);
                    bank.AddClient(account, client);

                }
                else if (typeAccount.equalsIgnoreCase("specialAccount") & typeClient.equalsIgnoreCase("client"))
                {
                    SpecialAccount account = new SpecialAccount(balance, AccountNumber);
                    Client client = new Client(name, national_Id, Address, phone, account);
                    bank.AddClient(account, client);

                }
                else
                {
                    System.out.println("Error");
                }
            }
            else if (option == 2)
            {
                bank.DisPlay();
            }
            else if (option == 3 || option == 4)
            {
                if (option == 3)
                {
                    System.out.println("Please Enter How much Money you need deposit and account Number");
                    money = input.nextInt();
                    AccountNumber = input.nextInt();
                }
                if (option == 4)
                {
                    System.out.println("Please Enter How much Money you need Withdraw and account Number");
                    money = input.nextInt();
                    AccountNumber = input.nextInt();
                }

                if (typeAccount.equalsIgnoreCase(" Account") & typeClient.equalsIgnoreCase("client")) {
                    Account account = new Account(balance, AccountNumber);
                    Client client = new Client(name, national_Id, Address, phone, account);
                    bank.AddClient(account, client);
                    Process = (option == 3) ? account.deposit(money, AccountNumber) : account.withdraw(money, AccountNumber);

                } else if (typeAccount.equalsIgnoreCase("SpecialAccount") & typeClient.equalsIgnoreCase("CommercialClient")) {
                    SpecialAccount account = new SpecialAccount(balance, AccountNumber);
                    CommercialClient client = new CommercialClient(name, Address, phone, account, Commercial_Id);
                    bank.AddClient(account, client);
                    Process = (option == 3) ? account.deposit(money, AccountNumber) : account.withdraw(money,AccountNumber);
                } else if (typeAccount.equalsIgnoreCase("Account") & typeClient.equalsIgnoreCase("CommercialClient")) {
                    Account account = new Account(balance, AccountNumber);
                    CommercialClient client = new CommercialClient(name, Address, phone, account, Commercial_Id);
                    bank.AddClient(account, client);
                    Process = (option == 3) ? account.deposit(money, AccountNumber) : account.withdraw(money, AccountNumber);

                } else if (typeAccount.equalsIgnoreCase("SpecialAccount") & typeClient.equalsIgnoreCase("client")) {
                    SpecialAccount account = new SpecialAccount(balance, AccountNumber);
                    Client client = new Client(name, national_Id, Address, phone, account);
                    bank.AddClient(account, client);
                    Process = (option == 3) ? account.deposit(money, AccountNumber) : account.withdraw(money, AccountNumber);
                } else {
                    System.out.println("Error");
                }


            }
            else if (option == 5) {
                System.out.println("thank you for use QNB bank System");
                System.exit(0);
            }


        }


    }
}

