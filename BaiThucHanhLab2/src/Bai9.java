import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) throws Exception {
        String str,str1 = " ",str2=" ";
        int cout = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        str = sc.nextLine();
        String upcase = str.toLowerCase();
        String lowercase = str.toUpperCase();
        int arrlength = str.length();
        for (int i = 0; i < arrlength; i++) {
            
            if (str.charAt(i) != upcase.charAt(i)) {
                cout++;
                str1 += str.charAt(i);
                str2 = (str1);
            }
        }
        System.out.print("\nCo "+cout+" ki tu viet Hoa : "+ str2.substring(0));
        cout = 0;
        str1 = " ";
        str2 = " ";
        for (int i = 0; i < arrlength; i++) {
            if (str.charAt(i) != lowercase.charAt(i)) {
                cout++;
                str1 += str.charAt(i);
                str2 = (str1);
            }
        }
        System.out.print("\nCo "+cout+" ki tu viet Thuong : "+ str2.substring(0));
        cout = 0;
        for (int i = 0; i < arrlength; i++) {
           
            if (str.charAt(i) == lowercase.charAt(i) && str.charAt(i) == upcase.charAt(i)) {
                cout++;
                str1 += str.charAt(i);
                str2 = (str1);
            }
         
        }
        System.out.print("\nCo "+cout+" ki tu la So: "+ str2.substring(cout));
        sc.close();
    }


}
