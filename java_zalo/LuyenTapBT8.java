package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuyenTapBT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<HoaDon> hoaDons = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            String maMatHang = sc.nextLine();
            String tenMatHang = sc.nextLine();
            int soLuongMua = Integer.parseInt(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            long chietKhauHoaDon = Long.parseLong(sc.nextLine());
            hoaDons.add(new HoaDon(maMatHang, tenMatHang, soLuongMua, donGia, chietKhauHoaDon));
        }
        Collections.sort(hoaDons);

        for (HoaDon h : hoaDons) {
            System.out.println(h);
        }
        sc.close();
    }

}

class HoaDon implements Comparable<HoaDon> {
    private String maMatHang;
    private String tenMatHang;
    private int soLuongMua;
    private long donGia;
    private long chietKhauHoaDon;
    private long soTienThanhToan;

    public HoaDon(String maMatHang, String tenMatHang, int soLuongMua, long donGia, long chietKhauHoaDon) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
        this.chietKhauHoaDon = chietKhauHoaDon;
        this.soTienThanhToan = (donGia * soLuongMua) - chietKhauHoaDon;
    }

    @Override
    public String toString() {
        return  maMatHang + " " +
                 tenMatHang + " " +  soLuongMua +
                " " + donGia +
                " " + chietKhauHoaDon +
                " " + soTienThanhToan;
    }

    @Override
    public int compareTo(HoaDon o) {
        return Long.compare(o.soTienThanhToan, this.soTienThanhToan);
    }

}