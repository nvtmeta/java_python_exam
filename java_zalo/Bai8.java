package org.example.bt8;
import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long soLuong = Long.parseLong(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            long chietKhau = Long.parseLong(sc.nextLine());
            ds.add(new HoaDon(ma, ten, soLuong, donGia, chietKhau));
        }

        Collections.sort(ds);
        for (HoaDon x : ds) {
            System.out.println(x);
        }
    }
}

class HoaDon implements Comparable<HoaDon> {
    private String ma, ten;
    private long soLuong, donGia, chietKhau, tongTien;

    public HoaDon(String ma, String ten, long soLuong, long donGia, long chietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.tongTien = soLuong * donGia - chietKhau;
    }

    @Override
    public int compareTo(HoaDon o) {
        return Long.compare(o.tongTien, this.tongTien);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soLuong + " " + donGia + " " + chietKhau + " " + tongTien;
    }
}