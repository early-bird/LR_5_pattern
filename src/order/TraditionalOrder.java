package order;

public class TraditionalOrder extends CreateOrder {

    public TraditionalOrder() {
        orderName = "традициональной кухни";
        firstDish = "Борщ";
        secondDish = "Драники";
        salad.add("Оливье");
    }
    
    @Override
    public void putDrinks() {
        System.out.println("Добавляем компот");
    }
}