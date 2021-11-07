package abstractfactory.overwritewithabsfactory;

import abstractfactory.overwritewithabsfactory.cpu.CPUApi;
import abstractfactory.overwritewithabsfactory.factory.AbstractFactory;
import abstractfactory.overwritewithabsfactory.mainboard.MainBoardApi;

/**
 * @Author: ZhangLingRan
 * @Description: 装机工程师的类
 * @DateTime: 2021/11/7 22:45
 */
public class ComputerEngineer {

    /**
     * 定义组装机器所需的CPU
     */
    private CPUApi cpu = null;

    /**
     * 定义组装机器所需的主板
     */
    private MainBoardApi mainBoard = null;

    /**
     * 装机过程
      * @param schema
     */
    public void makeComputer(AbstractFactory schema) {

        // 1. 首先需要准备好所需的配件
        prepareHardwares(schema);

        // 2. 装机

        // 3. 测试

        // 4. 交付给客户
    }

    /**
     * 准备好装机所需的配件
     * @param schema
     */
    private void prepareHardwares(AbstractFactory schema) {

        // 通过装机方案来创建所需的cpu实例
        this.cpu = schema.createCPUApi();

        // 通过MainBoard工厂给创建所需的mainboard实例
        this.mainBoard = schema.createMainBoardApi();

        // 测试配件是不是好用
        this.cpu.calculate();
        this.mainBoard.installCPU();

    }

}
