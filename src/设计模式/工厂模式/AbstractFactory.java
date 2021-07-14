package 设计模式.工厂模式;

/**
 * @author FLE
 * @description 抽象工厂模式
 * @time 2021/4/21 15:32
 */
abstract class AbstractFactory {
    abstract AirPlane createAirPlane();
    abstract Train createTrain();
}

class DefaultFactory extends AbstractFactory {
    @Override
    AirPlane createAirPlane() {
        return new AirPlane();
    }

    @Override
    Train createTrain() {
        return new Train();
    }
}

class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory f = new DefaultFactory();
        AirPlane airPlane = f.createAirPlane();
        Train train = f.createTrain();
        airPlane.make();
        train.make();
    }
}


