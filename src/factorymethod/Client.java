package factorymethod;

import factorymethod.operatorimpl.ExportDBOperator;

/**
 * @Author: ZhangLingRan
 * @Description: TODO
 * @DateTime: 2021/11/5 23:28
 */
public class Client {

    public static void main(String[] args) {
        // 创建需要使用的Creator对象
        ExportOperator operator = new ExportDBOperator();

        // 调用导出方法
        operator.export("测试文件");
    }

}
