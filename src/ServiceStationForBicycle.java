public class ServiceStationForBicycle implements ServiceStation {
    @Override
    public void check(Bicycle bicycle) {
         if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
