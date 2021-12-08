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
public class XeMay extends Xe {

    private int chiPhiSanXuat;

    public XeMay() {
    }

    public XeMay(int chiPhiSanXuat) {
        this.chiPhiSanXuat = chiPhiSanXuat;
    }

    public XeMay(int chiPhiSanXuat, String nhaSanXuat, int namSanXuat) {
        super(nhaSanXuat, namSanXuat);
        this.chiPhiSanXuat = chiPhiSanXuat;
    }

    public int getChiPhiSanXuat() {
        return chiPhiSanXuat;
    }

    public void setChiPhiSanXuat(int chiPhiSanXuat) {
        this.chiPhiSanXuat = chiPhiSanXuat;
    }

    public int TinhGiaBan() {
        return chiPhiSanXuat * 2;
    }

    public int TinhGiaBan(int Hoahong) {
        return chiPhiSanXuat * 2 + Hoahong;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString() + "chiPhiSanXuat=" + chiPhiSanXuat + '}';
    }

    
}
