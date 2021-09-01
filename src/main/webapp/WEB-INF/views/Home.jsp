<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="thems/header.jsp"%>
<%@ include file="thems/navbar.jsp"%>
<%@ include file="thems/siderbar.jsp"%>
<!-- Main Sidebar Container -->

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0 "><b>DANH SÁCH HỢP ĐỒNG BẢO HIỂM</b></h1>
				</div>
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- /.content-header -->
	
	<!-- Main content -->
	<div class="content">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">

					<form action="${pageContext.request.contextPath}/home" method="get"
						class="form_create" id="search">
						<div class="row my-3">
							<div class="form-check col-3">
								<input class="form-check-input" type="checkbox" value="1"
									id="hetHan" name="hetHan"> <label
									class="form-check-label" for="hetHan"> Lọc hợp đồng sắp
									hết hạn </label>
							</div>
							<div class="col-3">
								<button type="submit" class="btn btn-primary w-100">Tìm
									kiếm</button>
							</div>
						</div>
					</form>

					<table class="table">
						<thead>
							<tr>
								<th scope="col">Mã hợp đồng</th>
								<th scope="col">Tên khách hàng</th>
								<th scope="col">Biển số xe</th>
								<th scope="col">Ngày hợp đồng</th>
								<th scope="col">Giá trị hợp đồng</th>
								<th scope="col">Thời hạn hợp đồng</th>
								<th scope="col">Giá trị thanh toán</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="baoHiem" items="${listBaoHiems}">
								<tr>
									<th scope="row"><a href="${pageContext.request.contextPath}/editHDBH/${baoHiem.maHopDong}">${baoHiem.maHopDong}</a> </th>
									<td>${baoHiem.khachHang.tenKH}</td>
									<td>${baoHiem.bienSoXe}</td>
									<td>${baoHiem.ngayHopDong}</td>
									<td>${baoHiem.giaTriHopDong}</td>
									<td>${baoHiem.thoiHanHopDong}</td>
									<td>${baoHiem.giaTriThanhToan}</td>
								</tr>

							</c:forEach>


						</tbody>
					</table>

				</div>
			</div>
		</div>
	</div>
</div>
	

<%@ include file="thems/footer.jsp"%>