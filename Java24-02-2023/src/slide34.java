import java.util.Scanner;
import java.lang.Math;

public class slide34 {
    public static void main(String[] args) {
        float a,b,c;
        double delta,x1,x2;
        Scanner myNum = new Scanner(System.in);
        System.out.print("Nhap a : ");
        a = myNum.nextFloat();
        System.out.print("Nhap b : ");
        b = myNum.nextFloat();
        System.out.print("Nhap c : ");
        c = myNum.nextFloat();
        delta = Math.pow(b,2) - 4 * a * c;
        
        if(a == 0 ) {
            if(b == 0) {
                System.out.println("Vo nghiem");
            }else {
                System.out.println("Phuong trinh co mot nghiem x = " + (-c/b));
            }
        }

        if(delta > 0) {
            x1 =(float) ((-b) + Math.sqrt(delta))/2*a;
            x2 =(float) ((-b) - Math.sqrt(delta))/2*a;
            System.out.println("Phuong trinh co 2 nghiem :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        }else if(delta == 0 ) {
            System.out.println("Phuong trinh co mot nghiem x = " + (-b/2*a));
        }else {
            System.out.println("Vo nghiem");
        } 
    }
    
}
