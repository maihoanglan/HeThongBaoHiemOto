package fpt.fa.model;

public class KhachHangModel {
	private String maKH;
	private String maLoaiKH;
	private String tenKH;
	private String soCMND;
	private String gioiTinh;
	private String ngaySinh;
	private String soDienThoai;

	public KhachHangModel() {
		super();
	}

	public KhachHangModel(String maKH, String maLoaiKH, String tenKH, String soCMND, String gioiTinh, String ngaySinh,
			String soDienThoai) {
		super();
		this.maKH = maKH;
		this.maLoaiKH = maLoaiKH;
		this.tenKH = tenKH;
		this.soCMND = soCMND;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getMaLoaiKH() {
		return maLoaiKH;
	}

	public void setMaLoaiKH(String maLoaiKH) {
		this.maLoaiKH = maLoaiKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Override
	public String toString() {
		return "KhachHangModel [maKH=" + maKH + ", maLoaiKH=" + maLoaiKH + ", tenKH=" + tenKH + ", soCMND=" + soCMND
				+ ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + "]";
	}

}
