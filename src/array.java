import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		double mang_1[];
		double[] mang_2;
		
		mang_1 = new double[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<mang_1.length; i++) {
			System.out.println("Nhập phần tử thứ " + i + ": ");
			mang_1[i] = sc.nextDouble();
			
		}
		double sum = 0;
		for (int i = 0; i < mang_1.length; i++) {
			sum += mang_1[i];
		}
		System.out.println("Tổng: " + sum);
		
		mang_2 = new double[] {1,2,3,4,5};
		for (int i = 0; i < mang_2.length; i++) {
			System.out.println("Phần tử thứ " + i + ": " + mang_2[i]);
		}
	}
}
