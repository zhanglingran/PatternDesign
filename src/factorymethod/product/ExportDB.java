package factorymethod.product;

/**
 * @Author: ZhangLingRan
 * @Description: TODO
 * @DateTime: 2021/11/5 23:18
 */
public class ExportDB implements ExportFileApi {


    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到数据库备份文件中...");
        return true;
    }
}
