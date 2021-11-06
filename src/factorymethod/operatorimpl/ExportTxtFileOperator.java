package factorymethod.operatorimpl;

import factorymethod.ExportFileApi;
import factorymethod.ExportOperator;
import factorymethod.apiimpl.ExportTxtFile;

/**
 * @Author: ZhangLingRan
 * @Description: TODO
 * @DateTime: 2021/11/5 23:25
 */
public class ExportTxtFileOperator extends ExportOperator {
    @Override
    protected ExportFileApi factoryMethod() {

        // 创建导出成为文本文件格式的对象
        return new ExportTxtFile();
    }
}
