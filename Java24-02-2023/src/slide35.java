import java.util.Scanner;
public class slide35 {
    public static void main(String[] args) {
        float a,b,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        a = sc.nextInt();
        System.out.print("Nhap b : ");
        b = sc.nextInt();
        min = a > b ? b : a;
        System.out.print("Min  : " + min);
    }
}