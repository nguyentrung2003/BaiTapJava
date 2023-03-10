import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int length,myArray[],tmp;
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
        }
        
        //sort
        for(int i = 0 ; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++) {
                if(myArray[i] > myArray[j]) {
                    tmp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = tmp;
                }
            }
        }

        //display
        for(int i = 0; i < length; i++) {
            System.out.print(myArray[i]  + "\t");
        }
        sc.close();
        
    }
    
}
