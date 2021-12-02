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
public class BienLai extends KhachHang {
   private float chiSoCu;
   private float chiSoMoi;
   private float soTienPhaiTra;

    public BienLai() {
    }

    public BienLai(float chiSoCu, float chiSoMoi) {
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public BienLai(float chiSoCu, float chiSoMoi, String hoTenChuNha, String soNha, String maSoCongTo) {
        super(hoTenChuNha, soNha, maSoCongTo);
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public float getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(float chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public float getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(float chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
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

    public void setSoTienPhaiTra(float soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        super.nhapTT();
        System.out.println("Nhap chi so cu");
        this.chiSoCu=Input.nextFloat();
        System.out.println("Nhap chi so moi");
        this.chiSoMoi=Input.nextFloat();
    }
    public float tinhtien(){
     return   this.soTienPhaiTra=(this.chiSoMoi-this.chiSoCu)*(float)850;
    }

    @Override
    public String toString() {
        return super.toString()+"BienLai{" + "chiSoCu=" + chiSoCu + ", chiSoMoi=" + chiSoMoi + ", soTienPhaiTra=" + soTienPhaiTra + '}';
    }
    
}
