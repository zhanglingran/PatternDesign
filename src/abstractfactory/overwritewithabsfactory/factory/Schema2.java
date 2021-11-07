package abstractfactory.overwritewithabsfactory.factory;

import abstractfactory.overwritewithabsfactory.cpu.AMDCPU;
import abstractfactory.overwritewithabsfactory.cpu.CPUApi;
import abstractfactory.overwritewithabsfactory.mainboard.MSIMainBorad;
import abstractfactory.overwritewithabsfactory.mainboard.MainBoardApi;

/**
 * @Author: ZhangLingRan
 * @Description: 装机方案一
 * @DateTime: 2021/11/7 23:41
 */
public class Schema2 implements AbstractFactory{
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new MSIMainBorad(939);
    }
}
