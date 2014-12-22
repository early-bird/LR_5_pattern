class RestoranTestDrive {

    public static void main(String[] args) {
        OrderNumber rusnumber = new OrderNumber();
        OrderNumber bynumber = new OrderNumber();
        System.out.println("New zakaz "+rusnumber.rand+" traditional kitchen");
        System.out.println("New zakaz "+bynumber.rand+" italian kitchen");
        RestoranStore TStore = new TRestoranStore();
        RestoranStore IStore = new IRestoranStore();
        
        
        Restoran restoran = TStore.orderZakaz();
        System.out.println("Made "+rusnumber.rand +" zakazov "+restoran.getName()+"\t");
        
        restoran = IStore.orderZakaz();
        System.out.println("Made "+bynumber.rand +" zakazov "+restoran.getName()+"\t");
        
    }

}
