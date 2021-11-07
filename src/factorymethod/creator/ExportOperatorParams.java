package factorymethod.creator;

import factorymethod.product.ExportDB;
import factorymethod.product.ExportFileApi;
import factorymethod.product.ExportTxtFile;

/**
 * @Author: ZhangLingRan
 * @Description: 导出数据业务的功能对象
 * @DateTime: 2021/11/5 23:20
 */
public class ExportOperatorParams {

    /**
     * 导出文件
     * @param type
     * @param data
     * @return
     */
    public boolean export(String type, String data) {
        ExportFileApi api = factoryMethod(type);
        return api.export(data);
    }

    /**
     * 工厂方法，根据所传参数创建导出的文件对象的接口对象
     * @return
     */
    public ExportFileApi factoryMethod(String type) {
        ExportFileApi api;

        if ("Text".equals(type)) {
            api = new ExportTxtFile();
        } else {
            api = new ExportDB();
        }

        return api;
    }

}
