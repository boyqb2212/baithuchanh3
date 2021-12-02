/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.th3;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class KhachHang {
   protected String hoTenChuNha;
   protected String soNha;
   protected String maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoTenChuNha, String soNha, String maSoCongTo) {
        this.hoTenChuNha = hoTenChuNha;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTenChuNha() {
        return hoTenChuNha;
    }

    public void setHoTenChuNha(String hoTenChuNha) {
        this.hoTenChuNha = hoTenChuNha;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ho ten chu nha");
        this.hoTenChuNha=Input.nextLine();
        System.out.println("Nhap so nha");
        this.soNha=Input.nextLine();
        System.out.println("Nhap ma so cong to dien");
        this.maSoCongTo=Input.nextLine();
    }

    @Override
    public String toString() {
        return "KhachHang{" + "hoTenChuNha=" + hoTenChuNha + ", soNha=" + soNha + ", maSoCongTo=" + maSoCongTo + '}';
    }
    
}
