import com.sun.org.apache.xpath.internal.operations.And;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        ContactManager myContactManager = new ContactManager();

        Contact Andrew = new Contact();
            Andrew.name = "Andrew";
            Andrew.email = "andrew@gmail.com";
            Andrew.phoneNumber = "0-800-700-601";
        myContactManager.addContact(Andrew);

        Contact Monica = new Contact();
        Monica.name = "Monica";
        Monica.email = "Bella@vita.com";
        Monica.phoneNumber = "08-1300-6001";
            myContactManager.addContact(Monica);

        Contact Justinn = new Contact();
        Justinn.name = "Justin";
        Justinn.email = "Timberlake@yahoo.com";
        Justinn.phoneNumber = "0-550-730-2201";
            myContactManager.addContact(Justinn);

        Contact Mark = new Contact();
        Mark.name = "Mark";
        Mark.email = "mantonov@rus.com";
        Mark.phoneNumber = "0-999-756-101";
            myContactManager.addContact(Mark);

//        Searching contacts
        Contact result = myContactManager.searchContact("Justin");
        System.out.printf(result.email);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}