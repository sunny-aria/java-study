package study.pattern.decorator;

public class MainClass {
    public static void main(String[] args) {
        ICar car = new Car();

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        //构造器可以传入多个行为的组合
        WaterCar waterCar =  new WaterCar(flyCar);
        waterCar.move();
    }
}
