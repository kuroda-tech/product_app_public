package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// 仕入先データ操作用DAOクラス
public class VendorDao {

    //接続用の情報をフィールドに定数として定義
    private static final String URL = "jdbc:mariadb://localhost:8889/java_db_app"; // MAMPの場合は"localhost:8889"としてください
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root"; // MAMPを利用している場合は"root"を代入してください

    // 仕入先データの読み取り
    public ArrayList<VendorDto> read()
            throws SQLException {

        // SELECT文のフォーマット
        String sql = "SELECT vendor_code FROM vendors;";

        // 取得したデータを格納するためのリスト
        ArrayList<VendorDto> dataList = new ArrayList<VendorDto>();

        // データベース接続 ＆ SQL文の準備
        try (Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                Statement statement = con.createStatement();) {

            // SQL文を実行
            ResultSet result = statement.executeQuery(sql);

            // SQLクエリの実行結果を抽出
            while (result.next()) {
                // DTOのインスタンスにデータをセット
                VendorDto vendorData = new VendorDto();
                vendorData.setVendorCode(result.getInt("vendor_code"));

                // リストにデータを追加
                dataList.add(vendorData);
            }
        }

        return dataList; // データリストを返す
    }
}