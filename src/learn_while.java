import java.util.Scanner;

// Đổi số thập phân sang nhị phân
public class learn_while {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị thập phân: ");
		n = sc.nextInt();
		
		String nhiPhan = "";
		while(n>0) {
			nhiPhan = (n%2) + nhiPhan;
			n = n/2;
		}
		System.out.println("Nhị phân: " + nhiPhan);
	}
}
