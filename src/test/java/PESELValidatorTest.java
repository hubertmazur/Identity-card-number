import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PESELValidatorTest {

     PESELValidator peselValidator;

    @Before
    public void setup () {
        peselValidator = new PESELValidator();
    }
    @Test
    public void test_lower_length() {
        String PESEL = "1234567890";
        assertFalse(peselValidator.validate(PESEL));
    }
    @Test
    public void test_higher_length() {
        String PESEL = "1234567890123456";
        assertFalse(peselValidator.validate(PESEL));
    }
    @Test
    public void test_PESEL_not_consisting_of_digits() {
        String PESEL = "1234Z567890";
        assertFalse(peselValidator.validate(PESEL));
    }
    @Test
    public void test_correct_PESEL() {
        String PESEL = "90090515836";
        assertTrue(peselValidator.validate(PESEL));
    }
    @Test
    public void test_incorrect_PESEL() {
        String PESEL = "90090515837";
        assertFalse(peselValidator.validate(PESEL));
    }





}
