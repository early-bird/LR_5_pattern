package main;

import restoran.TRestoran;
import restoran.IRestoran;
import restoran.Restoran;
import order.CreateOrder;
import generate.OrderNumber;

class RestoranTestDrive {

    public static void main(String[] args) {
        OrderNumber tradnumber = new OrderNumber();
        OrderNumber italnumber = new OrderNumber();
        System.out.println("Поступило "+tradnumber.rand+" заказов на традициональную кухню");
        System.out.println("Поступило "+italnumber.rand+" заказов на итальянскую кухню");
                
        Restoran TRes = new TRestoran(); //Вид ресторана
        Restoran IRes = new IRestoran(); //Вид ресторана
        
        CreateOrder restoran = TRes.newOrder();   //Новый заказ
        System.out.println("Сделано "+tradnumber.rand +" заказов "+restoran.getName()+"\t");
        
        restoran = IRes.newOrder();  //Новый заказ
        System.out.println("Сделано "+italnumber.rand +" заказов "+restoran.getName()+"\t");
    }

}
