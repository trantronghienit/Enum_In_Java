# Enum In Java

[khai báo enum](https://github.com/trantronghienit/Enum_In_Java/blob/master/src/Enum_Demo/ThuTrongTuan.java)

[một số trường hợp sử dụng](https://github.com/trantronghienit/Enum_In_Java/blob/master/src/Enum_Demo/main.java)

## để lấy và xem giá trị của enum 
vd : 
```
System.out.println("gia tri " + ThuTrongTuan.ThuHai.ordinal());
System.out.println("gia tri " +ThuTrongTuan.ThuBa.ordinal());
```

## vì sao lại sử dụng enum ?
 + vì sử dụng enum code sẽ trong sáng hơn dễ hiểu hơn , một số trường hợp cần dùng enum làm cờ hiệu làm code dễ hiểu và hiểu quả hơn 
 + bất lợi của enum đối với một biến thường ví dụ như int là enum khi khởi tạo ra 1 biến enum sử dụng thì tốn bộ nhớ hơn 

![b nh khi khai bao enum](https://cloud.githubusercontent.com/assets/18228937/18314566/c91c9224-753d-11e6-827f-7cfbc4377729.png)

+ kiểu dữ liệu gốc trong java </br>
![ki u d li u](https://cloud.githubusercontent.com/assets/18228937/18314708/59962f2c-753e-11e6-89a8-fed0f35b6fab.png)

### Sử dụng Enum với Switch Case :

```
enum ChonHinhHoc{
		HinhChuNhat,
		HinhVuong,
		HinhTron }
  
System.out.println("nhap hinh can chon: ");
		int chon = new Scanner(System.in).nextInt();
		ChonHinhHoc key = ChonHinhHoc.values()[chon];
		
		switch (key) {
		case HinhChuNhat:
    break;
  case HinhTron:
    break;
  case HinhVuong:
			break;
   }
  
```

[code demo] (https://github.com/trantronghienit/Enum_In_Java/blob/master/src/main.java)

