<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url> 
<spring:url var="images" value="/resources/images"></spring:url> 
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Mobile - ${title}</title>

	<script type="text/javascript">
	 window.menu = '${title}';
	</script>
    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    <link href="${css}/bootstrap.standstone.theme.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/mobile.css" rel="stylesheet">

  </head>

  <body>
<div class="wrapper">
    <!-- Navigation -->
    <%@ include file="./shared/navbar.jsp" %>
    <!-- Page Content -->
    <div class="content">
     <!-- Loading the Home page Content -->
     <c:if test="${userClickedHome == true}">
     <%@ include file="home.jsp" %>
     </c:if>
     
      <!-- Load only when user clik on About us page  -->
     <c:if test="${userClickedAbout == true}">
     <%@ include file="about.jsp" %>
     </c:if>
     
      <!-- Load only when user click on Contact us page -->
     <c:if test="${userClickedContact == true}">
     <%@ include file="contact.jsp" %>
     </c:if>
     
      <!-- Load only when user click on Contact us page -->
     <c:if test="${userClickedAllProducts == true or userClickedCategoryProducts == true}">
     <%@ include file="listProducts.jsp" %>
     </c:if>
     
     
    </div>
    
    
    <!-- Footer -->
    <%@ include file="./shared/footer.jsp" %>

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/popper.min.js"></script>
    <script src="${js}/bootstrap.min.js"></script>
    <!-- Custom JS -->
     <script src="${js}/mobile.js"></script>
</div>
  </body>

</html>