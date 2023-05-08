import java.util.ArrayList;
import java.util.Scanner;

public class slide24 {
    static void swap(int a,int b) {
        int tmp;
        tmp = a; 
        a = b;
        b = tmp;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n, items;
        System.out.print("Nhap so phan tu muon them vao : ");
        n = sc.nextInt();

        for(int i = 0; i < n ; i++) {
            System.out.printf("Phan tu thu %d : ",i);
            items = sc.nextInt();
            arrListInteger.add(items);
        }

        int max = arrListInteger.get(0);
        for(int i = 0; i < arrListInteger.size(); i++) {
            if(arrListInteger.get(i) > max) {
                max = arrListInteger.get(i);
            }
        }

        System.out.printf("Max = %d",max);
        sc.close();
        
        
    }
    
}
