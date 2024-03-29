import java.util.HashMap;
import java.util.Map;

public class CheckingIDCardNumber {

    private static final Map<Character, Integer> CONVERSION_OF_LETTERS_INTO_NUMBERS = new HashMap<>();
    private static  final int [] weight ={7,3,1,9,7,3,1,7,3};

    static {
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('A', 10);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('B', 11);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('C', 12);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('D', 13);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('E', 14);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('F', 15);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('G', 16);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('H', 17);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('I', 18);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('J', 19);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('K', 20);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('L', 21);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('M', 22);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('N', 23);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('O', 24);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('P', 25);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('Q', 26);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('R', 27);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('S', 28);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('T', 29);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('U', 30);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('V', 31);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('W', 32);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('X', 33);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('Y', 34);
       CONVERSION_OF_LETTERS_INTO_NUMBERS.put('Z', 35);
    }

    public  Boolean  verification (String IDCardNumber) {
      String IDNumber = IDCardNumber.toUpperCase().trim();
      IDNumber = IDNumber.replace(" ","");
      IDNumber = IDNumber.replace("-","");
      if (IDNumber.length()!=9) {
          return false;
      }
      char [] tab = IDNumber.toCharArray();
      int temp = 0;

       for (int i = 0; i < 3 ; i++) {
           if ( CONVERSION_OF_LETTERS_INTO_NUMBERS.containsKey(tab[i])) {
               int value = CONVERSION_OF_LETTERS_INTO_NUMBERS.get(tab[i]);
               temp = temp + (value*weight[i]);
           }
           else {
               return false;
           }
        }

        for (int i = 3; i < tab.length; i++) {
            if (Character.isDigit(tab[i])){
                int number = tab[i]-48 ;//ASCI
                temp = temp + (number*weight[i]);
            }
            else  {
                return false;
            }
        }

       if (temp % 10 == 0) {
           return true;
       }
       else {
           return false;
       }

    }
}
