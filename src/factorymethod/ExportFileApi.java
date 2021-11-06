package factorymethod;

/**
 * @Author: ZhangLingRan
 * @Description: 导出文件对象的接口
 * @DateTime: 2021/11/5 22:43
 */
public interface ExportFileApi {

    /**
     * 导出文件的内容
     * @param data 提示；需要保存的数据
     * @return 是否导出成功
     */
    boolean export(String data);

}



