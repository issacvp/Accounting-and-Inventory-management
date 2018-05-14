<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Aakruth Bio-med Inventory Login</title>
<link rel="stylesheet"
	href="assets/vendors/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/styles.css">
<link rel="stylesheet" href="assets/css/Google-Style-Login.css">
<link rel="stylesheet" href="assets/css/Hero-Technology.css">
<link rel="stylesheet" href="assets/css/Pretty-Registration-Form.css">
<link rel="stylesheet" href="assets/css/Bootstrap-Payment-Form.css">
</head>

<body id="page">
	<div class="container-fluid" id="hdr">
		<div class="col-md-12 col-sm-12">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand navbar-link" href="#" id="brdnme"><span
							id="fstnme">Aakruth </span><span id="lstnme">Bio-med </span></a>
						<button class="navbar-toggle collapsed" data-toggle="collapse"
							data-target="#navcol-1">
							<span class="sr-only">Toggle navigation</span><span
								class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<div class="login-card">
		<img src="assets/images/avatar_2x.png" class="profile-img-card">
		<p class="profile-name-card"></p>
		<form action="/user/changePass" class="form-signin" method="post">
			<input
				class="form-control" type="password" required placeholder="Password"
				id="inputPassword" name="password">
				<input
				class="form-control" type="password" required placeholder="Password"
				id="newPassword" name="newPassword">
				<input
				class="form-control" type="password" required placeholder="Password"
				id="newConfirmPassword" name="newConfirmPassword">
			<button class="btn btn-primary btn-block btn-lg btn-signin"
				type="button">Sign in</button>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<c:if test="${param.error ne null}">
			<div class="alert-danger">Invalid Email and password.</div>
		</c:if>
		<c:if test="${param.logout ne null}">
			<div class="alert-normal">You have been logged out.</div>
		</c:if>
	</div>
	<div class="container" id="sal">
		<div class="col-md-12" id="ftr">
			<p>@ copyrigiht - Aakruth Biomed Pvt Ltd | Powered by Emmanual
				software solution</p>
		</div>
	</div>
	<script src="assets/vendors/jquery/dist/jquery.min.js"></script>
	<script src="assets/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
</body>

</html>