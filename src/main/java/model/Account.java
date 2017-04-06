package model;

/**
 * Created by gpascal on 4/6/2017.
 */
public abstract  class Account {
    private String description;
    private String iban;
    private int balance;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String description, String iban, int balance) {
        this.description = description;
        this.iban = iban;
        this.balance = balance;
    }
}
