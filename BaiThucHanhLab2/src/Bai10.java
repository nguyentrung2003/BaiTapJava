import java.util.Scanner;

public class Bai10 {
    public static void main(String[] agrs) {
        String str;
        char value;
        int cout = 0;
        int strlength;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap chuoi : ");
            str = sc.nextLine();

        }while(str.length() > 80);
        System.out.print("Nhap ki tu muon kiem tra : ");
        value = sc.next().charAt(0);
        strlength = str.length();
        for(int i = 0; i < strlength; i++) {
            if(value == str.charAt(i)) {
                cout++;
            }
        }
        System.out.printf("So lan xuat hien cua %c la a : %d",value,cout);
        sc.close();

    }
    
}
