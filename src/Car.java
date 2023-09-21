public class Car extends Vehicle{
    private String modelName;
    public Car(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

