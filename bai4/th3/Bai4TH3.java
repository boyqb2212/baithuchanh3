/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.th3;

import java.util.ArrayList;

/**
 *
 * @author boyqb2212
 */
public class Bai4TH3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        TamGiac s=new TamGiac();
        s.nhapTT();
        s.giatricaccanh();
        System.out.println("chu vi la :"+s.tinhchuvi());
        System.out.println("dien tich la :"+s.tinhdientich());
        
    }
    
}
