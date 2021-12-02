/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.th3;

/**
 *
 * @author boyqb2212
 */
public class TamGiac extends DaGiac{

    @Override
    public void nhapTT() {
        super.nhapTT();
        while(this.a[0]+this.a[1]<=this.a[2]||this.a[0]+this.a[2]<=this.a[1]||this.a[2]+this.a[1]<=this.a[0]){
            super.nhapTT();
        }
    }

    @Override
    public int tinhchuvi() {
        return super.tinhchuvi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giatricaccanh() {
        super.giatricaccanh(); //To change body of generated methods, choose Tools | Templates.
    }
    public float tinhdientich(){
        float p=((float)this.tinhchuvi()/2);
        float X=(float)Math.sqrt(p*(p-this.a[0])*(p-this.a[1])*(p-this.a[2]));
        return X;
    }
}
