package abstractfactory.simplefactory.factory;

import abstractfactory.simplefactory.cpu.AMDCPU;
import abstractfactory.simplefactory.cpu.CPUApi;
import abstractfactory.simplefactory.cpu.IntelCPU;

/**
 * @Author: ZhangLingRan
 * @Description: 构建CPU的工厂
 * @DateTime: 2021/11/7 22:41
 */
public class CPUFactory {

    /**
     * 创建CPU接口对象的方法
     * @param type
     * @return
     */
    public static CPUApi createCPUApi(int type) {

        CPUApi api = null;
        if (type == 1) {
            api = new IntelCPU(1156);
        } else if (type == 2) {
            api = new AMDCPU(939);
        }

        return api;
    }

}
