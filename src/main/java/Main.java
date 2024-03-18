import models.Car;
import models.Carwash;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("1234");
        Carwash carwash = new Carwash();
        carwash.traiter(c);
        System.out.println("______________________________");
        carwash.traiter(c);
    }
}
