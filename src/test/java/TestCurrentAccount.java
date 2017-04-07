import model.Account;
import model.CurrentAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gpascal on 4/7/2017.
 */
public class TestCurrentAccount {
    @Test
    public void testCurrentAccountCreation()
    {
        Account a = new CurrentAccount("curent account", "ibanul pt crt",123);
        assertEquals("curent account",a.getDescription());
        assertEquals("ibanul pt crt",a.getIban());
        assertEquals(123,a.getBalance());
    }

}
