package fpt.fa.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOPDONGBAOHIEM")
public class HopDongBaoHiem {

	@Id
	@Column(name = "MaHopDong")
	private String maHopDong;

	@Column(name = "MaKH")
	private String maKH;

	@Column(name = "BienSoXe")
	private String bienSoXe;

	@Column(name = "NgayHopDong")
	private LocalDate ngayHopDong;

	@Column(name = "ThoiHanHopDong")
	private LocalDate thoiHanHopDong;

	@Column(name = "GiaTriHopDong")
	private Long giaTriHopDong;

	@Column(name = "GiaTriThanhToan")
	private Long giaTriThanhToan;

	@ManyToOne
	@JoinColumn(name = "MaKH", referencedColumnName = "MaKH", nullable = false, insertable = false, updatable = false)
	private KhachHang khachHang;

	public HopDongBaoHiem() {
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

	public LocalDate getNgayHopDong() {
		return ngayHopDong;
	}

	public void setNgayHopDong(LocalDate ngayHopDong) {
		this.ngayHopDong = ngayHopDong;
	}

	public LocalDate getThoiHanHopDong() {
		return thoiHanHopDong;
	}

	public void setThoiHanHopDong(LocalDate thoiHanHopDong) {
		this.thoiHanHopDong = thoiHanHopDong;
	}

	public Long getGiaTriHopDong() {
		return giaTriHopDong;
	}

	public void setGiaTriHopDong(Long giaTriHopDong) {
		this.giaTriHopDong = giaTriHopDong;
	}

	public Long getGiaTriThanhToan() {
		return giaTriThanhToan;
	}

	public void setGiaTriThanhToan(Long giaTriThanhToan) {
		this.giaTriThanhToan = giaTriThanhToan;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	@Override
	public String toString() {
		return "HopDongBaoHiem [maHopDong=" + maHopDong + ", maKH=" + maKH + ", bienSoXe=" + bienSoXe + ", ngayHopDong="
				+ ngayHopDong + ", thoiHanHopDong=" + thoiHanHopDong + ", giaTriHopDong=" + giaTriHopDong
				+ ", giaTriThanhToan=" + giaTriThanhToan + "]";
	}

}
