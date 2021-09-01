
var maKH = document.getElementById("maKH");
var maLoaiKH = document.getElementById("maLoaiKH");
var tenKH = document.getElementById("tenKH");
var ngaySinh = document.getElementById("ngaySinh");
var soCMND = document.getElementById("soCMND");
var gioiTinh = document.getElementById("gioiTinh");
var soDienThoai = document.getElementById("soDienThoai");

function validateNotNull(element) {
	if (element.value != "") {
		element.classList.remove("is-invalid");
		return true
	} else {
		element.classList.add("is-invalid");
		return false;
	}
}

function submitKhachHang(event) {
	event.preventDefault()

	var valiMaKH = validateNotNull(maKH);
	var valiMaLoaiKH = validateNotNull(maLoaiKH);
	var valiTenKH = validateNotNull(tenKH);
	var valiNgaySinh = validateNotNull(ngaySinh);
	var valiSoCMND = validateNotNull(soCMND);
	var valigioiTinh = validateNotNull(gioiTinh);
	var valiSoDienThoai = validateNotNull(soDienThoai);

	if (valiMaKH && valiMaLoaiKH && valiTenKH && valiNgaySinh && valiSoCMND && valigioiTinh && valiSoDienThoai) {
		document.getElementById("themKhachHang").submit();
	}

}
