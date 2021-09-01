package fpt.fa.model;

public class HopDongModel {
	private String maHopDong;
	private String maKH;
	private String bienSoXe;
	private String ngayHD;
	private String thoiHanHD;
	private Long giaTriHD;
	private Long giaTriTT;
	public HopDongModel() {
		super();
	}
	public String getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getBienSoXe() {
		return bienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public String getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}
	public String getThoiHanHD() {
		return thoiHanHD;
	}
	public void setThoiHanHD(String thoiHanHD) {
		this.thoiHanHD = thoiHanHD;
	}
	public Long getGiaTriHD() {
		return giaTriHD;
	}
	public void setGiaTriHD(Long giaTriHD) {
		this.giaTriHD = giaTriHD;
	}
	public Long getGiaTriTT() {
		return giaTriTT;
	}
	public void setGiaTriTT(Long giaTriTT) {
		this.giaTriTT = giaTriTT;
	}
	@Override
	public String toString() {
		return "HopDongModel [maHopDong=" + maHopDong + ", maKH=" + maKH + ", bienSoXe=" + bienSoXe + ", ngayHD="
				+ ngayHD + ", thoiHanHD=" + thoiHanHD + ", giaTriHD=" + giaTriHD + ", giaTriTT=" + giaTriTT + "]";
	}

	
}
