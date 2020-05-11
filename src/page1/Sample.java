package page1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

	public class Sample {
		public static void main(String[] args) {

			String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
			String user = "user1";
			String password = "password";

			List<Page1_1> orderList = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM lf_order")){


		// ステートメント生成
		while(res.next()) {
			String a = res.getString("product_code");
			String b = res.getString("Order_no");
			Integer c = res.getInt("Order_branch_no");
			Integer d = res.getInt("Quantity");
			Integer e = res.getInt("Coupon_discount_fee");
			Page1_1 order = new Page1_1(a, b, c, d, e);
			orderList.add(order);
		}
		System.out.println(orderList.get(0).getProduct_code());
		System.out.println(orderList.get(1).getProduct_code());
		System.out.println(orderList.get(1).getQuantity());
		System.out.println(orderList.get(1).getOrder_no());
		System.out.println(orderList.get(1).getCoupon_discount_fee());


			}catch(SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}

