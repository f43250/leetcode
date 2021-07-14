package 设计模式.工厂模式;

/**
 * @author FLE
 * @description 工厂方法模式
 * @time 2021/4/21 15:20
 */
public class FactoryMethod {

}

// 抽象产品
interface Product {
    void make();
}

// 具体产品
class AirPlane implements Product {
    @Override
    public void make() {
        System.err.println("生产飞机中");
    }
}

class Train implements Product {
    @Override
    public void make() {
        System.err.println("生产火车中");
    }
}

// 抽象工厂
abstract class ProductFactory {
    abstract Product create();
}

// 具体工厂
class AirPlaneFactory extends ProductFactory {
    public Product create() {
        return new AirPlane();
    }
}

class TrainFactory extends ProductFactory {
    public Product create() {
        return new Train();
    }
}

class TestFactoryMethod {
    public static void main(String[] args) {
        AirPlaneFactory airPlaneFactory = new AirPlaneFactory();
        TrainFactory trainFactory = new TrainFactory();
        Product product1 = airPlaneFactory.create();
        Product product2 = trainFactory.create();
        product1.make();
        product2.make();
    }
}



