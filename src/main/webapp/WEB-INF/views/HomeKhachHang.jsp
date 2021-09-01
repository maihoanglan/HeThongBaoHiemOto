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
					<h1 class="m-0 ">
						<b>DANH SÁCH HỢP ĐỒNG BẢO HIỂM</b>
					</h1>
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

					<form action="${pageContext.request.contextPath}/homeKhachHang" method="get">
						<div class="row my-3">
							<div class="input-group col-6">
								<div class="input-group-prepend">
									<span class="input-group-text">Tên khách hàng</span>
								</div>
								<input class="form-control" id="" name ="tenKH"
									aria-describedby="helpId" placeholder="" />
							</div>
							<div class="col-3"><button type="submit" class="btn btn-primary w-100">Tìm Kiếm</button></div>
						</div>
					</form> 

					<table class="table">
						<thead>
							<tr>
								<th scope="col">Mã khách hàng</th>
								<th scope="col">Mã loại khách hàng</th>
								<th scope="col">Tên khách hàng</th>
								<th scope="col">Số CMND</th>
								<th scope="col">Giới tính</th>
								<th scope="col">Ngày sinh</th>
								<th scope="col">Số điện thoại</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="khachhang" items="${listKhachHangs}">
								<tr>
									<th scope="row"><a
										href="${pageContext.request.contextPath}/editKhachHang/${khachhang.maKH}">${khachhang.maKH}</a>
									</th>
									<td>${khachhang.maLoaiKH}</td>
									<td>${khachhang.tenKH}</td>
									<td>${khachhang.soCMND}</td>
									<td>${khachhang.gioiTinh}</td>
									<td>${khachhang.ngaySinh}</td>
									<td>${khachhang.soDienThoai}</td>
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