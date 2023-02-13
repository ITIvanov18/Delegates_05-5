import java.util.ArrayList;
import java.util.Scanner;

//6
public class Main {
    public static void printData(ArrayList<DelegationCard> delegates) {
        System.out.println("Покажи всички данни!");
        for (DelegationCard h : delegates) {
            System.out.println(h.toString());
        }
    }


    //10
    public static void printDetailsAboutADelegateInSpecificRoom(ArrayList<DelegationCard> delegates, Scanner sc) {

        ArrayList<DelegationCard> newDelegates = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Въведете име на стая: ");
        String name = sc.nextLine();

        for (DelegationCard d : delegates) {
            if(d.getDelegate().getName().equals(name)) {
                newDelegates.add(d);
            }
        }

        for (DelegationCard d : newDelegates) {
            System.out.println(d.getHotel().toString());
        }
    }
    }
}
