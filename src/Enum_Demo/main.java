package Enum_Demo;

public class main {

	// kiểu truyền thống tên biến và giá trị của nó thôi 
	public static final int THUHAI = 1;
	
	static int test(int e){
		return e;		
	}
	
	public static void main(String[] args) {
//		// được khai báo biến nhưng không đc khởi tạo 
		//ThuTrongTuan object = ThuTrongTuan.ThuHai;
//		// set thuộc tính thay đổi 
		System.out.println("gia tri " + ThuTrongTuan.ThuHai.ordinal());
		System.out.println("gia tri " +ThuTrongTuan.ThuBa.ordinal());
//		System.out.println("gia tri " +ThuTrongTuan.ThuTu);
//		System.out.println("gia tri " +ThuTrongTuan.ThuNam);
//		System.out.println("gia tri " +ThuTrongTuan.ThuSau);
//		System.out.println("gia tri " +ThuTrongTuan.ThuBay);
//		
//
//		//System.out.println("thay đổi mã của thứ 2 :" + object.getMa());
//		
//		// sử dụng enum trong switch case 
//		ThuTrongTuan object1 = null;
////		switch (object1) {
////		case ThuHai:
////			System.out.println("ma :" + object1.getMa());
////			break;
////		case ThuBa:
////			System.out.println("ma :" + object1.getMa());
////			break;
////		case ThuTu:
////			System.out.println("ma :" + object1.getMa());
////			break;
////		case ThuNam:
////			System.out.println("ma :" + object1.getMa());
////			break;
////		case ThuSau:
////			System.out.println("ma :" + object1.getMa());
////			break;
////		case ThuBay:
////			System.out.println("ma :" + object1.getMa());
////			break;
////		default:
////			break;
////		}
//		
	}

}
