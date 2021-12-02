/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.th3;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class SinhVien {
  protected  String hoTen;
  protected int namSinh;
  protected  int tuoi;
  protected  String lop;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int namSinh, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ho ten");
        this.hoTen=Input.nextLine();
        System.out.println("Nhap nam sinh");
        this.namSinh=Input.nextInt();
        System.out.println("Nhap tuoi");
        this.tuoi=Input.nextInt();
        Input.nextLine();
        System.out.println("Nhap lop");
        this.lop=Input.nextLine();
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", tuoi=" + tuoi + ", lop=" + lop + '}';
    }
    
    
}
