<div class="container">
	<div class="row">
		<!--would be display side bar  -->
		<div class="col-md-3">
			<%@ include file="./shared/sideBar.jsp"%>
		</div>

		<!-- to display the actual products  -->
		<div class="col-md-9">

			<!-- Added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">
				   <!-- if user click on list of All Products  -->
				   <c:if test="${userClickedAllProducts == true}">
					<ol class="breadcrumb">
                      <li><a href="${contextRoot}/home">Home</a></li>
                      <li class="active">All Products</li>
					</ol>
					</c:if>
					
					 <!-- if user click on product category  -->
				   <c:if test="${userClickedCategoryProducts == true}">
					<ol class="breadcrumb">
                      <li><a href="${contextRoot}/home">Home</a></li>
                      <li class="active">Category</li>
                       <li class="active">${category.name} </li>
					</ol>
					</c:if>

				</div>
			</div>
		</div>
		
		
	</div>
</div>

