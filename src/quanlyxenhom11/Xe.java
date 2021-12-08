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
public class Xe {
    private String nhaSanXuat;
    private int namSanXuat;

    public Xe() {
    }

    public Xe(String nhaSanXuat, int namSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
        this.namSanXuat = namSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Xe{" + "nhaSanXuat=" + nhaSanXuat + ", namSanXuat=" + namSanXuat + '}';
    }
}
