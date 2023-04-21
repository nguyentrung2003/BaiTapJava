package baitapquanlidanhba;

import java.util.Scanner;

public class ManegeContactList {
    static ListContact lc = new ListContact();
    static Scanner sc = new Scanner(System.in);
    static String name, phone_number;

    static void Menu() {
        System.out.println("MENU");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Search");
    }

    public static void main(String[] args) {
        do{
            Menu();
            System.out.print("Nhap lua chon : ");
            switch(sc.nextInt()) {
                case 1:
                    insertContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    return;
            }   
        }while(sc.nextInt() < 6);
        
    }

    public static void insertContact() {
        sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Nhap so dien thoai : ");
        phone_number = sc.nextLine();
        lc.insertContact(name,phone_number);
    }

    public static void deleteContact() {
        sc.nextLine();
        System.out.print("Nhap ten can xoa : ");
        name = sc.nextLine();
        lc.deleteContact(name);
    }

    public static void updateContact() {
        boolean checked = false;
        sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        for(String s: lc.ContactList) {
            if(name.equals(s.substring(0, s.indexOf(",")))) {
                checked = true;
                System.out.print("Nhap so muon thay muon thay the : ");
                phone_number = sc.nextLine();
                lc.updateContact(name, phone_number);
                break;
            }
        }
        if(!checked) {
            System.out.println("Khong ton tai");
        }
    }

    public static void searchContact() {
        sc.nextLine();
        System.out.print("Nhap ten can tim kiem : ");
        name = sc.nextLine();
        lc.searchContact(name);
    }
    

}
