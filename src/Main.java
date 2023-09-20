public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);


        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStationForBicycle serviceStationForBicycle = new ServiceStationForBicycle();
        ServiceStationForCar serviceStationForCar = new ServiceStationForCar();
        ServiceStationForTruck serviceStationForTruck = new ServiceStationForTruck();
        serviceStationForCar.check(car);
        serviceStationForCar.check(car2);
        serviceStationForTruck.check(truck);
        serviceStationForTruck.check(truck2);
        serviceStationForBicycle.check(bicycle);
        serviceStationForBicycle.check(bicycle2);
    }
}
