import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) throws Exception {
        
        int length,myArray[],sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap chieu dai cua mang : ");
            length = sc.nextInt();
        }while(length <= 0);
        myArray = new int [length];

        //push data
        for(int i = 0; i < length; i++) {
            System.out.printf("A[%d] = ",i);
            myArray[i] = sc.nextInt();
            if(myArray[i] % 2 == 0){
                sum += myArray[i];
            }
        }
        System.out.print("Tong cac phan tu chan trong mang  = " + sum);
        sc.close();
    }
    
}
