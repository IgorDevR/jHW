public class Truck extends Car {

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку Truck");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель Truck");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп Truck");
    }

    public void checkTrailer(int numberTrailer) {
        System.out.println("Проверяем прицеп Truck под номером = " + numberTrailer);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        super.setWheelsCount(wheelsCount);
    }
}
