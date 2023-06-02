import java.util.ArrayList;
import java.util.Scanner;

public class slide110 {
   
    public static void insert(ArrayList<Integer> ListNum, int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen : ");
            int data = sc.nextInt();
            ListNum.add(data);
        }
    }

    public static void  display(ArrayList<Integer> ListNum) { 
        for(int i = 0; i < ListNum.size(); i++) {
            System.out.print(ListNum.get(i) + "\t");
        } 
    }

    
    public static void remove(ArrayList<Integer> ListNum) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao gia tri can xoa : ");
        int data = sc.nextInt();
        for(int i = 0; i < ListNum.size(); i++) {
            if(ListNum.get(i).equals(data)) {
                ListNum.remove(i);
            }
        } 
        display(ListNum);
    }


    public static int max(ArrayList<Integer> ListNum) { 
        int max = ListNum.get(0);
        for(int i = 1; i < ListNum.size(); i++) {
            if(ListNum.get(i) > max) {
                max = ListNum.get(i);
            }
            
        } 
        return max;
    }

    public static void sort(ArrayList<Integer> ListNum) {
        System.out.println("Sap xep tang dan : ");
        ListNum.sort((o1,o2) -> o1 - o2);
        System.out.println();
        display(ListNum);

    }

    public static void main(String[] args) {
        ArrayList<Integer> ListNum = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong so muon them : ");
        int n = sc.nextInt();
        /// insert
        insert(ListNum,n);
        // display
        display(ListNum);
        //max
        System.out.println("\nMax = " + max(ListNum));
        // remove
        remove(ListNum);
        //sort
        sort(ListNum);
    } 
}
