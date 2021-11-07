package factorymethod.creator;

import factorymethod.product.ExportFileApi;
import factorymethod.product.ExportXmlFile;

/**
 * @Author: ZhangLingRan
 * @Description: 导出数据业务的功能对象
 * @DateTime: 2021/11/5 23:20
 */
public class ExportOperatorParamsExtend extends ExportOperatorParams {

    /**
     * 新增产品对象的时候，对工厂方法进行扩展
     * @return
     */
    @Override
    public ExportFileApi factoryMethod(String type) {
        ExportFileApi api;

        if ("Xml".equals(type)) {
            api = new ExportXmlFile();
        } else {
            api = super.factoryMethod(type);
        }

        return api;
    }

}
