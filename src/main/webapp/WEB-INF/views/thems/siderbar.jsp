<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<aside class="main-sidebar sidebar-dark-primary elevation-4">
	<!-- Brand Logo -->
	<a href="./" class="brand-link"> <img
		src='<c:url value="/resources/img/AdminLTELogo.png"/>'
		alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
		style="opacity: .8"> <span class="brand-text font-weight-light"><b>Hợp Đồng Bảo Hiểm</b></span>
	</a>

	<!-- Sidebar -->
	<div class="sidebar">

		<!-- SidebarSearch Form -->
		<div class="form-inline">
			<div class="input-group" data-widget="sidebar-search">
				<input class="form-control form-control-sidebar" type="search"
					placeholder="Search" aria-label="Search">
				<div class="input-group-append">
					<button class="btn btn-sidebar">
						<i class="fas fa-search fa-fw"></i>
					</button>
				</div>
			</div>
		</div>

		<!-- Sidebar Menu -->
		<nav class="mt-2">
			<ul class="nav nav-pills nav-sidebar flex-column"
				data-widget="treeview" role="menu" data-accordion="false">
				<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
				<li class="nav-item  "><a
					href="${pageContext.request.contextPath}/home" class="nav-link ">
						<p>HOME</p>
				</a></li>
				<li class="nav-item  "><a href="#" class="nav-link "> <i
						class="nav-icon fas fa-list-ul"></i>
						<p>
							Quản lý hợp đồng <i class="right fas fa-angle-left"></i> 
						</p>
				</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/themHDBH"
							class="nav-link "> <i class="far fa-circle nav-icon"></i>
								<p>Thêm hợp đồng</p>
						</a></li>
						
					</ul></li>
				<li class="nav-item  "><a href="#" class="nav-link "> <i
						class="nav-icon fas fa-list-ul"></i>
						<p>
							Quản lý khách hàng <i class="right fas fa-angle-left"></i> 
						</p>
				</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a
							href="${pageContext.request.contextPath}/themKhachHang" 
							class="nav-link "> <i class="far fa-circle nav-icon"></i>
								<p>Thêm khách hàng</p>
						</a></li>
						
					</ul></li>
			</ul>
		</nav>
		<!-- /.sidebar-menu -->
	</div>
	<!-- /.sidebar -->
</aside>
