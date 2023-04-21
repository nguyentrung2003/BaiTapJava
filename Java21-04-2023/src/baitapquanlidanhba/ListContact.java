package baitapquanlidanhba;

import java.util.ArrayList;

public class ListContact extends Contact {
    ArrayList <String> ContactList = new ArrayList<String>();

    public ArrayList<String> getContactList() {
        return ContactList;
    }

    public void setContactList(ArrayList<String> contactList) {
        ContactList = contactList;
    }

    @Override
    void insertContact(String name, String phone_number) {
        boolean isHave = false;
        for (String s : ContactList) {
            if (s.contains(name)) {
                isHave = true;
                if (!s.contains(phone_number)) {
                    s += ":" + phone_number;
                } else {
                    System.out.print("\n So nay da ton tai");
                }
            }
        }
        if (!isHave) {
            ContactList.add(name + "," + phone_number);
        }
    }

    @Override
    void deleteContact(String name) {
        boolean search = false;
        for (String s : ContactList) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                search = true;
                ContactList.remove(s);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
        if (!search) {
            System.out.println("Khong ton tai");
        }
    }

    @Override
    void updateContact(String name, String new_number) {
        String s = name;
        s = s.substring(0, s.indexOf(","));
        ContactList.set(ContactList.indexOf(s), s + "," + new_number);
        System.out.println("Thay doi thanh cong");
    }

    @Override
    void searchContact(String name) {
        boolean search = false;
        for (String s : ContactList) {
            if (s.contains(name)) {
                search = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!search) {
            System.out.println("Khong ton tai");
        }
    }

}



