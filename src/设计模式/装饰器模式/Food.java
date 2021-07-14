package 设计模式.装饰器模式;

/**
 * @author FLE
 * @description
 * @time 2021/4/20 14:59
 */
public class Food {
    String foodName;

    public Food() {

    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String addFood() {
        return foodName;
    }

}

class Bread extends Food {
    private final Food bread;

    public Bread(Food bread) {
        this.bread = bread;
    }

    public String addFood() {
        return bread.addFood() + "+面包";
    }
}

class Milk extends Food {
    private final Food milk;

    public Milk(Food milk) {
        this.milk = milk;
    }

    public String addFood() {
        return milk.addFood() + "+牛奶";
    }
}

class Vegetables extends Food {
    private final Food Vegetables;

    public Vegetables(Food Vegetables) {
        this.Vegetables = Vegetables;
    }

    public String addFood() {
        return Vegetables.addFood() + "+蔬菜";
    }
}

class Test {
    public static void main(String[] args) {
        Food myFood = new Vegetables(new Bread(new Milk(new Food("香肠"))));
        System.err.println(myFood.addFood());
    }


}