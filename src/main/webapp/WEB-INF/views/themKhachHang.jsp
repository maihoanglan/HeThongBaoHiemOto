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
					<h1 class="m-0 "><b>THÊM MỚI KHÁCH HÀNG</b></h1>
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
				<div class="col-lg-3"></div>
				<div class="col-lg-6">
					<form:form action="${pageContext.request.contextPath}/themKhachHang"
						modelAttribute="KhachHang" id="themKhachHang" class="" method="post">
						
						<div class="form-group">
							<label for="maKH">Mã khách hàng:</label>
							<form:input path="maKH" type="text" class="form-control"
								id="maKH" />
								<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>
						
						<div class="form-group">
							<label for="maLoaiKH">Mã loại khách hàng:</label>
							<form:input path="maLoaiKH" type="text" class="form-control"
								id="maLoaiKH" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống và phải có dữ liệu</small>
							<c:if test="${messLoiMaLoaiKH != null}">
								<small class="text-danger"><c:out value="${messLoiMaLoaiKH}" /></small>
							</c:if>
						</div>

						<div class="form-group">
							<label for="tenKH">Tên khách hàng:</label>
							<form:input path="tenKH" type="text" class="form-control"
								id="tenKH" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>

						<div class="form-group">
							<label for="soCMND">Số CMND:</label>
							<form:input path="soCMND" type="text" class="form-control"
								id="soCMND" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>

						<div class="form-group">
							<label for="gioiTinh">Giới tính:</label>
							<form:input path="gioiTinh" type="text" class="form-control"
								id="gioiTinh" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>

						<div class="form-group">
							<label for="ngaySinh">Ngày sinh:</label>
							<form:input path="ngaySinh" type="date" class="form-control"
								id="ngaySinh" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>


						<div class="form-group">
							<label for="soDienThoai">Số điện thoại:</label>
							<form:input path="soDienThoai" type="text" class="form-control"
								id="soDienThoai" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>

						<button type="submit" class="btn btn-primary my-3 "
							onclick="submitKhachHang(event)">Thêm khách hàng</button>
					</form:form>


				</div>
			</div>
			<div class="col-lg-3"></div>
		</div>
	</div>
</div>

<!-- /.content -->
<!-- /.content-wrapper -->

<%@ include file="thems/footer.jsp"%>
