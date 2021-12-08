/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyxenhom11;

/**
 *
 * @author jonat
 */
public class XeHoi extends Xe{
    private int chiPhiSanXuat;

    public XeHoi() {
    }

    public XeHoi(int chiPhiSanXuat) {
        this.chiPhiSanXuat = chiPhiSanXuat;
    }

    public XeHoi(int chiPhiSanXuat, String nhaSanXuat, int namSanXuat) {
        super(nhaSanXuat, namSanXuat);
        this.chiPhiSanXuat = chiPhiSanXuat;
    }
    
   
    public int TinhGiaBan() {
        return chiPhiSanXuat * 4;
    }

    public int TinhGiaBan(int Hoahong) {
        return chiPhiSanXuat * 4 + Hoahong;
    }

    @Override
    public String toString() {
        return "XeHoi{" + super.toString() +"chiPhiSanXuat=" + chiPhiSanXuat + '}';
    }
    
}
