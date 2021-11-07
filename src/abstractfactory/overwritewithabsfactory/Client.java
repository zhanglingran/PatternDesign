package abstractfactory.overwritewithabsfactory;

import abstractfactory.overwritewithabsfactory.factory.AbstractFactory;
import abstractfactory.overwritewithabsfactory.factory.Schema1;
import abstractfactory.overwritewithabsfactory.factory.Schema2;

/**
 * @Author: ZhangLingRan
 * @Description: 客户端，需要将自己选择的配件类型提供给工程师
 * @DateTime: 2021/11/7 22:52
 */
public class Client {

    public static void main(String[] args) {

        // 创建工程师对象
        ComputerEngineer engineer = new ComputerEngineer();

        // 客户需要选择一个自己想要的装机方案，即从schema1和schema2中选择其一
        AbstractFactory schema = new Schema2();

        // 装机工程师组装电脑
        engineer.makeComputer(schema);

    }

}
