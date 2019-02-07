<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<style>
  .item{
     height:300;
  
        }
</style>
<body>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="<c:url value='/resources/images/cover.png'/>">
      <div class="carousel-caption">
      </div>
    </div>

    <div class="item">
     <img src="<c:url value='/resources/images/myn.jpg'/>">
      <div class="carousel-caption">
      </div>
    </div>
    
    <div class="item">
      <img src="<c:url value='/resources/images/heels.jpg'/>" >
      <div class="carousel-caption">
        
      </div>
    </div>

    <div class="item">
      <img src="<c:url value='/resources/images/man.jpg'/>" >
      <div class="carousel-caption">
        </div>
    </div>
    
    <div class="item">
      <img src="<c:url value='/resources/images/kid.jpg'/>" >
      <div class="carousel-caption">
        </div>
    </div>
    
    <div class="item">
      <img src="<c:url value='/resources/images/jwel.jpg'/>" >
      <div class="carousel-caption">
        </div>
    </div>
    
    <div class="item">
      <img src="<c:url value='/resources/images/kw.jpg'/>" >
      <div class="carousel-caption">
        </div>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    <div style="background-color:black">
       <center><img src="<c:url value='/resources/images/gif.gif'/>" alt="HTML5 Icon" width="400" height="250"></center>
    </div>
    <div>  
       <img src="<c:url value='/resources/images/anu.jpg'/>" alt="HTML5 Icon" width="320" height="250">
       <img src="<c:url value='/resources/images/pat.jpg'/>" alt="HTML5 Icon" width="350" height="250">
       <img src="<c:url value='/resources/images/bag.jpg'/>" alt="HTML5 Icon" width="320" height="250">
    </div>
</body>
</html>
