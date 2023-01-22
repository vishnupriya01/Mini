 <%@ include file="common/header.jspf" %>
 <%@ include file="common/navigation.jspf" %>
	<div class="container">


    		<h1>Customer List</h1>
    		<hr>
    	    <table class="table">
                <thead>
                    <tr>
                        <th>Customer Id</th>
                        <th>Customer Name</th>
                        <th>Customer Code</th>
                        <th></th>
                        <th></th>
                     </tr>
                </thead>
                <tbody>
                    <c:forEach items="${customers}" var="customer">
                        <tr>
                            <td>${customer.cus_id}</td>
                            <td>${customer.cus_name}</td>
                            <td>${customer.cus_code}</td>
                             <td><a href="delete-customer?id=${customer.cus_id}" class="btn btn-warning">DELETE</a></td>
                            <td><a href="update-customer?id=${customer.cus_id}" class="btn btn-success">Update</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
    		</table>
    		<a href="add-customer" class="btn btn-success">Add</a>
             <%@ include file="common/footer.jspf" %>
	</div>

	</body>
</html>