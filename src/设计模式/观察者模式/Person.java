package 设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FLE
 * @description
 * @time 2021/4/20 14:31
 */
public interface Person {

    void getMessage(String name);

}


class LaoLi implements Person {

    String name = "老李";

    @Override
    public void getMessage(String message) {
        System.err.println(name + "接收到了信息: " + message);
    }

}

class LaoZhang implements Person {

    String name = "老张";

    @Override
    public void getMessage(String message) {
        System.err.println(name + "接收到了信息: " + message);
    }

}

class XiaoMei {

    List<Person> list = new ArrayList<>();

    public void addPerson(Person person){
        list.add(person);
    }

    //遍历list，把自己的通知发送给所有暗恋自己的人
    public void notifyPerson() {
        for(Person person:list){
            person.getMessage("你们过来吧，谁先过来谁就能陪我一起玩儿游戏!");
        }
    }
}

class Test {
    public static void main(String[] args) {

        XiaoMei xiaoMei = new XiaoMei();
        LaoZhang laoZhang = new LaoZhang();
        LaoLi laoLi = new LaoLi();

        //小王和小李在小美那里都注册了一下
        xiaoMei.addPerson(laoZhang);
        xiaoMei.addPerson(laoLi);

        //小美向小王和小李发送通知
        xiaoMei.notifyPerson();
    }
}




