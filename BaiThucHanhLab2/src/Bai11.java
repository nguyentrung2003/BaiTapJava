import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) throws Exception {
        int arraylength,myarray[],tmp;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap do dai cua mang : ");
            arraylength = sc.nextInt();
            myarray = new int[arraylength];
            
            //nhap mang 
            System.out.print("Nhap phan tu trong mang : \n");
            for(int i = 0; i < arraylength; i++) {
                System.out.printf("A[%d] = ",i);
                myarray[i] = sc.nextInt();
            }

            ///Hien thi
            System.out.print("Mang truoc khi sap xep \n");
            for(int i = 0; i < arraylength; i++) {
                System.out.printf("A[%d] = %d",i,myarray[i]);
                System.out.print("\t");
            }

            //Thuat toan sap xep
            for(int i = 0 ; i < arraylength - 1 ;i++) {
                for(int j = i + 1; j < arraylength;j++) {
                    if(myarray[i] > myarray[j]) {
                        tmp = myarray[i];
                        myarray[i] = myarray[j];
                        myarray[j] = tmp;
                    }

                }
            }

            //Hien thi sau sap xep
            System.out.print("\nMang sau khi sap xep \n");
            for(int i = 0; i < arraylength; i++) {
                System.out.printf("A[%d] = %d",i,myarray[i]);
                System.out.print("\t");
            }

        }while(arraylength <= 0);
        sc.close();
    }
    
}
