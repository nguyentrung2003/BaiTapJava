import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,arr[];
        System.out.println("Nhap so luong phan tu trong mang : ");
      
        
        try {
            // int n, arr[];
            n = sc.nextInt();
     
        } 

        catch (NumberFormatException err) {
           
            String str = sc.nextLine();
            n = Integer.parseInt(str);
        } 

        catch(InputMismatchException err) {
            // String str = sc.nextLine();
            // for(int i = 0; i < arr.length ; i++) {
            //     System.out.println("Nhap phan tu : ");
            //     arr[i] = Integer.parseInt(str);
            // }
        }
    }
}
