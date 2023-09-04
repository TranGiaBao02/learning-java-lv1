
public class break_continue_return {
	/**
	 * @param agrs
	 */
	public static void main(String agrs[]) {
		int i, j = 0;
// Break không lable
//		for(i = 0; i < 10; i++) {
//			for(j = 0; j < 20; j++) {
//				if(j>10) {
//					break;
//				}
//			}
//			System.out.println("Vòng lập trong j: i= " + i + ",j= " + j);
//		}
//		System.out.println("Vòng lập ngoài: i= " + i + ",j= " + j);

// Break có lable
//		out: for(i = 0; i < 10; i++) {
//			for(j = 0; j < 20; j++) {
//				if(j>10) {
//					break out;
//				}
//			}
//			System.out.println("Vòng lập trong j: i= " + i + ",j= " + j);
//		}
//		System.out.println("Vòng lập ngoài: i= " + i + ",j= " + j);

// Continue lable
//		out: for (i = 2; i <= 9; i++) {
//			for (j = 1; j <= 10; j++) {
//				if (j > 5)
//					continue out;
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}
	
// Return
		for(i = 2; i<=9; i++) {
			for(j = 1; j<=10; j++) {
				if(j>5)
					return;
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println("B");
		}
		System.out.println("C");
	}
}
