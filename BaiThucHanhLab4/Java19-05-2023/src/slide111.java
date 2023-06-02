import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
    public static void insert(LinkedList<Integer> ListNum, int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen : ");
            int data = sc.nextInt();
            ListNum.add(data);
        }
    }

    public static int avg(LinkedList<Integer> ListNum) {
        int sum = 0;
        for(int i = 0; i < ListNum.size(); i++) {
            if(ListNum.get(i) % 2 == 0) {
                sum += ListNum.get(i); 
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ListNum = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong so muon them : ");
        int n = sc.nextInt();
        /// insert
        insert(ListNum,n);
        ///avg
        System.out.println("\nAvg = " + avg(ListNum));
    }




    
}
