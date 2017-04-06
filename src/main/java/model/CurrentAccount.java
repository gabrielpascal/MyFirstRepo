package model;

/**
 * Created by gpascal on 4/6/2017.
 */
public class CurrentAccount extends Account implements Printable {
    public CurrentAccount(String description, String iban, int balance) {
        super(description, iban, balance);
    }
    private boolean overdraft;

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }

    public void printInstance() {
        System.out.println("afisam din clasa current account" + "\n description " + this.getDescription() + "\n iban " + this.getIban() + "\n balanta " + this.getBalance());
        if (isOverdraft())
        {
            System.out.println("overdraft true ");
        }
    }
}
