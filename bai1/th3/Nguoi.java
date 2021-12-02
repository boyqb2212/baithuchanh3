/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.th3;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class Nguoi {
   private String hoTen;
   private String diaChi;
   private int namSinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ho ten");
        this.hoTen=Input.nextLine();
        System.out.println("Nhap dia chi");
        this.diaChi=Input.nextLine();
        System.out.println("Nhap nam sinh");
        this.namSinh=Input.nextInt();
    }
    public void inTT(){
        System.out.println("Ho va ten :"+this.hoTen);
        System.out.println("Dia chi :"+this.diaChi);
        System.out.println("Nam sinh:"+this.namSinh);
    }
}
