import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MembersMenu memberinfo = new MembersMenu();
    ArrayList<String> discipliner = new ArrayList<>();


    public static void main(String[] args) {

        boolean quit1 = false;
        startApp();
        printActions();
        while (!quit1) {
            System.out.print("\nEnter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit1 = true;
                    break;
                case 1:
                    memberinfo.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    printActions();
                    break;

                case 4:
                    break;

                // *************************** // to comming soon // *********************** //

            }

        }


    }


    private static void addNewContact() {
        boolean hold = true;


        System.out.println("Enter new member first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter new member last name: ");
        String lastName = scanner.nextLine();


        System.out.println("Enter new member age: ");
        int age = scanner.nextInt();

        System.out.println("Are you activ ? (true or false) ");
        Boolean activPassiv = scanner.nextBoolean();

        System.out.println("Are you konkurren ?  (true or false)");
        boolean konkurrent = scanner.nextBoolean();
        //printDisciplin();

        Members newMembers = Members.createMember(firstName, lastName, activPassiv, age, hold, konkurrent);


        if (memberinfo.addNewMember(newMembers)) {
            System.out.println("New member added.\n"
                + "---------------- \n" + "Name: " + newMembers.getFullName() +
                "\nAge: " + age +
                "\n");
        } else {
            System.out.println("Cannot add, " + lastName + " already on file");
        }


        // cette partie display quand ont est activ ou passiv
        System.out.println(firstName + newMembers.setActivOrPassiv());

        // cette partie diplay l'age ( senior ou junior)
        System.out.println(firstName + newMembers.setAge());

        // cette partie fais refference sur le prix a paye pour etre membre.
        System.out.println(firstName + " must pay " + newMembers.setPrix());

        System.out.println(firstName + " " + newMembers.setHold());

        // System.out.println(firstName+ " " + newDisciplin);
        // System.out.println(firstName + " is " + newMembers.getTypeOf());


    }

    //*************************** Menu **********************************//
    private static void startApp() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println
            ("------------------------------------------------ \n" +
            "0  - to shutdown\n" +
            "1  - to print members\n" +
            "2  - to add a new member\n" +
            "3  - to print a list of available actions.\n" +
            "-------------------------------------------------");
        System.out.print("Choose your action: ");
    }


}


