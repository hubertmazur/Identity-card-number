import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        CheckingIDCardNumber checkingIDCardNumber = new CheckingIDCardNumber();
        PESELValidator validator = new PESELValidator();


        int counter = 0;
        int maximumNumberOfErrors = 5 ;

        while (counter  < maximumNumberOfErrors) {

            String input = JOptionPane.showInputDialog("Wprowadz nr dowodu osobistego bądz nr PESEL");
            if (checkingIDCardNumber.verification(input)) {
                JOptionPane.showMessageDialog(null, "Twój nr dowodu osobistego jest poprawny. ");
            }
            if (validator.validate(input)) {
                JOptionPane.showMessageDialog(null, "Twój nr PESEL jest poprawny.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Wprowadzono błędne dane lub " +
                        "wpropwadzony nr dowodu bądz PESEL jest nie poprwany.");
                counter++;

            }
        }

    }
}
