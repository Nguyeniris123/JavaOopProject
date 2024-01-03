/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.btl.dh22it01;

import java.io.FileNotFoundException;

/**
 *
 * @author NGUYEN
 */
public class Menu {

    public Menu() throws FileNotFoundException {
//        MonHoc mh1 = new MonHoc("1", "Co so lap trinh", "Co ban C", 4, "Co so nganh");
//        MonHoc mh3 = new MonHoc("1", "Ky thuat lap trinh", "Co ban C", 4, "Co so nganh");
//        DeCuong dc1 = new DeCuongChinhQuy(mh1);
//        DeCuong dc2 = new DeCuongLienThong(mh1);       
//        MonHoc mh2 = new MonHoc("Ky thuat lap trinh");
//        mh1.themMonHocTruoc(mh3);
//        
//        ql.themMonHoc(mh1, mh3);
        QuanLiMonHoc ql = new QuanLiMonHoc();
        ql.docDsMonHoc();
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Tao de cuong cho mon hoc");
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
            
            /*switch (choice) {
                case 1:
                    ql.hienThiDSMH_2();
                    System.out.println("1. Tao de cuong chinh quy");
                    System.out.println("2. Tao de cuong lien thong");
                    System.out.println("0. Thoat");
                    System.out.println("================");
                    System.out.print("Moi ban chon: ");
                    int c1 = CauHinh.SC.nextByte();
                    CauHinh.SC.nextLine();
                    switch (c1) {
                        
                        case 1:
                            //    dc1.taoDeCuong(dc1);
                            break;
                        case 2:
                            //dc2.taoDeCuong(dc2);
                            break;
                        case 0:                            
                            break;
                        default:
                            System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                    }
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("1. Tim kiem mon hoc theo ma hoac theo ten");
                    System.out.println("0. Thoat");
                    System.out.println("================");
                    System.out.print("Moi ban chon: ");

                    int c3 = CauHinh.SC.nextByte();
                    CauHinh.SC.nextLine();
                    switch (c3) {
                        case 1:
                            System.out.print("Nhap ma mon hoc hoac ten mon hoc: ");
                            String kw = CauHinh.SC.nextLine();
                            ql.timKiem(kw).hienThiMonHoc();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                    }
                    break;
                case 4:
                    CauHinh.SC.nextLine();
                    System.out.print("Nhap ma mon: ");
                    String id = CauHinh.SC.nextLine();
                    
                    System.out.println("================");
                    System.out.println("1. Danh sach mon hoc truoc");
                    System.out.println("2. Danh sach mon hoc tien quyet");
                    System.out.println("0. Thoat");
                    System.out.println("================");
                    System.out.print("Moi ban chon: ");
                    int c4 = CauHinh.SC.nextByte();
                    CauHinh.SC.nextLine();
                    switch (c4) {
                        case 1:
                            ql.hienThiDsMonHocTruoc(id).forEach(h -> h.hienThiMonHoc());
                            break;
                        case 2:
                            ql.hienThiDsMonHocTienQuyet(id).forEach(h -> h.hienThiMonHoc());
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                    }
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    ql.hienThiDsMonHoc();
                    System.out.println("1. Xuat de cuong chinh quy");
                    System.out.println("2. Xuat De cuong lien thong");
                    System.out.println("0. Thoat");
                    System.out.println("================");
                    System.out.print("Moi ban chon: ");
                    int c7 = CauHinh.SC.nextByte();
                    CauHinh.SC.nextLine();
                    switch (c7) {
                        case 1:
                            //    dc1.taoDeCuong(dc1);
                            break;
                        case 2:
                            //dc2.taoDeCuong(dc2);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                    }
                    break;
                case 8:

                    break;
                case 0:
                    System.out.println("CAM ON BAN DA SU DUNG CHUONG TRINH");
                    return;
                default:
                    System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
            }*/
        } while (true);
    }
}
