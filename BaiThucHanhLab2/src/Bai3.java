
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws Exception {
        String name;
        int year,age;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\nNhap ten cua ban : ");
            name = sc.nextLine();
            System.out.print("Nhap nam sinh cua ban : ");
            year = sc.nextInt();
            age = 2023 - year;
            
            if(age < 16) {
                System.out.print("\nBan "+name+" o tuoi vi thanh nien");
            }else {
                if(age == 16) {
                    System.out.print("\nBan "+name+" o tuoi truong thanh");
                }else{
                    System.out.print("\nBan "+name+" da gia");
                }
            }
        }while(year > 0);
        sc.close();

    }
    
}


