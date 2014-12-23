package restoran;


import order.CreateOrder;

public abstract class Restoran {

    public CreateOrder newOrder() {
        CreateOrder restoran;
        
        restoran = create();
        
        restoran.prepareOrder();
        restoran.putDrinks();
        restoran.putBread();
        restoran.serve();

        return restoran;
    }
    protected abstract CreateOrder create ();
}