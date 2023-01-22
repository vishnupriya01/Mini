 <%@ include file="common/header.jspf" %>
 <%@ include file="common/navigation.jspf" %>
	<div class="container">


    		<h1>Category List</h1>
    		<hr>
    	    <table class="table">
                <thead>
                    <tr>
                        <th>Category Id</th>
                        <th>Category Name</th>
                        <th>Category Code</th>
                        <th></th>
                        <th></th>
                     </tr>
                </thead>
                <tbody>
                    <c:forEach items="${categorylist}" var="category">
                        <tr>
                            <td>${category.category_id}</td>
                            <td>${category.category_name}</td>
                            <td>${category.category_code}</td>
                             <td><a href="delete-category?id=${category.category_id}" class="btn btn-warning">DELETE</a></td>
                            <td><a href="update-category?id=${category.category_id}" class="btn btn-success">UPDATE</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
    		</table>
    		<a href="add-category" class="btn btn-success">Add</a>
             <%@ include file="common/footer.jspf" %>
	</div>

	</body>
</html>