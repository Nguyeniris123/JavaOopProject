/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.dh22it01;

/**
 *
 * @author NGUYEN
 */
public enum KhoiKienThuc {
    Co_So("Co so"),
    Co_So_Nganh("Co so nganh"),
    Chuyen_Nganh("Chuyen nganh");
    
    private String KKT;
    private KhoiKienThuc(String KKT) {
        this.KKT = KKT;
    }          
}
