package Model_Layer;

import Controller_Layer.MainController;
import Model_Layer.Helper.DJHelper;

public class DJ {

    // primitives
    private int id;
    private int age;
    private String name;
    private String style;

    // objects
    private final MainController mainController;
    private final DJHelper djHelper;

    // constructor
    public DJ(MainController mainController) {

        this.mainController = mainController;
        this.djHelper = new DJHelper();

        // let handler generate id;
        this.id = this.djHelper.generateID();

        System.out.println("-------");
        this.setDJName();
        this.setDJAge();
        this.setDJStyle();
        System.out.println("-------");
    }

    // DJ information
    public void printDJData() {
        System.out.println("DJ id: " + this.id);
        System.out.println("DJ name: " + this.name);
        System.out.println("DJ age: " + this.age);
        System.out.println("DJ style: " + this.style);
    }

    // Set DJ Name
    private void setDJName() {
        System.out.print("DJ Name: ");
        this.name = this.mainController.getInputController().input();
        System.out.println("DJ name is: " + this.name);
    }

    // Set DJ Age
    private void setDJAge() {
        System.out.print("DJ Age: ");
        this.age = this.mainController.getInputController().parseInputToInt();
        System.out.println("DJ age is: " + this.age);
    }

    // Set DJ Style
    private void setDJStyle() {
        System.out.print("DJ Style: ");
        this.style = this.mainController.getInputController().input();
        System.out.println("DJ style is: " + this.style);
    }

}
