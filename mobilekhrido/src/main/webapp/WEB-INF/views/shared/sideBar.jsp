<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 <h4 class="my-4">Mobile Collection</h4>
          <div class="list-group">
          
      <c:forEach items="${categories}" var="category">
              <a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}"> ${category.name} </a>
      </c:forEach>
            
</div>