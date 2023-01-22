<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
 <h1>Supplier Creation</h1>
<form:form method="post" modelAttribute="saveSupplier">



         <fieldset class="mb-3">
                 <form:label path="sup_name">Supplier Name</form:label>
                 <form:input type="text" path="sup_name" required="required"/>
                 <form:errors path="sup_name" cssClass="text-warning"/>

                 <form:label path="sup_code">Supplier Code</form:label>
                 <form:input type="text" path="sup_code" required="required"/>
                 <form:errors path="sup_code" cssClass="text-warning"/>

                 <form:label path="Nature">Supplier Nature</form:label>
                 <form:input type="text" path="Nature" required="required"/>
                 <form:errors path="Nature" cssClass="text-warning"/>
             </fieldset>
<fieldset class="mb-3">
                 <form:label path="GST_No">GST No </form:label>
                 <form:input type="text" path="GST_No" required="required"/>
                 <form:errors path="GST_No" cssClass="text-warning"/>

                 <form:label path="contact_Person">Contact Person</form:label>
                 <form:input type="text" path="contact_Person" required="required"/>
                 <form:errors path="contact_Person" cssClass="text-warning"/>

                 <form:label path="contact_No">Contact No</form:label>
                 <form:input type="text" path="contact_No" required="required"/>
                 <form:errors path="contact_No" cssClass="text-warning"/>
</fieldset>
<fieldset class="mb-3">
          <form:label path="opening_Balance">Opening Balance</form:label>
                 <form:input type="text" path="opening_Balance" required="required"/>
                 <form:errors path="opening_Balance" cssClass="text-warning"/>

                 <form:label path="max_credit_days">Max Credit Days</form:label>
                 <form:input type="text" path="max_credit_days" required="required"/>
                 <form:errors path="max_credit_days" cssClass="text-warning"/>

                 <form:label path="supplier_Location_id">Supplier Location</form:label>
                 <form:input type="text" path="supplier_Location_id" required="required"/>
                 <form:errors path="supplier_Location_id" cssClass="text-warning"/>
             </fieldset>
 <div class="col-md-6">
    <form:label path="email" class="form-label">Email</form:label>
    <form:input type="email" class="form-control" path="email" />
  </div>
  <div class="col-md-6">
    <form:label path="mobile_no" class="form-label">Mobile No</form:label>
    <form:input type="text" class="form-control" path="mobile_no" />
  </div>
  <div class="col-12">
    <form:label path="address1" class="form-label">Address</form:label>
    <form:input type="text" class="form-control" path="address1" placeholder="1234 Main St" />
  </div>
  <div class="col-12">
    <form:label path="address2" class="form-label">Address 2</form:label>
    <form:input type="text" class="form-control" path="address2" placeholder="Apartment, studio, or floor" />
  </div>
  <div class="col-md-6">
    <form:label path="city" class="form-label">City</form:label>
    <form:input type="text" class="form-control" path="city" />
  </div>
  <div class="col-md-4">
    <form:label path="state" class="form-label">State</form:label>
    <select path="state" class="form-select">
      <option selected>Choose...</option>
      <option>...</option>
    </select>
  </div>
  <div class="col-md-2">
    <form:label path="pinCode" class="form-label">PinCode</form:label>
    <form:input type="text" class="form-control" path="pinCode" />
  </div>

 <input type="submit" class="btn btn-success" value="submit"/>

</form:form>
</div>

