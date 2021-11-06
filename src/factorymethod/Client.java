package factorymethod;

import factorymethod.creator.ExportDBOperator;
import factorymethod.creator.ExportOperator;
import factorymethod.creator.ExportOperatorParams;
import factorymethod.creator.ExportOperatorParamsExtend;

/**
 * @Author: ZhangLingRan
 * @Description: TODO
 * @DateTime: 2021/11/5 23:28
 */
public class Client {

    public static void main(String[] args) {
        // 创建需要使用的Creator对象
        ExportOperatorParams operator = new ExportOperatorParamsExtend();

        // 调用导出方法
        operator.export("DB","测试文件");
        operator.export("Text","测试文件");
        operator.export("Xml","测试文件");
    }

}
