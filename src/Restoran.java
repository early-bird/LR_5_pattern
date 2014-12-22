import java.util.*;
import java.math.*;


public abstract class Restoran {

    String name;
    String dough;
    String sauce;
    String pit;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }
    public void prepare() {
        System.out.println("Get zakaz\n" + name+"\t");
        System.out.println("Add: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
        System.out.println("Do first dishes");
    }
    public void freeze() {
        System.out.println("Do second dishes");
    }
    public void voda() {
        System.out.println("Add Coca-Cola");
    }
    public void box() {
        System.out.println("Put in box");
    }
}

















