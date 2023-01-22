 <%@ include file="common/header.jspf" %>
 <%@ include file="common/navigation.jspf" %>
	<div class="container">


    		<h1>Supplier List</h1>
    		<hr>
    	    <table class="table">
                <thead>
                    <tr>
                        <th>Supplier Id</th>
                        <th>Supplier Name</th>
                        <th>Supplier Code</th>
                        <th></th>
                        <th></th>
                     </tr>
                </thead>
                <tbody>
                    <c:forEach items="${suppliers}" var="supplier">
                        <tr>
                            <td>${supplier.sup_id}</td>
                            <td>${supplier.sup_name}</td>
                            <td>${supplier.sup_code}</td>
                             <td><a href="delete-supplier?id=${supplier.sup_id}" class="btn btn-warning">DELETE</a></td>
                            <td><a href="update-supplier?id=${supplier.sup_id}" class="btn btn-success">Update</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
    		</table>
    		<a href="add-supplier" class="btn btn-success">Add</a>
             <%@ include file="common/footer.jspf" %>
	</div>

	</body>
</html>