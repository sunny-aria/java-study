package study.pattern.decorator;

/**
 * 组合模式，解决多子类对象问题，动态的增加新的功能
 */
public interface ICar {
    void move();
}

/**
 * 基础的行为模式
 */
class Car implements ICar{
    @Override
    public void move() {
        System.out.println("陆地行驶");
    }
}

class SuperCar implements ICar{
    ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        this.car.move();
    }
}
class FlyCar extends SuperCar{
    /**
     * 这是装饰器的亮点，可以无限嵌套，常见的jdk有io流操作
     * @param car
     */
    public FlyCar(ICar car) {
        super(car);
    }

    private void fly(){
        System.out.println("飞行模式");
    }

    @Override
    public void move() {
        fly();
        super.move();
        System.out.println("---------");
    }
}
class WaterCar extends SuperCar{
    public WaterCar(ICar car) {
        super(car);
    }
    private void water(){
        System.out.println("水中游");
    }

    @Override
    public void move() {
        water();
        super.move();
    }
}
