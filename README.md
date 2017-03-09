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

### Android - Thay thế Enums bằng Enumerated Annotations 
+ vì những bất lợi của ENUM Android Team khuyến cáo rằng bạn nên tránh sử dụng enums bất cứ khi nào bạn có thể. 
+ Enums rất tiện lợi trong Java nhưng không may mắn nó có thể là nỗi đau khi mà kích thước và tốc độ là cần thiết

***IntDef***  là một cách để thay thế integer enum nơi mà tham số chỉ chấp nhận các giá trị int nào đó. Ví dụ chúng ta muốn kiểu của một feed item như sau:
```
public class ItemTypeDescriptor {
  public static final int TYPE_MUSIC = 0;
  public static final int TYPE_PHOTO = 1;
  public static final int TYPE_TEXT = 2;

  public final int itemType;

  public ItemTypeDescriptor(int itemType) {
    this.itemType = itemType;
  }
}
=======================================================
Bây giờ không có gì đảm bảo rằng itemType được truyền vào hàm tạo là hợp lệ. Chúng ta cần sử dụng IntDef để đảm bảo rằng giá trị truyền vào là một trong những giá trị mong muốn bằng cách thêm các annotations:

public class ItemTypeDescriptor {
  // ... type definitions
  // Describes when the annotation will be discarded
  @Retention(RetentionPolicy.SOURCE)
  // Enumerate valid values for this interface
  @IntDef({ TYPE_MUSIC, TYPE_PHOTO, TYPE_TEXT })
  // Create an interface for validating int types
  public @interface ItemTypeDef { }
  // Mark the argument as restricted to these enumerated types
  public ItemTypeDescriptor(@ItemTypeDef int itemType) {
    this.itemType = itemType;
  }
}

```

***StringDef*** StringDef tương tự như IntDef, là một cách thay thế String enum.

```
public class FilterColorDescriptor {
  public static final String FILTER_BLUE = "blue";
  public static final String FILTER_RED = "red";
  public static final String FILTER_GRAY = "gray";

  public final String filterColor;

  public FilterColorDescriptor(String filterColor) {
    this.filterColor = filterColor;
  }
}

==========================================
Cũng không có gì đảm bảo giá trị filterColor truyền vào là hợp lệ cho nên phải sử dụng StringDef để đảm bảo giá trị truyền vào là một trong các giá trị được định nghĩa phía trên.

public class FilterColorDescriptor {
  // ... type definitions
  // Describes when the annotation will be discarded
  @Retention(RetentionPolicy.SOURCE)
  // Enumerate valid values for this interface
  @StringDef({ FILTER_BLUE, FILTER_RED, FILTER_GRAY })
  // Create an interface for validating int types
  public @interface FilterColorDef { }
  // Mark the argument as restricted to these enumerated types
  public FilterColorDescriptor(@FilterColorDef String filterColor) {
    this.filterColor = filterColor;
  }
}
```

+ Nhờ đó rõ ràng là method chấp nhập giá trị String như sau:
![enum](https://cloud.githubusercontent.com/assets/18228937/23754204/befb119c-050e-11e7-9790-e03d490381bb.png)


[code demo] (https://github.com/trantronghienit/Enum_In_Java/blob/master/src/main.java)

