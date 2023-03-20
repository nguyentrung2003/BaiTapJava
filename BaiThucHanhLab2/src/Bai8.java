import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) throws Exception {
        int n,giaithua = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nNhap so n : ");
            n = sc.nextInt();
        }while(n <= 0);
        if(n == 1) {
            System.out.print("Gia thua : " + giaithua);
        }else {
            for(int i = 1 ; i <= n ;i++) {
                giaithua *= i;
            }
            System.out.print("Gia thua : " + giaithua);
        }
        sc.close();
    

    }
    
}

