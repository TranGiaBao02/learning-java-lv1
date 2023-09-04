import java.util.Scanner;

public class try_catch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.println("Nhập vào số nguyên: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhập dữ liệu không chính xác!!");
		} finally {
			System.out.println("Đã hoàn thành thao tác");
		}
	}
}
