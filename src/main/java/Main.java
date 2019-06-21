import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CheckingIDCardNumber checkingIDCardNumber = new CheckingIDCardNumber();
        int validation = 0;
        System.out.println("===Program sprawdza poprawność nr dowodu osobistego===");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Wprowadz serię i numer dowodu osobistego: ");
            String IDNumber = sc.nextLine();

            if (checkingIDCardNumber.verification(IDNumber)) {
                System.out.println("Twój nr dowodu osobistego jest poprawny.");
            }
            else {
                System.out.println("Wprowadzono błędne dane ! Spróbuj jescze raz.");
                validation++;
            }
            if (validation == 5 ) {
                System.out.println("Wprowadzono błędne dane " + validation + " razy. Program kończy swoje działanie.");
                System.exit(0);
            }
        }
    }
}
