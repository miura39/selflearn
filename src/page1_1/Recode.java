package page1_1;

public class Recode {

	private String product_code;
	private String order_no;
	private Integer order_branch_no;
	private Integer quantity;
	private Integer coupon_discount_fee;

	public Recode(String product_code,
				 String order_no,
				 Integer order_branch_no,
				 Integer quantity,
				 Integer coupon_discount_fee
				 ) {
		this.product_code = product_code;
		this.order_no = order_no;
		this.order_branch_no = order_branch_no;
		this.quantity = quantity;
		this.coupon_discount_fee = coupon_discount_fee;
	}
	//画面の表示メソッド
	public String toString(){
		return"学籍番号は　"+getProduct_code()
		+"氏　　名は　"+getOrder_no()
		+"氏　　名は　"+getOrder_branch_no()
		+"氏　　名は　"+getQuantity()
		+"氏　　名は　"+getCoupon_discount_fee();
		}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public Integer getOrder_branch_no() {
		return order_branch_no;
	}
	public void setOrder_branch_no(Integer order_branch_no) {
		this.order_branch_no = order_branch_no;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getCoupon_discount_fee() {
		return coupon_discount_fee;
	}
	public void setCoupon_discount_fee(Integer coupon_discount_fee) {
		this.coupon_discount_fee = coupon_discount_fee;
	}
}