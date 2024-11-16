import java.util.Scanner;

public class XyLyThongTinSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int luaChon;

        while (true) {
            System.out.println("1. Nhap vao thong tin cua n sinh vien");
            System.out.println("2. Hien thi thong tin tat ca sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Xoa sinh vien theo ma");
            System.out.println("5. Chinh sua sinh vien theo ma");
            System.out.println("6. Thoat");
            System.out.print("Chon hanh dong: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = scanner.nextInt();
                    danhSachSinhVien.nhapThongTinSinhVien(n);
                    break;
                case 2:
                    danhSachSinhVien.hienThiTatCaSinhVien();
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    scanner.nextLine(); // Để bỏ qua ký tự newline còn lại
                    String maSinhVienTim = scanner.nextLine();
                    SinhVien sinhVienTim = danhSachSinhVien.timSinhVienTheoMa(maSinhVienTim);
                    if (sinhVienTim != null) {
                        sinhVienTim.hienThiThongTinSinhVien();
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ma: " + maSinhVienTim);
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    scanner.nextLine(); // Để bỏ qua ký tự newline còn lại
                    String maSinhVienXoa = scanner.nextLine();
                    boolean xoaThanhCong = danhSachSinhVien.xoaSinhVienTheoMa(maSinhVienXoa);
                    if (xoaThanhCong) {
                        System.out.println("Xoa sinh vien thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ma: " + maSinhVienXoa);
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma sinh vien can chinh sua: ");
                    scanner.nextLine(); // Để bỏ qua ký tự newline còn lại
                    String maSinhVienChinhSua = scanner.nextLine();
                    boolean chinhSuaThanhCong = danhSachSinhVien.chinhSuaSinhVienTheoMa(maSinhVienChinhSua);
                    if (chinhSuaThanhCong) {
                        System.out.println("Chinh sua sinh vien thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ma: " + maSinhVienChinhSua);
                    }
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
