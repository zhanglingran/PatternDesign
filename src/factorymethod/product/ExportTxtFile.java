package factorymethod.product;

/**
 * @Author: ZhangLingRan
 * @Description: TODO
 * @DateTime: 2021/11/5 23:17
 */
public class ExportTxtFile implements ExportFileApi {


    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件中...");
        return true;
    }
}
