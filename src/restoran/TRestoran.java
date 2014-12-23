package restoran;


import order.CreateOrder;
import order.TraditionalOrder;

public class TRestoran extends Restoran{
    @Override
    protected CreateOrder create() {
        
            return new TraditionalOrder();
        
    }
}
