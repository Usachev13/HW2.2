public interface ServiceStation {
    default void check(Car car){}
    default void check(Truck truck){}
    default void check(Bicycle bicycle){}
}
