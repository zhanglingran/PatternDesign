package principle.inversion.improve;

/**
 * @Author: ZhangLingRan
 * @Description: 依赖倒置的三种依赖关系传递方法
 * @DateTime: 2021/11/9 9:47
 */
public class ThreePropMethod {

    public static void main(String[] args) {

        IReceiver1 receiver = new Email1();

        // 方式1： 通过接口来传递依赖关系
        Person1 person1 = new Person1();
        person1.receive(receiver);

        // 方式2： 通过构造器来传递依赖关系
        Person2 person2 = new Person2(receiver);
        person2.receive();

        // 方式3： 通过接口来传递依赖关系
        Person3 person3 = new Person3();
        person3.setter(receiver);
        person3.receive();
    }

}

/**
 * 方式1： 通过接口来传递依赖关系
 */
class Person1 {
    public void receive(IReceiver1 receiver) {
        System.out.println(receiver.getInfo());
    }
}

/**
 * 方式2： 通过构造器传递依赖关系
 */
class Person2 {

    private IReceiver1 receiver;

    public Person2(IReceiver1 receiver) {
        this.receiver = receiver;
    }

    public void receive() {
        System.out.println(this.receiver.getInfo());
    }
}


/**
 * 方式3： 通过构造器传递依赖关系
 */
class Person3 {

    private IReceiver1 receiver;

    public void setter(IReceiver1 receiver) {
        this.receiver = receiver;
    }

    public void receive() {
        System.out.println(this.receiver.getInfo());
    }
}

/**
 * 接收器接口
 */
interface IReceiver1 {
    /**
     * 接收器返回消息
     * @return
     */
    String getInfo();
}

/**
 * 电子邮件
 */
class Email1 implements IReceiver1 {
    @Override
    public String getInfo() {
        return "接收到了电子邮件信息...";
    }
}