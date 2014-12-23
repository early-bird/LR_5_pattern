package order;

public class ItalianOrder extends CreateOrder {

    public ItalianOrder() {
        orderName = "итальянской кухни";
        firstDish = "Бульон с лапшой из сыра";
        secondDish = "Спагетти карбонара";
        salad.add("Итальянский салат с ветчиной, сыром и овощами");
    }
    
    @Override
     public void putBread() {
        System.out.println("Добаляем ароматную итальянскую булочку");
    }
}
