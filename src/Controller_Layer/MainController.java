package Controller_Layer;

import Model_Layer.DJ;
import java.util.Scanner;

public class MainController {

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
    private InputController inputController;

    // constructor
    public MainController() {

        // create InputController for handling system input
        this.inputController = new InputController();

        // set username for user
        this.setUserName();

        // open menu
        this.openMenu();
    }

    // set username
    private void setUserName() {
        System.out.println("Enter username");
        this.username = this.inputController.input();
        System.out.println("Username is: " + username + "!!");
    }

    // open the menu for user interaction
    private void openMenu() {

        // input loop
        while (askForInput) {

            this.printMenu();

            // try to parse input value to number
            this.inputNumber = this.inputController.parseInputToInt();

            // check if number is between boundaries
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
        System.out.println("-----Menu-----");
        System.out.println("Number 1: Create DJ");
        System.out.println("Number 2: Enter Review");
        System.out.println("Number 3: Request Number");
        System.out.println("Number 4: Terminate Program");
        System.out.println("---End-Menu---");
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

    // create a dj
    private void createDJ() {

        this.dj = new DJ(this);
        this.dj.printDJData();
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

    public InputController getInputController() {
        return inputController;
    }
}
