package factorymethod;

/**
 * @Author: ZhangLingRan
 * @Description: 导出数据业务的功能对象
 * @DateTime: 2021/11/5 23:20
 */
public abstract class ExportOperator {

    /**
     * 导出文件
     * @param data
     * @return 返回是否导出成功
     */
    public boolean export(String data) {
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * @return
     */
    protected abstract ExportFileApi factoryMethod();

}
