<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
 <h1>Customer Creation</h1>
<form:form method="post" modelAttribute="saveCustomer">
    <fieldset class="mb-3">
         <form:label path="cus_name">Customer Name</form:label>
         <form:input type="text" path="cus_name" required="required"/>
         <form:errors path="cus_name" cssClass="text-warning"/>
     </fieldset>
     <fieldset class="mb-3">
         <form:label path="cus_code">Customer Code</form:label>
         <form:input type="text" path="cus_code" required="required"/>
         <form:errors path="cus_code" cssClass="text-warning"/>
     </fieldset>
 <input type="submit" class="btn btn-success" value="submit"/>
</form:form>
</div>

<%@ include file="common/footer.jspf" %>