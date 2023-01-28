package inheritance;
public class Road {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Black",8,"Mercedes t220d", "Bidhanagar, Kolkata");
        Vehicle bus = new Bus("White",6,"Volvo 2260d",true);
        Vehicle car = new Car("Teal",4,"Tata Harrier",false);
        System.out.println(truck);
        System.out.println(bus);
        System.out.println(car);
    }
}
