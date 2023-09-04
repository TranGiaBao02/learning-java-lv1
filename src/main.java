import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên cà phê: ");
		String tenCaPhe = sc.nextLine();
		System.out.println("Nhập vào giá tiền: ");
		double giaTien = sc.nextDouble();
		System.out.println("Nhập vào số lượng: ");
		double soLuong = sc.nextDouble();

		oop_hoadoncf oj = new oop_hoadoncf(tenCaPhe, giaTien, soLuong);
		System.out.println("Hóa đơn cà phê: " + oj.tinhTongTien());

		System.out.println("Kiểm tra tổng tiền > 500K: " + oj.kiemTraTongTien());

		if (oj.kiemTraTongTien() == true) {
			System.out.println("% giảm: ");
			double phanTram = sc.nextDouble();
			System.out.println("Giảm giá: " + oj.giamGia(phanTram));
			System.out.println("Số tiền sau khi giảm: " + (oj.tinhTongTien() - oj.giamGia(phanTram)));
		}

	}
}
