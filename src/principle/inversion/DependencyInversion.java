package principle.inversion;

/**
 * @Author: ZhangLingRan
 * @Description: 依赖倒置原则的使用
 * @DateTime: 2021/11/9 9:31
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new  Person();
        person.receive(new Email());
        // 这时人不能直接通过receive方法直接接收weixin类
//         解决方案：
//            1. 依赖倒置原则， 创建一个接口：IReceiver
//            2. 如WeiXin、Email等都实现IReceiver
//            3. Person通过调用IReceiver的实现对具体实现的依赖（如工厂方法模式等）
//        person.receive(new WeiXin());
    }

}


/**
 * 定义一个人的类，来接收消息
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

/**
 * 电子邮件
 */
class Email {
    public String getInfo() {
        return "接收到了电子邮件信息...";
    }
}

/**
 * 当人接收微信消息的时候，创建weixin类
 */
class WeiXin {
    public String getInfo() {
        return "接收到了微信的消息...";
    }
}