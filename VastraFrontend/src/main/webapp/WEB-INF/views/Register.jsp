<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
  <body>
    <div class="container">
	  <div class="row main">
		 <div class="main-login main-center">
			<h5> Sign Up </h5>
			<c:url var="add" value="/addUser"/>
				<form:form method="post" action="${add}" modelAttribute="user">
						
					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label">Your Name</label>
						  <div class="cols-sm-10">
							<div class="input-group">
							   <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
							   <form:input  path="customerName" />
						    </div>
						  </div>
					</div>

					<div class="form-group">
					  <label for="email" class="cols-sm-2 control-label">Your Email</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
								<form:input path="email" />
							</div>
						</div>
					</div>
					
					<div class="form-group">
					  <label for="address" class="cols-sm-2 control-label">Your Address</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
								<form:input path="customerAddr" />
							</div>
						</div>
					</div>

					<div class="form-group">
					  <label for="username" class="cols-sm-2 control-label">Username</label>
						<div class="cols-sm-10">
							<div class="input-group">
							   <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
							   <form:input  path="userName" />
							</div>
						</div>
					</div>

					<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<form:password  path="password" />
								</div>
							</div>
					</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password"  placeholder="Confirm Password"/>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<input type="submit" value="SignUp"/>
						</div>
					</form:form>
				</div>
			</div>
		</div>
   </body>
</html>