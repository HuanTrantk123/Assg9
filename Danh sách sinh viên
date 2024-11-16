import java.util.ArrayList;

public class DanhSachSinhVien {
    ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

    public void nhapThongTinSinhVien(int n) {
        for (int i = 0; i < n; i++) {
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhapThongTinSinhVien("SV" + (i + 1), "Sinh Vien " + (i + 1), new Date(), "CNTT", 8.0f + i);
            danhSachSinhVien.add(sinhVien);
        }
    }

    public void hienThiTatCaSinhVien() {
        for (SinhVien sinhVien : danhSachSinhVien) {
            sinhVien.hienThiThongTinSinhVien();
        }
    }

    public SinhVien timSinhVienTheoMa(String maSinhVien) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.maSinhVien.equals(maSinhVien)) {
                return sinhVien;
            }
        }
        return null;
    }

    public boolean xoaSinhVienTheoMa(String maSinhVien) {
        SinhVien sinhVien = timSinhVienTheoMa(maSinhVien);
        if (sinhVien != null) {
            danhSachSinhVien.remove(sinhVien);
            return true;
        }
        return false;
    }

    public boolean chinhSuaSinhVienTheoMa(String maSinhVien) {
        SinhVien sinhVien = timSinhVienTheoMa(maSinhVien);
        if (sinhVien != null) {
            sinhVien.hoTen = "Nguyen B";
            sinhVien.diemTrungBinh = 9.0f;
            return true;
        }
        return false;
    }
}
