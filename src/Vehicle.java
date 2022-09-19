public interface Vehicle {

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}
