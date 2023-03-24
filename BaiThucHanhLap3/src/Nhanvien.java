import java.util.Scanner;

public class Nhanvien {
    public String hoten;
    public int tuoi;
    public float hesoluong;
    final int luongcoban = 1490000;

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ho ten : ");
        hoten = sc.nextLine();
        System.out.print("\nNhap tuoi : ");
        tuoi = sc.nextInt();
        System.out.print("\nNhap he so luong : ");
        hesoluong = sc.nextFloat();
        sc.close();
    }

    public float tinhluong(float hesoluong)  {
        return (float) hesoluong * luongcoban;
    }

    public void hienthi() {
        // float luong;
        System.out.printf("\nTen : %s  - %d",hoten,tuoi);
        System.out.printf("\nTien luong nhan duoc  %f", Math.ceil(tinhluong(hesoluong)));
    }

    public static void main(String[] args) {
        Nhanvien nv1 = new Nhanvien();
        nv1.nhapthongtin();
        nv1.hienthi(); 
    }
}
    

