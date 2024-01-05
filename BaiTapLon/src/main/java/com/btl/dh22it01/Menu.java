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
        ql.hienThiDSTenMonHoc_1();
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Tao de cuong cho mon hoc");
            System.out.println("2. Cap nhat thong tin de cuong");
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
                    CauHinh.SC.nextLine();
                    System.out.print("Nhap ma mon: ");
                    String id1 = CauHinh.SC.nextLine();
                    MonHoc a = ql.timKiem(id1);
                    System.out.println("1. Tao de cuong chinh quy");
                    System.out.println("2. Tao de cuong lien thong");
                    System.out.println("0. Thoat");
                    System.out.println("================");
                    System.out.print("Moi ban chon: ");
                    int c1 = CauHinh.SC.nextByte();
                    CauHinh.SC.nextLine();
                    switch (c1) {
                        case 1:
                            a.khoiTaoDeCuongChinhQuy();
                            break;
                        case 2:
                            a.khoiTaoDeCuongLienThong();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                    }
                    break;
                case 2:
                    CauHinh.SC.nextLine();
                    System.out.print("Nhap ma mon: ");
                    String id2 = CauHinh.SC.nextLine();
                    MonHoc b = ql.timKiem(id2);
                    System.out.println("1. Cap nhat cuong chinh quy");
                    System.out.println("2. Cap nhat cuong lien thong");
                    System.out.println("0. Thoat");
                    System.out.println("================");
                    System.out.print("Moi ban chon: ");

                    int c2 = CauHinh.SC.nextByte();
                    CauHinh.SC.nextLine();
                    switch (c2) {
                        case 1:
                            System.out.println("1. Chinh sua noi dung de cuong");
                            System.out.println("2. Them mon hoc truoc");
                            System.out.println("3. Xoa mon hoc truoc");
                            System.out.println("4. Them mon hoc tien quyet");
                            System.out.println("5. Xoa mon hoc tien quyet");
                            System.out.println("6. Them cot diem");
                            System.out.println("7. Xoa cot diem");
                            System.out.println("0. Thoat");
                            System.out.println("================");
                            System.out.print("Moi ban chon: ");
                            int c21 = CauHinh.SC.nextByte();
                            CauHinh.SC.nextLine();
                            switch (c21) {
                                case 1:
                                    b.suaDeCuongChinhQuy();
                                    break;
                                case 2:
                                    System.out.print("Nhap ma mon hoc muon them: ");
                                    String maMon1 = CauHinh.SC.nextLine();
                                    MonHoc mh1 = ql.timKiem(maMon1);
                                    ql.timKiem(id2).themMonHocTruoc(mh1);
                                    break;
                                case 3:
                                    System.out.print("Nhap ma mon hoc muon xoa: ");
                                    String maMon2 = CauHinh.SC.nextLine();
                                    
                                    ql.timKiem(id2).xoaMonHocTruoc(maMon2);
                                    break;
                                case 4:
                                    System.out.print("Nhap ma mon hoc muon them: ");
                                    String maMon3 = CauHinh.SC.nextLine();
                                    MonHoc mh3 = ql.timKiem(maMon3);
                                    ql.timKiem(id2).themMonHocTienQuyet(mh3);
                                    break;
                                case 5:
                                    System.out.print("Nhap ma mon hoc muon xoa: ");
                                    String maMon4 = CauHinh.SC.nextLine();
                                    MonHoc mh4 = ql.timKiem(maMon4);
                                    ql.timKiem(id2).themMonHocTienQuyet(mh4);
                                    break;
                                case 6:
                                    b.themCotDiemDeCuongChinhQuy();
                                    break;
                                case 7:
                                    b.xoaCotDiemDeCuongChinhQuy();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("1. Chinh sua noi dung de cuong");
                            System.out.println("2. Them mon hoc truoc");
                            System.out.println("3. Xoa mon hoc truoc");
                            System.out.println("4. Them mon hoc tien quyet");
                            System.out.println("5. Xoa mon hoc tien quyet");
                            System.out.println("6. Them cot diem");
                            System.out.println("7. Xoa cot diem");
                            System.out.println("0. Thoat");
                            System.out.println("================");
                            System.out.print("Moi ban chon: ");
                            int c22 = CauHinh.SC.nextByte();
                            CauHinh.SC.nextLine();
                            switch (c22) {
                                case 1:
                                    b.suaDeCuongLienThong();
                                    break;
                                case 2:
                                    System.out.print("Nhap ma mon hoc muon them: ");
                                    String maMon1 = CauHinh.SC.nextLine();
                                    MonHoc mh1 = ql.timKiem(maMon1);
                                    ql.timKiem(id2).themMonHocTruoc(mh1);
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    System.out.print("Nhap ma mon hoc muon them: ");
                                    String maMon2 = CauHinh.SC.nextLine();
                                    MonHoc mh2 = ql.timKiem(maMon2);
                                    ql.timKiem(id2).themMonHocTienQuyet(mh2);
                                    break;
                                case 5:
                                    
                                    break;
                                case 6:
                                    b.themCotDiemDeCuongLienThong();
                                    break;
                                case 7:
                                    b.xoaCotDiemDeCuongLienThong();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                                    break;
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("SAI CU PHAP VUI LONG NHAP LAI!!!");
                            break;
                    }
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
                            String id3 = CauHinh.SC.nextLine();
                            ql.timKiem(id3).hienThiMonHoc();
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
                    String id4 = CauHinh.SC.nextLine();

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
                            ql.timKiem(id4).hienThiDSMonHocTruoc();
                            break;
                        case 2:
                            ql.timKiem(id4).hienThiDSMonHocTienQuyet();
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
                    CauHinh.SC.nextLine();
                    System.out.print("Nhap ma mon: ");
                    String id7 = CauHinh.SC.nextLine();
                    MonHoc g = ql.timKiem(id7);
                    System.out.println("1. Xuat de cuong chinh quy");
                    System.out.println("2. Xuat De cuong lien thong");
                    System.out.println("0. Thoat");
                    System.out.println("================");
                    System.out.print("Moi ban chon: ");
                    int c7 = CauHinh.SC.nextByte();
                    CauHinh.SC.nextLine();
                    switch (c7) {
                        case 1:
                            g.hienThiDeCuongChinhQuy();
                            break;
                        case 2:
                            g.hienThiDeCuongLienThong();
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
            }
        } while (true);
    }
}
