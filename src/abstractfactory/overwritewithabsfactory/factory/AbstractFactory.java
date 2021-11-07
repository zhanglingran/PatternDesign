package abstractfactory.overwritewithabsfactory.factory;

import abstractfactory.overwritewithabsfactory.cpu.CPUApi;
import abstractfactory.overwritewithabsfactory.mainboard.MainBoardApi;

/**
 * @Author: ZhangLingRan
 * @Description: 抽象工厂
 * @DateTime: 2021/11/7 23:39
 */
public interface AbstractFactory {

    /**
     * 创建CPU的对象
     * @return CPU的对象
     */
    CPUApi createCPUApi();

    /**
     * 创建主板的对象
     * @return 主板的对象
     */
    MainBoardApi createMainBoardApi();

}
