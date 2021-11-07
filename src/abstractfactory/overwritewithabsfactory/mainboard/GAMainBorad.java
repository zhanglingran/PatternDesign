package abstractfactory.overwritewithabsfactory.mainboard;

/**
 * @Author: ZhangLingRan
 * @Description: 技嘉的主板
 * @DateTime: 2021/11/7 22:37
 */
public class GAMainBorad implements MainBoardApi {

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法： 通过插槽孔数量来构建一个主板的实例对象
     * @param cpuHoles
     */
    public GAMainBorad(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in GAMainBoard, cpuHoles = " + cpuHoles);
    }
}
