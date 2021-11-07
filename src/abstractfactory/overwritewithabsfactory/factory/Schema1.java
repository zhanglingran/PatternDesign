package abstractfactory.overwritewithabsfactory.factory;

import abstractfactory.overwritewithabsfactory.cpu.AMDCPU;
import abstractfactory.overwritewithabsfactory.cpu.CPUApi;
import abstractfactory.overwritewithabsfactory.cpu.IntelCPU;
import abstractfactory.overwritewithabsfactory.mainboard.GAMainBorad;
import abstractfactory.overwritewithabsfactory.mainboard.MainBoardApi;

/**
 * @Author: ZhangLingRan
 * @Description: 装机方案一
 * @DateTime: 2021/11/7 23:41
 */
public class Schema1 implements AbstractFactory{
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new GAMainBorad(1156);
    }
}
