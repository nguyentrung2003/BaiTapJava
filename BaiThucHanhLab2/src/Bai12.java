import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) throws Exception {
        int row,col,arr[][];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so hang : ");
            row = sc.nextInt(); 
            System.out.print("Nhap so cot : ");
            col = sc.nextInt();
        }while(row <= 0 || col <= 0);
        arr = new int[row][col];

        ////input

        for(int i = 0; i < row ;i ++ ) {
            for(int j = 0; j < col ;j++) {
                System.out.printf("A[%d][%d] = ", i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");

        //display

        for(int i = 0; i < row ;i ++ ) {
            for(int j = 0; j < col ;j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        // System.out.printf("Max = %d", Max(row,col,arr,max));
        // Max(row,col,arr,max);

        int max = arr[0][0];
        for(int i = 0; i < row ;i ++ ) {
            for(int j = 0; j < col ;j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Phan tu lon nhat trong mang la : " +max);
        sc.close();
    }
    // public static int Max(int row,int col,int arr[][],int max) {
    //     for(int i = 0; i < row ;i ++ ) {
    //         for(int j = 0; j < col ;j++) {
    //             if(max < arr[i][j]) {
    //                 max = arr[i][j];
    //             }
    //         }
    //     }
    //     return max; 
    // }
}