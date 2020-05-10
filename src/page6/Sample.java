package page6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class Sample {
		public static void main(String[] args) {

			String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
			String user = "user1";
			String password = "password";

	try (Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM lf_order")){


		// ステートメント生成
		while(res.next()) {
			System.out.println(res.getString("product_code")+"test");
			System.out.println(res.getString("order_date"));
		}


			}catch(SQLException e) {
				System.out.println("error");
				e.printStackTrace();
			}
		}
}

