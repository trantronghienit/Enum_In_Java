package Example2;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class main {

	enum ChonHinhHoc{
		HinhChuNhat,
		HinhVuong,
		HinhTron ;
		
		private int tinhChuVi ;
		private int tinhDienTich;
		
		int checkSwitch(int check){
			if(check == 1){
				return tinhChuVi = 1;
			}else if(check == 2){
				return tinhDienTich = 2;
			}
			return 0 ; // lựa chọn ko đúng 
		}

		public int getTinhChuVi() {
			return tinhChuVi;
		}

		public int getTinhDienTich() {
			return tinhDienTich;
		}
	
		
		
	
	}
	public static void main(String[] args) {
		
		System.out.println("nhap hinh can chon: ");
		int chon = new Scanner(System.in).nextInt();
		ChonHinhHoc key = ChonHinhHoc.values()[chon];
		
		switch (key) {
		case HinhChuNhat:
			System.out.println("lua chon Hinh chu nhat!!! Xin Nhap lua chon \n 1.tinh Chu vi \n 2. tinh dien tich: ");
			//formKeyPressed(13);   // 13 là key endter
			int chontinh = new Scanner(System.in).nextInt();
			int keychon = ChonHinhHoc.HinhChuNhat.checkSwitch(chontinh);
			
			switch (keychon) {
			case 1:
				System.out.println("Tinh chu vi Hinh chu nhat");
				
				break;
			case 2:
				System.out.println("Tinh dien tich Hinh chu nhat");
			default:
				System.out.println("Sai lua chon");
				break;
			}
			break;
		case HinhTron:
			System.out.println("lua chon Hinh tron");
			break;
		case HinhVuong:
			System.out.println("lua chon Hinh vuong");
			break;
		default:
			System.out.println("Ngoai lua chon");
			break;
		}
	}
	
	
	private static void formKeyPressed(int evt) {
		if (evt == KeyEvent.VK_ENTER){
			System.exit(0);
		}
	} 

}
