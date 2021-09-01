
var maHDBH = document.getElementById("maHopDong");
var maKH = document.getElementById("maKH");
var ngayHD = document.getElementById("ngayHD");
var giaTriHD = document.getElementById("giaTriHD");
var thoiHanHD = document.getElementById("thoiHanHD");
var bienSoXe = document.getElementById("bienSoXe");
var giaTriTT = document.getElementById("giaTriTT");

function validateNotNull(element) {
	if (element.value != "") {
		element.classList.remove("is-invalid");
		return true
	} else {
		element.classList.add("is-invalid");
		return false;
	}
}

function validateGiaTriHD(element) {
	if (element.value != null && element.value >= 5000000) {
		element.classList.remove("is-invalid");
		return true
	} else {
		element.classList.add("is-invalid");
		return false;
	}
}

function submitData(e) {
	e.preventDefault()

	var valiGiaTriHD = validateGiaTriHD(giaTriHD);
	var valimaHDBH = validateNotNull(maHDBH);
	var valimaKH = validateNotNull(maKH);
	var valingayHD = validateNotNull(ngayHD);
	var valithoiHanHD = validateNotNull(thoiHanHD);
	var valiBienSoXe = validateNotNull(bienSoXe);
	var valiGiaTriTT = validateNotNull(giaTriTT);

	if (valiGiaTriHD && valimaHDBH && valimaKH && valingayHD && valithoiHanHD && valiBienSoXe && valiGiaTriTT) {
		document.getElementById("themHDBH").submit();
	}

}

