import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nNhap so  : ");
            num = sc.nextInt();
            if(num % 2 == 0) {
                System.out.print("So "+num+" la so chan");
            }else {
                System.out.print("So "+num+" la so le");
            }
        }while(num >= 0);
        sc.close();
    }
    
}

