package dao1_1;
import java.util.List;

public class Dao {
	public static void main(String[] args) {


		UseDao recodeDAO = new UseDao();
		try {

			List<Recode> recodeList = recodeDAO.findAll();

			for(Recode text:recodeList) {
				System.out.println(text);
			}
		}catch(DAOException e) {
			System.out.println("終了します");
			//e.printStackTrace();
			return;
		}
	}
}

