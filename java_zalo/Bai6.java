package org.example.bt6;
import java.io.*;
import java.util.*;

public class Bai6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine().trim();
            long dung = sc.nextLong();
            long submit = sc.nextLong();
            if (sc.hasNextLine()) sc.nextLine();
            ds.add(new SinhVien(hoTen, dung, submit));
        }
        Collections.sort(ds);
        for (SinhVien x : ds) System.out.println(x);
    }
}

class SinhVien implements Comparable<SinhVien> {
    private String hoTen;
    private long dung, submit;

    public SinhVien(String hoTen, long dung, long submit) {
        this.hoTen = hoTen;
        this.dung = dung;
        this.submit = submit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.dung != o.dung) return this.dung < o.dung ? 1 : -1;
        if (this.submit != o.submit) return this.submit > o.submit ? 1 : -1;
        return this.hoTen.compareTo(o.hoTen);
    }

    @Override
    public String toString() {
        return hoTen + " " + dung + " " + submit;
    }
}