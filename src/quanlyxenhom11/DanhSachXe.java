/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyxenhom11;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author jonat
 */
public class DanhSachXe {

    ArrayList<Xe> al_Xe = new ArrayList<>();

    public DanhSachXe() {
    }

    public ArrayList<Xe> getAl_Xe() {
        return al_Xe;
    }

    public void setAl_Xe(ArrayList<Xe> al_Xe) {
        this.al_Xe = al_Xe;
    }

    public void ThemDS(Xe xe) {
        if (al_Xe == null) {
            al_Xe = new ArrayList<Xe>();
        }
        al_Xe.add(xe);
    }

    public void XoaDS(Xe xe) {
        for (Xe e : al_Xe) {
            if (e.getNhaSanXuat() == xe.getNhaSanXuat() && e.getNamSanXuat() == xe.getNamSanXuat()) {
                al_Xe.remove(e);
            }
        }
    }

    public void SuaDS(Xe xe) {
        for (Xe e : al_Xe) {
            if (e.getNhaSanXuat() == xe.getNhaSanXuat());
            e.setNamSanXuat(xe.getNamSanXuat());
        }
    }

    public void HienThiDS() {
        String str = "";
        for (Xe xe : al_Xe) {
            xe.toString();
        }
    }
}
