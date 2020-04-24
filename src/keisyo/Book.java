package keisyo;

//Magazineクラスを継承したBookクラス extendsを記述
public class Book extends Magazine {
	private String isbn; //国際標準図書番号
	private String bookName; //本の名前
	private String author; //著者
	private String pubister; //出版社
	private int price; //価格

	//引数なしのコンストラクタ
	public Book() {
	}

	//引数ありのコンストラクタ
	public Book(String field,String frequency,String isbn,
			String bookName,String author,String pubisher, int price) {
		super.field = field;
		super.frequency = frequency;
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
	}
	//メニュー　→　ソース　→　getter setterの生成
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubister() {
		return pubister;
	}

	public void setPubister(String pubister) {
		this.pubister = pubister;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
