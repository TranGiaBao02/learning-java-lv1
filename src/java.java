import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số 1 -> 8: ");
        n = sc.nextInt();
        switch(n) {
        case 1:{
        	System.out.println("Thứ 2");
        	break;
        	}
        case 2:{
        	System.out.println("Thứ 3");
        	break;
        	}
        case 3:{
        	System.out.println("Thứ 4");
        	break;
        	}
        case 4:{
        	System.out.println("Thứ 5");
        	break;
        	}
        case 5: {
        	System.out.println("Thứ 6");
        	break;
        	}
        case 6:{
        	System.out.println("Thứ 7");
        	break;
        	}
        case 7:{
        	System.out.println("CN");
        	break;
        	}
        case 8:{
        	break;
        	}
        }
    }
}
