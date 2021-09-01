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
					<h1 class="m-0 "><b>CHỈNH SỬA HỢP ĐỒNG BẢO HIỂM</b></h1>
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
					<form:form action="${pageContext.request.contextPath}/update"
						modelAttribute="HDBH" id="themHDBH" class="" method="post">
						
						<div class="form-group">
							<label for="maHopDong">Mã hợp đồng bảo hiểm:</label>
							<form:input path="maHopDong" type="text" class="form-control"
								id="maHopDong" />
							<small id="helpId" class="invalid-feedback">Không đc để
								trống</small>
						</div>
						<div class="form-group">
							<label for="maKH">Mã khách hàng:</label>
							<form:input path="maKH" type="text" class="form-control"
								id="maKH" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống và phải có dữ liệu</small>
						</div>

						<div class="form-group">
							<label for="bienSoXe">Biển số xe:</label>
							<form:input path="bienSoXe" type="text" class="form-control"
								id="bienSoXe" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>

						<div class="form-group">
							<label for="ngayHD">Ngày hợp đồng:</label>
							<form:input path="ngayHD" type="date" class="form-control"
								id="ngayHD" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>

						<div class="form-group">
							<label for="thoiHanHD">Thời hạn hợp đồng:</label>
							<form:input path="thoiHanHD" type="date" class="form-control"
								id="thoiHanHD" />
							<small class="text-danger"><c:out
									value="${messThoiHanHD}" /></small>
						</div>

						<div class="form-group">
							<label for="giaTriHD">Giá trị hợp đồng:</label>
							<form:input path="giaTriHD" type="number" class="form-control"
								id="giaTriHD" />
							<small id="helpId" class="invalid-feedback"> Không đc để
								trống</small>
						</div>

						<div class="form-group">
							<label for="giaTriTT">Giá trị thanh toán:</label>
							<form:input path="giaTriTT" type="number" class="form-control"
								id="giaTriTT" />
							<small id="helpId" class=""> </small>
						</div>

						<button type="submit" class="btn btn-primary my-3 "
							onclick="submitData(event)">Chỉnh sửa</button>
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
