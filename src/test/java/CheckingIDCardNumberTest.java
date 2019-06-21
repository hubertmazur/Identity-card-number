import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class CheckingIDCardNumberTest {
    CheckingIDCardNumber check;

    @Before
    public  void setup () {
        check = new CheckingIDCardNumber();
    }
    @Test
    public void good_identity_card_number () {
      String IDNumber = "CBY366082";
      assertTrue(check.verification(IDNumber));
    }
    @Test
    public void wrong_identity_card_number () {
        String IDNumber = "AAA366082";
        assertFalse(check.verification(IDNumber));
    }
    @Test
    public void short_number_of_the_ID_card () {
        String IDNumber = "A366082";
        assertFalse(check.verification(IDNumber));
    }
    @Test
    public void long_number_of_the_ID_card () {
        String IDNumber = "AAAA366082";
        assertFalse(check.verification(IDNumber));
    }
    @Test
    public void providing_numbers_in_the_series () {
        String IDNumber = "C1Y366082";
        assertFalse(check.verification(IDNumber));
    }
    @Test
    public void providing_letters_in_the_ID_card_number () {
        String IDNumber = "CBY36A082";
        assertFalse(check.verification(IDNumber));
    }
}
