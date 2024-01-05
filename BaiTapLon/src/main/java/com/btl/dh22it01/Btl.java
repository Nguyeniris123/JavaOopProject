/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.dh22it01;

import java.io.FileNotFoundException;

/**
 *
 *
 * @author NGUYEN
 */
public class Btl {

    public static void main(String[] args) throws FileNotFoundException {
       // Menu mn = new Menu();
       QuanLiMonHoc ql = new QuanLiMonHoc();
        ql.docDsMonHoc();
        ql.timKiem(1).hienThiMonHoc();
        System.out.println("com.btl.dh22it01.Btl.main()");
        ql.timListMonHocTienQuyet(ql.timKiem(1)).forEach(p->p.hienThiMonHoc());
        
    }
}
