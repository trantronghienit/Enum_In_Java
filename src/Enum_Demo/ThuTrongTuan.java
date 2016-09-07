package Enum_Demo;

/*
 * enum là 1 class đặc biệt bởi vì: 
 * + số đối tượng quy định trong enum 
 * + không khởi tạo được đối tượng bên ngoài enum 
 * + đối tượng cố định nhưng thuộc tính thì không   
 * 
 * vì bản chất là 1 class nên đối tượng của enum có quyền có thuộc tính, phương thức , constructor ... 
 */
public enum ThuTrongTuan {
	// Object of enum 
	ThuHai(2, "Monday", "Thứ 2"), ThuBa(3, "Tuesday", "Thứ 3"), ThuTu(4, "Wednesday", "Thứ 4"), ThuNam(5, "Thursday", "Thứ 5"),
	ThuSau(6, "Friday", "Thứ 6"), ThuBay(7, "Saturday", "Thứ 7");
	
	private int ma;
	private String TiengAnh;
	private String TiengViet;
	
	
	// constructor
	private ThuTrongTuan(int ma, String tiengAnh, String tiengViet) {
		this.ma = ma;
		TiengAnh = tiengAnh;
		TiengViet = tiengViet;
	}
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTiengAnh() {
		return TiengAnh;
	}
	public void setTiengAnh(String tiengAnh) {
		TiengAnh = tiengAnh;
	}
	public String getTiengViet() {
		return TiengViet;
	}
	public void setTiengViet(String tiengViet) {
		TiengViet = tiengViet;
	}
	
	
	
}
