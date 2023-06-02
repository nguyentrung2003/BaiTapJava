
import java.util.LinkedList;
import java.util.Scanner;

public class slide112 {
    public String name, thongtin = null;
    double point;

    public void data() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien : ");
        name = sc.nextLine();
        if (!name.isEmpty()) {
            System.out.println("Nhap diem sinh vien : ");
            point = sc.nextDouble();
        }
    }

    public static void insert(LinkedList<slide112> DsSv, int n) {
        for (int i = 0; i < n; i++) {
            slide112 std = new slide112();
            std.data();
            DsSv.add(std);
        }
    }

    public static void display(LinkedList<slide112> DsSv) {
        for (int i = 0; i < DsSv.size(); i++) {
            System.out.print("\n" + DsSv.get(i).name + "\t" + DsSv.get(i).point);
        }
    }

    public static void svThiLai(LinkedList<slide112> DsSv, LinkedList<slide112> SvThiLai) {
        for (int i = 0; i < DsSv.size(); i++) {
            if (DsSv.get(i).point <= 5) {
                SvThiLai.add(DsSv.get(i));
            }
            // System.out.println("Khong co sinh vien thi lai !");
        }
        display(SvThiLai);
    }

    public static void svDiemCao(LinkedList<slide112> DsSv, LinkedList<slide112> SvDiemCao) {
        double max = DsSv.get(0).point;
        for (int i = 1; i < DsSv.size(); i++) {
            if (DsSv.get(i).point > max) {
                max = DsSv.get(i).point;
            }
        }

        for (int i = 1; i < DsSv.size(); i++) {
            if (DsSv.get(i).point > max) {
                max = DsSv.get(i).point;
            }
        }

       
        // display(SvDiemCao);
    }

    public static void main(String[] args) {
        LinkedList<slide112> DsSV = new LinkedList<>();
        LinkedList<slide112> SvThiLai = new LinkedList<>();
        LinkedList<slide112> SvDiemCao = new LinkedList<>();
        int n = 3;
        insert(DsSV, n);
        System.out.println("\nDanh sach sinh vien them vao : ");
        display(DsSV);
        System.out.print("\n\nDanh sach sinh vien thi lai : ");
        svThiLai(DsSV, SvThiLai);
        System.out.print("\n\nDanh sach sinh vien diem cao : ");
        svThiLai(DsSV, SvDiemCao);
    }

}
