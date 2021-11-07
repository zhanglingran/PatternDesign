package factorymethod.creator;

import factorymethod.product.ExportFileApi;
import factorymethod.product.ExportDB;

/**
 * @Author: ZhangLingRan
 * @Description: TODO
 * @DateTime: 2021/11/5 23:25
 */
public class ExportDBOperator extends ExportOperator {
    @Override
    protected ExportFileApi factoryMethod() {

        // 创建导出成为数据库备份文件格式的对象
        return new ExportDB();
    }
}
