package abstractfactory.simplefactory;

/**
 * @Author: ZhangLingRan
 * @Description: 客户端，需要将自己选择的配件类型提供给工程师
 * @DateTime: 2021/11/7 22:52
 */
public class Client {

    public static void main(String[] args) {

        // 创建工程师对象
        ComputerEngineer engineer = new ComputerEngineer();

        // 装机工程师组装电脑
        engineer.makeComputer(1, 2);

    }

}
