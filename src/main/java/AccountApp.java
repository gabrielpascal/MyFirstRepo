import model.Account;
import model.AccountHolder;
import model.CurrentAccount;
import model.SavingsAccount;

/**
 * Created by gpascal on 4/6/2017.
 */
public class AccountApp {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        AccountHolder myIon = new AccountHolder();

        myIon.setName("James Bond");

        myIon.accountList = new Account[3];

        //System.out.println("afisez numele sper " + myIon.getName());
        CurrentAccount aaa = new CurrentAccount("cont curent Bond","ibanBond", 999);
        aaa.setOverdraft(true);
        //for (Account account : myIon.accountList ) myIon.accountList = new SavingsAccount("cont curent", "ceva iban", 123);
        SavingsAccount a = new SavingsAccount("saving account for MAry","ibanulM", 123);
        a.setInterestRate(2.50);

        SavingsAccount b = new SavingsAccount("saving account for John","ibanulJ", 321);
        b.setInterestRate(3.40);

        myIon.accountList[0]=aaa;
        myIon.accountList[1]=a;
        myIon.accountList[2]=b;

        myIon.printInstance();

        for (Account account : myIon.accountList) {
            account.printInstance();


        }


    }
}
