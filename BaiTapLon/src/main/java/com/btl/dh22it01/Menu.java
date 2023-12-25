/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.btl.dh22it01;

/**
 *
 * @author NGUYEN
 */
public class Menu {

    public Menu() {
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Tao mon de cuong cho mon hoc");
            System.out.println("2. Cap nhat thong tin trong de cuong duoc phan cong");
            System.out.println("3. Tim kiem mon hoc");
            System.out.println("4. Xac dinh mon hoc");
            System.out.println("5. Sap xep danh sach de cuong giam dan");
            System.out.println("6. Xac dinh danh sach de cuong");
            System.out.println("7. Xuat de cuong");
            System.out.println("8. Thong ke so luong de cuong theo so tin chi");
            System.out.println("0. Thoat");
            System.out.println("================");

            System.out.print("Moi ban chon: ");
            int choice = CauHinh.SC.nextByte();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 0:
                    System.out.println("CAM ON BAN DA SU DUNG CHUONG TRINH");
                    return;
                default:
                    System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
            }
        } while (true);
    }
}

