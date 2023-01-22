 <%@ include file="common/header.jspf" %>
 <%@ include file="common/navigation.jspf" %>
	<div class="container">


    		<h1>Brand List</h1>
    		<hr>
    	    <table class="table">
                <thead>
                    <tr>
                        <th>Brand Id</th>
                        <th>Brand Name</th>
                        <th>Brand Code</th>
                        <th></th>
                        <th></th>
                     </tr>
                </thead>
                <tbody>
                    <c:forEach items="${brandlist}" var="brand">
                        <tr>
                            <td>${brand.brand_id}</td>
                            <td>${brand.brand_name}</td>
                            <td>${brand.brand_code}</td>
                             <td><a href="delete-brand?id=${brand.brand_id}" class="btn btn-warning">DELETE</a></td>
                            <td><a href="update-brand?id=${brand.brand_id}" class="btn btn-success">UPDATE</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
    		</table>
    		<a href="add-brand" class="btn btn-success">Add</a>
             <%@ include file="common/footer.jspf" %>
	</div>

	</body>
</html>