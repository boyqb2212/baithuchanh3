/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.th3;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class DaGiac {
   protected int socanhdagiac;
   protected int []a;

    public DaGiac() {
    }

    public DaGiac(int socanhdagiac) {
        this.socanhdagiac = socanhdagiac;
    }

    public int getSocanhdagiac() {
        return socanhdagiac;
    }

    public void setSocanhdagiac(int socanhdagiac) {
        this.socanhdagiac = socanhdagiac;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap so canh ");
        this.socanhdagiac=Input.nextInt();
        System.out.println("Nhap gia tri cac canh ");
        this.a=new int[this.socanhdagiac];
        for(int i=0;i<this.socanhdagiac;i++){
            this.a[i]=Input.nextInt();
        }
    }
    public int tinhchuvi(){
        int S=0;
        for(int j=0;j<this.socanhdagiac;j++){
            S=S+this.a[j];
        }
        return S;
    }

    public void giatricaccanh(){
        for(int x:a){
            System.out.println("Gia tri tung canh lan luot la");
            System.out.println(x);
        }
    }
    
}
