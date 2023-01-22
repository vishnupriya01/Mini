 <%@ include file="common/header.jspf" %>
 <%@ include file="common/navigation.jspf" %>
	<div class="container">
	<div>Welcome to ${Name}</div>
    		<hr>
    		<h1>Your Todo</h1>
    	    <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Username</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Done</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.username}</td>
                            <td>${todo.descriptions}</td>
                            <td>${todo.targetdate}</td>
                            <td>${todo.done}</td>
                            <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
                             <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
    		</table>
    		<a href="add-todo" class="btn btn-success">Add</a>
             <%@ include file="common/footer.jspf" %>
	</div>

	</body>
</html>