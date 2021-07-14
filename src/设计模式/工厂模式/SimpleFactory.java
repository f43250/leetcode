package 设计模式.工厂模式;

/**
 * @author FLE
 * @description 简单工厂模式 spring beanFactory
 * @time 2021/4/21 15:09
 */
public class SimpleFactory {
    public static Car getInstance(String type) {
        Car car = null;
        if ("Benz".equals(type)) {
            car = new Benz();
        }else if ("Ford".equals(type)) {
            car = new Ford();
        }else {
            System.err.println("没有这种汽车类型");
        }
        return car;
    }
}

// 抽象类
interface Car {
    void run();
}

//具体实现类

class Benz implements Car {
    @Override
    public void run() {
        System.err.println("奔驰启动了");
    }
}

class Ford implements Car {
    @Override
    public void run() {
        System.err.println("福特启动了");
    }
}

class TestSimpleFactory {
    public static void main(String[] args) {
        Car benz = SimpleFactory.getInstance("Benz");
        benz.run();
    }
}



