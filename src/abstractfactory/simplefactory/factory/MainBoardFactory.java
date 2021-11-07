package abstractfactory.simplefactory.factory;

import abstractfactory.simplefactory.mainboard.GAMainBorad;
import abstractfactory.simplefactory.mainboard.MSIMainBorad;
import abstractfactory.simplefactory.mainboard.MainBoardApi;

/**
 * @Author: ZhangLingRan
 * @Description: 构建CPU的工厂
 * @DateTime: 2021/11/7 22:41
 */
public class MainBoardFactory {

    /**
     * 创建主板接口对象的方法
     * @param type
     * @return
     */
    public static MainBoardApi createCPUApi(int type) {

        MainBoardApi mainBoard = null;
        if (type == 1) {
            mainBoard = new GAMainBorad(1156);
        } else if (type == 2) {
            mainBoard = new MSIMainBorad(939);
        }

        return mainBoard;
    }

}
