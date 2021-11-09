package principle.inversion.improve;

/**
 * @Author: ZhangLingRan
 * @Description: Person类依赖接收器来接受消息，因为接收器的类型有很多，如：WeiXin、QQ、Email等等。
 *               那么定义抽象的接收器接口，Person类通过对接口的调用实现对具体接收器的依赖
 * @DateTime: 2021/11/9 9:31
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new  Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }

}


/**
 * 定义一个人的类，来接收消息
 */
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

interface IReceiver {
    /**
     * 接收器返回消息
     * @return
     */
    String getInfo();
}

/**
 * 电子邮件
 */
class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "接收到了电子邮件信息...";
    }
}

/**
 * 当人接收微信消息的时候，创建weixin类
 */
class WeiXin implements IReceiver{
    @Override
    public String getInfo() {
        return "接收到了微信的消息...";
    }
}