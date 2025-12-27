package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuyenTapBT6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        ArrayList<SinhVien1> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String[] part = sc.nextLine().split("\\s+");
            String soBaiDung = part[0];
            String soSubmit = part[1];
            ds.add(new SinhVien1(hoTen, soBaiDung, soSubmit));
        }
        Collections.sort(ds);
        for (SinhVien1 sv: ds){
            System.out.println(sv);
        }
    }
}

class SinhVien1 implements Comparable<SinhVien1> {
    private String hoTen;
    private int soBaiLamDung;
    private int tongSoLuotSubmit;
    public SinhVien1(String hoTen, String soBaiLamDung, String tongSoLuotSubmit) {
        this.hoTen = hoTen;
        this.soBaiLamDung = Integer.parseInt(soBaiLamDung);
        this.tongSoLuotSubmit = Integer.parseInt(tongSoLuotSubmit);

    }
    @Override
    public String toString() {
        return  hoTen + " " + soBaiLamDung + " " + tongSoLuotSubmit;
    }

    @Override
    public int compareTo(SinhVien1 o) {

        // 1. Số bài làm đúng: giảm dần
        if (this.soBaiLamDung != o.soBaiLamDung) {
            return Integer.compare(o.soBaiLamDung, this.soBaiLamDung);
        }

        // 2. Số lượt submit: tăng dần
        if (this.tongSoLuotSubmit != o.tongSoLuotSubmit) {
            return Integer.compare(this.tongSoLuotSubmit, o.tongSoLuotSubmit);
        }

        // 3. Họ tên: thứ tự từ điển
        return this.hoTen.compareTo(o.hoTen);
    }
}
