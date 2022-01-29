
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="Includes/header.jsp"%>
</head>
<body>
	<%@include file="Includes/navBar.jsp"%>

	<div class="container">
		<div class="card header my-3" align="center">All Products</div>
		<div class="row">
			<div class="col-md-4 my-4 ">
				<div class="card w-200" style="width: 18rem;">

					<c:forEach items="" var="prc">

						<img src="}" style="width: 100%;">
						<div class="card-body">
							<h5 class="name">Name:</h5>
							<h6 class="category">Category: </h6>
							<h6 class="price">prize: </h6>
							<div class="m45t-3 d-flex justify-content-between">
								<a href="#" class="btn btn-dark">Add to Cart</a> <a href="#"
									class="btn btn-primary">Buy Now</a>

							</div>

						</div>
					</c:forEach>
				</div>

			</div>


		</div>

	</div>


	<%@include file="Includes/footer.jsp"%>
</body>
</html>