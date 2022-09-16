public class Car implements Vehicle {

    private String modelName;
    private int wheelsCount;
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку Car");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель Car");

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
