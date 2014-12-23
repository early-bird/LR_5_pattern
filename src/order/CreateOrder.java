package order;

import java.util.*;
import java.math.*;


public abstract class CreateOrder {

    String orderName;
    String firstDish;
    String secondDish;
    ArrayList salad = new ArrayList();

    public String getName() {
        return orderName;
    }
    public void prepareOrder() {
        System.out.println("Делаем заказ для\n" + orderName+"\t");
        System.out.println("Добавили салат:");
        for (int i = 0; i < salad.size(); i++) {
            System.out.println("   " + salad.get(i));
        }
        System.out.println("Первое блюдо:  "+firstDish);
        System.out.println("Второе блюдо:  "+secondDish);
    }
    
    public void putBread() {
        System.out.println("Добаляем кусочек хлеба");
    }
    
    public void putDrinks() {
        System.out.println("Добаляем кофе");
    }
    public void serve() {
        System.out.println("Сервируем блюдо");
    }
}

















