package models;

import models.interfaces.CarwashSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Carwash {

    private List<CarwashSubscriber> carwashEvent;

    public Carwash() {
        this.carwashEvent = new ArrayList<>();
//        carwashEvent.add((car) -> preparer(car));
//        carwashEvent.add((car) -> laver(car));
//        carwashEvent.add(this::secher);
//        carwashEvent.add(this::finaliser);
        carwashEvent.add((car) -> {
            System.out.println("Préparation de la voiture : " + car.getNumeroPlaque());
        });
        carwashEvent.add((car) -> {
            System.out.println("Lavage de la voiture : " + car.getNumeroPlaque());
        });
        carwashEvent.add((car) -> {
            System.out.println("Séchage de la voiture : " + car.getNumeroPlaque());
        });
        carwashEvent.add((car) -> {
            System.out.println("Finalisation du traitement de la voiture : " + car.getNumeroPlaque());
        });
    }

//    private void preparer(Car c){
//        System.out.println("Préparation de la voiture : " + c.getNumeroPlaque());
//    }
//    private void laver(Car c){
//        System.out.println("Lavage de la voiture : " + c.getNumeroPlaque());
//    }
//    private void secher(Car c){
//        System.out.println("Séchage de la voiture : " + c.getNumeroPlaque());
//    }
//    private void finaliser(Car c){
//        System.out.println("Finalisation du traitement de la voiture : " + c.getNumeroPlaque());
//    }
    public void traiter(Car c){

//        for (CarwashSubscriber subscriber : carwashEvent){
//            subscriber.execute(c);
//        }
        carwashEvent.forEach((s) -> s.execute(c));
    }
}
