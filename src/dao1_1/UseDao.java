package dao1_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



	public class UseDao {
		public List<Recode> findAll() throws DAOException {

			String url = "jdbc:mysql://localhost:3306/shop?useSSL=false";
			String user = "user1";
			String password = "password";

			List<Recode> recodeList = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM lf_order")){


		// ステートメント生成
		while(res.next()) {
//			String a = res.getString("product_code");
//			String b = res.getString("Order_no");
//			Integer c = res.getInt("Order_branch_no");
//			Integer d = res.getInt("Quantity");
//			Integer e = res.getInt("Coupon_discount_fee");
			Recode order = new Recode(res.getString("product_code"),
									  res.getString("Order_no"),
									  res.getInt("Order_branch_no"),
									  res.getInt("Quantity"),
									  res.getInt("Coupon_discount_fee"));
			recodeList.add(order);
		}

//		for(Recode text:orderList) {
//			System.out.println(text);
//		}


			}catch(SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return recodeList;
	}
}
