package abstractfactory.simplefactory;

import abstractfactory.simplefactory.cpu.CPUApi;
import abstractfactory.simplefactory.factory.CPUFactory;
import abstractfactory.simplefactory.factory.MainBoardFactory;
import abstractfactory.simplefactory.mainboard.MainBoardApi;

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
     * @param cpuType  客户选择的CPU类型
     * @param mainBoardType 客户选择的主板类型
     */
    public void makeComputer(int cpuType, int mainBoardType) {

        // 1. 首先需要准备好所需的配件
        prepareHardwares(cpuType, mainBoardType);

        // 2. 装机

        // 3. 测试

        // 4. 交付给客户
    }

    /**
     * 准备好装机所需的配件
     * @param cpuType CPU类型
     * @param mainBoardType　主板类型
     */
    private void prepareHardwares(int cpuType, int mainBoardType) {

        // 通过CPU工厂创建所需的cpu实例
        cpu = CPUFactory.createCPUApi(cpuType);

        // 通过MainBoard工厂给创建所需的mainboard实例
        mainBoard = MainBoardFactory.createCPUApi(mainBoardType);

        // 测试配件是不是好用
        this.cpu.calculate();
        this.mainBoard.installCPU();

    }

}
