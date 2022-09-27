import java.util.Scanner;

public class b1hienthihinh {
    public static void main(String[] args) {
        int d,c;
        Scanner scanner = new Scanner(System.in);
        d= scanner.nextInt();//chiều cao
        c= scanner.nextInt();//chiều rộng
        System.out.println("Vẽ hình chữ nhật:");
        for (int i=0;i<c;i++){
            for (int j = 0; j <d; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Vẽ hình tam giác 1");
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Vẽ hình tam giác 2");
        for (int i = 5; i>0; i--) {
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();


    }
}