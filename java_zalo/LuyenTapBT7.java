package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuyenTapBT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> monHocs = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String hinhThucThi = sc.nextLine();
            monHocs.add(new MonHoc(maMon, tenMon, hinhThucThi));
        }
        Collections.sort(monHocs);

        for (MonHoc monHoc : monHocs) {
            System.out.println(monHoc);
        }
        sc.close();
    }
}

class MonHoc implements Comparable<MonHoc> {
    private String maMon, tenMon, hinhThucThi;

    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon  + " " + hinhThucThi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.maMon.compareTo(o.maMon);
    }
}
