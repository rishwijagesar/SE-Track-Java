import java.util.Random;

public class DJ {

    private final int id;
    private final String name;
    private final int age;
    private final String style;
    private final static int BOUND = 100;

    public DJ(String name, int age, String style) {
        this.id = this.generateID();
        this.name = name;
        this.age = age;
        this.style = style;
    }

    private int generateID() {
        Random random = new Random();
        return random.nextInt(this.BOUND);
    }

    // print DJ information
    public void printDJData() {
        System.out.println("DJ id: " + this.id);
        System.out.println("DJ name: " + this.name);
        System.out.println("DJ age: " + this.age);
        System.out.println("DJ style: " + this.style);
    }


}
