package com.example.projectmyapplication;

public class SoThich {
        private int  hinhAnh;
        private String soThich;

        public SoThich(int hinhAnh, String soThich) {
            this.soThich = soThich;
            this.hinhAnh = hinhAnh;
        }

    public SoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }
}


