package BaseConstructor;

public abstract class HoaDon {
    private String idHoaDon;
    private String TenKhachHang;
    private String ngayLapHD;
    protected String loaiHoaDon;
    private int soLuong;
    protected String idMatHangMua;
    protected String[] listMathang;

    public HoaDon() {
        this.idHoaDon = "";
        this.TenKhachHang = "";
        this.ngayLapHD = "";
        this.loaiHoaDon = "";
        this.soLuong = 0;
        this.listMathang = new String[]{"Ron92", "Ron95", "E20"};
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(String ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public String getLoaiHoaDon() {
        return loaiHoaDon;
    }

    public void setLoaiHoaDon(String loaiHoaDon) {
        this.loaiHoaDon = loaiHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String[] getListMathang() {
        return listMathang;
    }

    public void setListMathang(String[] listMathang) {
        this.listMathang = listMathang;
    }

    public String getIdMatHangMua() {
        return idMatHangMua;
    }

    public void setIdMatHangMua(String idMatHangMua) {
        this.idMatHangMua = idMatHangMua;
    }

    // Override khi khởi tạo => Xác định loại hoá đơn khi tạo mới instance
    public abstract void input();
    public abstract void output();
    public abstract double thanhTien();
    public abstract double tienKM();
    public abstract double tongThanhTien();
}
