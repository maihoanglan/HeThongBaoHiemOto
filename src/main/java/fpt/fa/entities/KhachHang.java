package fpt.fa.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KHACHHANG")
public class KhachHang {

	@Id
	@Column(name = "MaKH")
	private String maKH;

	@Column(name = "MaLoaiKH")
	private String maLoaiKH;

	@Column(name = "TenKH")
	private String tenKH;

	@Column(name = "SoCMD")
	private String soCMND;

	@Column(name = "GioiTinh")
	private String gioiTinh;

	@Column(name = "NgaySinh")
	private LocalDate ngaySinh;

	@Column(name = "SoDienThoai")
	private String soDienThoai;

	@ManyToOne
	@JoinColumn(name = "MaLoaiKH", referencedColumnName = "MaLoaiKH", nullable = false, insertable = false, updatable = false)
	private LoaiKhachHang loaiKhachHang;

	@OneToMany(mappedBy = "khachHang", fetch = FetchType.EAGER)
	private List<HopDongBaoHiem> hopDongBaoHiems;

	public KhachHang() {
		super();
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

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public LoaiKhachHang getLoaiKhachHang() {
		return loaiKhachHang;
	}

	public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}

	public List<HopDongBaoHiem> getHopDongBaoHiems() {
		return hopDongBaoHiems;
	}

	public void setHopDongBaoHiems(List<HopDongBaoHiem> hopDongBaoHiems) {
		this.hopDongBaoHiems = hopDongBaoHiems;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", maLoaiKH=" + maLoaiKH + ", tenKH=" + tenKH + ", soCMND=" + soCMND
				+ ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + "]";
	}

}
