import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) throws Exception {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap tu 1 -> 7 tuong ung tu thu 2 -> chu nhat ");

    
        do {
            System.out.print("\nNhap ngay : ");
            day = sc.nextInt();
            switch(day) {
                case 1:
                System.out.print("Hom nay la thu 2 nhe <3");
                break;
                case 2:
                System.out.print("Hom nay la thu 3 nhe <3");
                break;
                case 3:
                System.out.print("Hom nay la thu 4 nhe <3");
                break;
                case 4:
                System.out.print("Hom nay la thu 5 nhe <3");
                break;
                case 5:
                System.out.print("Hom nay la thu 6 nhe <3");
                break;
                case 6:
                System.out.print("Hom nay la thu 7 nhe <3");
                break;
                case 7:
                System.out.print("Hom nay la thu chu nhat nhe <3");
                break;
                default:
                System.out.print("Khong phai ngay trong tuan roi !");
                break;
            }
            
        }while(day <= 7); 
        sc.close();
    
    }
}

