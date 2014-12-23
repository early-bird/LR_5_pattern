package restoran;


import order.CreateOrder;
import order.ItalianOrder;

public class IRestoran extends Restoran{
    @Override
    public CreateOrder create() {
        return new ItalianOrder();
    }
}
