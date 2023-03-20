import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        a = sc.nextInt();
        System.out.print("Nhap so b : ");
        b = sc.nextInt();
        System.out.print("Tong cua 2 a va b so vua nhap la : " + (a + b)+"\n");
        System.out.print("Hieu cua 2 a va b so vua nhap la : " + (a - b)+"\n");
        System.out.print("Tich cua 2 a va b so vua nhap la : " + (a * b)+"\n");
        System.out.print("Thuong cua 2 a va b so vua nhap la : " + (a / b)+"\n");
        System.out.print("Chia phan du cua 2 a va b so vua nhap la : " + (a % b)+"\n");
        if(a == b) {
            System.out.println(a +  " = "  + b);
        }else if(a > b) {
            System.out.println(a +  " > "  + b);

        }else if(a < b) {
            System.out.println(a +  " < "  + b);
        }
        sc.close();
    }

}
