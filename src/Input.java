import java.util.Scanner;

public class Input {

    // final static variables
    private final static int MIN_BOUNDARY = 0;
    private final static int MAX_BOUNDARY = 5;
    private final static int SLEEP_SECONDS = 3;
    private final static int INTERRUPT_SECONDS = 1000;

    // primitives
    private boolean askForInput = true;
    private int inputNumber = 0;

    // objects
    private Scanner scanner;
    private String username;
    private DJ dj;


    // constructor
    public Input() {

        // initiate scanner once;
        this.scanner = new Scanner(System.in);
        System.out.println("Enter username");
        this.username = scanner.nextLine();
        System.out.println("Username is: " + username + "!!");

        // open menu
        this.openMenu();
    }

    // open the menu for user interaction
    private void openMenu() {

        // input loop
        while (askForInput) {

            this.printMenu();

            // try to parse input value to number
            this.inputNumber = this.parseInputToInt();
            if (this.inputNumber > this.MIN_BOUNDARY && this.inputNumber < this.MAX_BOUNDARY) {
                this.menu(this.inputNumber);
            } else {
                System.out.println("That was not a number between " + this.MIN_BOUNDARY + " and " + this.MAX_BOUNDARY + "...");
                System.out.println("Try again");
                continue;
            }
            // break loop
            askForInput = false;
        }
    }

    // print menu
    private void printMenu() {
        System.out.println("---Menu---");
        System.out.println("Number 1: Create DJ");
        System.out.println("Number 2: Enter Review");
        System.out.println("Number 3: Request Number");
        System.out.println("Number 4: Terminate Program");
        System.out.println("Choose a number between 1 and 4: ");
    }

    // menu to choose interaction
    private void menu(int number) {

        // switch based on input
        switch (number) {
            case 1:
                this.createDJ();
                break;
            case 2:
                this.enterReview();
                break;
            case 3:
                this.requestNumber();
                break;
            case 4:
                this.terminateProgram();
        }
    }

    private int parseInputToInt() {
        while (true) {
            try {
                int number = Integer.parseInt(this.scanner.next());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Number please, how hard can it be...");
            }
        }
    }

    // create a dj
    private void createDJ() {
        System.out.print("Set DJ Name: ");
        String djName = this.scanner.nextLine();
        System.out.print("DJ Name is: " + djName);

        System.out.print("Set DJ Age: ");
        int djAge = this.parseInputToInt();
        System.out.print("DJ Name is: " + djAge);

        System.out.print("Set DJ Style: ");
        String djStyle = this.scanner.nextLine();
        System.out.print("DJ Name is: " + djStyle);

        this.dj = new DJ(djName, djAge, djStyle);
    }

    // enter review
    private void enterReview() {

    }

    // request number
    private void requestNumber() {

    }

    // terminate program directly
    private void terminateProgram() {
        System.out.println("System will shutdown in " + this.SLEEP_SECONDS + "  sec");
        for (int count = this.SLEEP_SECONDS; count > 0; count--) {
            try {
                Thread.sleep(INTERRUPT_SECONDS);
            } catch (Exception e) {

            }
            System.out.println("Shutdown in " + count + " seconds");
        }
        System.out.println("Shutdown now!");
        System.exit(0);
    }


}
