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
public class XeTayGa extends XeMay{

    public XeTayGa(int chiPhiSanXuat) {
        super(chiPhiSanXuat);
    }

    
    public XeTayGa(int chiPhiSanXuat, String nhaSanXuat, int namSanXuat) {
        super(chiPhiSanXuat, nhaSanXuat, namSanXuat);
    }

    
    public int TinhGiaBan()
    {
        return super.getChiPhiSanXuat()*3;
    }
    
    public int TinhGiaBan(int hoaHong)
    {
        return super.getChiPhiSanXuat()*3;
    }

    @Override
    public String toString() {
        return "XeTayGa{" + super.toString()+ '}';
    }
    
    
}
