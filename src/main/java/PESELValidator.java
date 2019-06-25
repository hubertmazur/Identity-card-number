public class PESELValidator {

    private static final int[] WEIGHTS = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};

    public Boolean validate (String PESEL) {
      PESEL = PESEL.trim();
      if (!PESEL.matches("[0-9]{11}")) {
          return false;
      }
      int temp = 0;
        for (int i = 0; i < WEIGHTS.length; i++) {
            int weight = WEIGHTS[i];
            int digit = Character.digit(PESEL.charAt(i), 10);
            temp += weight * digit;
        }
       int lastDigit = Character.digit(PESEL.charAt(PESEL.length()-1),10);

        return  temp % 10 == lastDigit;
    }


}
