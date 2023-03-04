import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        String tmpString = " ";
        Scanner num = new Scanner(System.in);
        do{
            System.out.print("Nhap so : ");
            number = num.nextInt();
            sum += number;
            tmpString = (sum +" + "+ number);
            
        }while(sum < 100);
        num.close();
        System.out.print("Tong : " + tmpString.substring(1) + " = " + sum);
    }
}