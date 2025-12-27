package org.example.bt7;
import java.util.*;

public class Bai7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<MonHoc> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String hinhThuc = sc.nextLine().trim();
            ds.add(new MonHoc(ma, ten, hinhThuc));
        }
        Collections.sort(ds);
        for (MonHoc x : ds) System.out.println(x);
    }
}

class MonHoc implements Comparable<MonHoc> {
    private String ma, ten, hinhThuc;

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhThuc;
    }
}