package Controller_Layer;

import java.util.Scanner;

public class InputController {

    private Scanner scanner;

    // constructor
    public InputController() {
        // initiate scanner once;
        this.scanner = new Scanner(System.in);
    }

    // parse system input to number
    public int parseInputToInt() {
        while (true) {
            try {
                int number = Integer.parseInt(this.scanner.next());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Number please, how hard can it be...");
            }
        }
    }

    // public input reader, can be used by other classes as well
    public String input() {
        return this.scanner.next();
    }
}
