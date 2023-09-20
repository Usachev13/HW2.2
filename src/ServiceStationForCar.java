public class ServiceStationForCar implements ServiceStation {

    @Override
    public void check(Car car) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();

        }
    }
