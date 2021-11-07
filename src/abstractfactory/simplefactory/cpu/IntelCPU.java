package abstractfactory.simplefactory.cpu;

/**
 * @Author: ZhangLingRan
 * @Description: TODO
 * @DateTime: 2021/11/7 22:34
 */
public class IntelCPU implements CPUApi{

    /**
     * CPU的针脚数量
     */
    private int pins = 0;

    /**
     * 构造方法，通过针脚数来创建一个CPU实例
     * @param pins CPU的针脚数
     */
    public IntelCPU(int pins) {
        this.pins = pins;
    }

    /**
     *
     */
    @Override
    public void calculate() {
        System.out.println("now in Intel CPU, pins = " + pins);
    }
}
