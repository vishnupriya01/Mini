<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
 <h1>Brand Creation</h1>
<form:form method="post" modelAttribute="brand">
    <fieldset class="mb-3">
         <form:label path="brand_name">Brand Name</form:label>
         <form:input type="text" path="brand_name" required="required"/>
         <form:errors path="brand_name" cssClass="text-warning"/>
     </fieldset>
     <fieldset class="mb-3">
         <form:label path="brand_code">Brand Code</form:label>
         <form:input type="text" path="brand_code" required="required"/>
         <form:errors path="brand_code" cssClass="text-warning"/>
     </fieldset>
 <input type="submit" class="btn btn-success" value="submit"/>
</form:form>
</div>

<%@ include file="common/footer.jspf" %>