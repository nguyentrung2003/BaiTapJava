import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        int n, sodu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        n = sc.nextInt();

        while(n > 0) {
            sodu = n % 10;
            n /= 10;
            tong += sodu;
        }
        System.out.print("Tong : " + tong);
          
    }
}