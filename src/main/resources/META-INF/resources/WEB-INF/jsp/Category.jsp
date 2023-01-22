<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
 <h1>Category Creation</h1>
<form:form method="post" modelAttribute="category">
	<fieldset class="mb-3">

         <form:label path="brand_key">Select Brand</form:label>
        <form:select path="brand_key">
        		<form:options items="${brandlist}" itemValue="brand_id" itemLabel="Brand_name"/>
        </form:select>
     </fieldset>
    <fieldset class="mb-3">
         <form:label path="category_name">Category Name</form:label>
         <form:input type="text" path="category_name" required="required"/>
         <form:errors path="category_name" cssClass="text-warning"/>
     </fieldset>
     <fieldset class="mb-3">
         <form:label path="category_code">Category Code</form:label>
         <form:input type="text" path="category_code" required="required"/>
         <form:errors path="category_code" cssClass="text-warning"/>
     </fieldset>
 <input type="submit" class="btn btn-success" value="submit"/>
</form:form>
</div>

<%@ include file="common/footer.jspf" %>