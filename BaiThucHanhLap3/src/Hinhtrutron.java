import java.util.Scanner;

public class Hinhtrutron {
    public float bk;
    public  float cc;
    final float pi = 3.14f;
    public float chuvi;
    public float dientich;
    public float thetich;

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh : ");
        bk = sc.nextFloat();
        System.out.print("Nhap chieu cao : ");
        cc = sc.nextFloat();
        sc.close();
    }

    public float chuvi() {
        chuvi = 2*pi*bk*cc;
        return chuvi;

    }

    public float dientich() {
        dientich = 2*pi*bk*(bk + cc);
        return dientich;
    }

    public float thetich() {
        thetich = pi*bk*bk*cc;
        return thetich;
    }

    public void hienthi() {
        System.out.printf("\nChu vi hinh tru tron la  %f", chuvi());
        System.out.printf("\nDien tich hinh tru tron la  %f", dientich());
        System.out.printf("\nThe tich hinh tru tron la  %f", thetich());
    }

    public static void main(String[] args) {
        Hinhtrutron htt1 = new Hinhtrutron();
        htt1.nhapthongtin();
        htt1.hienthi(); 
    }
}
