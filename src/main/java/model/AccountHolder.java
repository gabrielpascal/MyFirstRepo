package model;

import java.util.List;

/**
 * Created by gpascal on 4/6/2017.
 */
public class AccountHolder implements Printable {
    public String name;
    public Account [] accountList;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccountList() {
        return accountList;
    }

    public void setAccountList(Account[] accountList) {
        this.accountList = accountList;
    }

    public void printInstance() {
        System.out.println(" din clasa account holder afisam numele " + this.getName());

    }
}
