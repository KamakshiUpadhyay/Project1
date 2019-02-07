<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>

<img src="<c:url value='/resources/images/lable.png'/>" alt="HTML5 Icon" style="min-width:100%; max-width:100%;max-height:170px;">
<img src="<c:url value='/resources/images/welcome.jpg'/>" alt="HTML5 Icon" style="min-width:100%; max-width:100%;max-height:300px;">

<div class="row">
  <%-- <c:forEach items = "${productList}" var="product" >

    <div class = "col-sm-4 col-md-3">
      <a href = "<c:url value="/totalProductDisplay/${product.productId}" />" class = "thumbnail">
         <img src="<c:url value="/resources/images/${product.productId}.png" />" style="min-height:250px; max-height:250px;"  alt = "Generic placeholder thumbnail">
      </a>
      
      <p align="center"> ${product.productName} </p>
      <p align="center"> Price : INR ${product.price}/- </p>
      <p align="center"> Stock : ${product.stock} </p>
      
    </div>     
  </c:forEach> --%>
</div>  

</body>
</html>