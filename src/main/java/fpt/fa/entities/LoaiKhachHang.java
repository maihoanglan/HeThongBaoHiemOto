package fpt.fa.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LOAIKHACHHANG")
public class LoaiKhachHang {

	@Id
	@Column(name = "MaLoaiKH")
	private String maLoaiKH;

	@Column(name = "TenLoaiKH")
	private String tenLoaiKH;

	@Column(name = "ChietKhau")
	private Integer chietKhau;

	@OneToMany(mappedBy = "loaiKhachHang", fetch = FetchType.EAGER)
	private List<KhachHang> khachHangs;

	public LoaiKhachHang() {
		super();
	}

	public String getMaLoaiKH() {
		return maLoaiKH;
	}

	public void setMaLoaiKH(String maLoaiKH) {
		this.maLoaiKH = maLoaiKH;
	}

	public String getTenLoaiKH() {
		return tenLoaiKH;
	}

	public void setTenLoaiKH(String tenLoaiKH) {
		this.tenLoaiKH = tenLoaiKH;
	}

	public Integer getChietKhau() {
		return chietKhau;
	}

	public void setChietKhau(Integer chietKhau) {
		this.chietKhau = chietKhau;
	}

	public List<KhachHang> getKhachHangs() {
		return khachHangs;
	}

	public void setKhachHangs(List<KhachHang> khachHangs) {
		this.khachHangs = khachHangs;
	}

	@Override
	public String toString() {
		return "LoaiKhachHang [maLoaiKH=" + maLoaiKH + ", tenLoaiKH=" + tenLoaiKH + ", chietKhau=" + chietKhau + "]";
	}

}
