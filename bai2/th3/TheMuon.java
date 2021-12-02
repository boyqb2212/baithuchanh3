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
public class TheMuon extends SinhVien {
   private String soPhieuMuon;
   private String ngayMuon;
   private String ngayTra;
   private String maSach;

    public TheMuon() {
    }

    public TheMuon(String soPhieuMuon, String ngayMuon, String ngayTra, String maSach) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.maSach = maSach;
    }

    public TheMuon(String soPhieuMuon, String ngayMuon, String ngayTra, String maSach, String hoTen, int namSinh, int tuoi, String lop) {
        super(hoTen, namSinh, tuoi, lop);
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.maSach = maSach;
    }

    public String getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(String soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public int getNamSinh() {
        return namSinh;
    }

    @Override
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public int getTuoi() {
        return tuoi;
    }

    @Override
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String getLop() {
        return lop;
    }

    @Override
    public void setLop(String lop) {
        this.lop = lop;
    }
    @Override
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap so phieu muon");
        this.soPhieuMuon=Input.nextLine();
        System.out.println("Nhap ngay muon");
        this.ngayMuon=Input.nextLine();
        System.out.println("Nhap ngay tra");
        this.ngayTra=Input.nextLine();
        System.out.println("Nhap ma sach");
        this.maSach=Input.nextLine();
        super.nhapTT();
    }

    @Override
    public String toString() {
        return super.toString()+"TheMuon{" + "soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" + ngayMuon + ", ngayTra=" + ngayTra + ", maSach=" + maSach + '}';
    }
    
}
