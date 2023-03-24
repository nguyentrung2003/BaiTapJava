import java.util.Scanner;

public class Hinhtron {
    public float bk;
    final float pi = 3.14f;
    public float chuvi;
    public float dientich;

    public void nhapbankinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ban kinh : ");
        bk = sc.nextFloat();
        sc.close();
    }

    public float chuvi() {
        chuvi = (bk * 2) * pi;
        return chuvi;
    }

    public float dientich() {
        dientich = (bk * bk) * pi;
        return dientich;
    }

    public void hienthi() {
        System.out.printf("\nChu vi hinh tron la  %f", chuvi());
        System.out.printf("\nDien tich hinh tron la  %f", dientich());
    }

    public static void main(String[] args) {
        Hinhtron ht1 = new Hinhtron();
        ht1.nhapbankinh();
        ht1.hienthi(); 
    }
}
