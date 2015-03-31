<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link type="text/css" rel="stylesheet" href="../css/default.css">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Reviva Clinical Trial Assistant</title>
 	<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
 	<script src="../js/script.js"></script>	
</head>
<body>
<%@include file="header.jsp" %>
<main>

	<form  action="createuser.action" class="register" method="post">
		<fieldset class="row1">
                <legend>User Details
                </legend>
			<p>
			      <label for="clientname">Client Name</label>
			      <input type="text" name="clientname" maxlength="100" class="readonly" readonly>
			</p>
			<p>
			      <label for="username">User Name</label>
			      <input type="text" name="username" maxlength="100">
			</p>	
			<p>
			      <label for=""salutation"">Salutation</label>
			      <input type="text" name="salutation" maxlength="10" class="short">
			      <label for=""firstname"">First Name</label>
			      <input type="text" name="firstname" maxlength="100">
			      <label for=""lastname"">Last Name</label>
			      <input type="text" name="lastname" maxlength="100">			      			      
			</p>					
			<p>
			     <label for="addressline1">Address Line 1</label>
			     <input type="text" name="address1" maxlength="100" class="long">
			</p>
			<p>
			     <label for="addressline2">Address Line 2</label>
			     <input type="text" name="address2" maxlength="100" class="long">
			</p>			
			<p>
			     <label for="country">Country</label>
			     <select name="country">
			     	<option>India</option>
			     	<option>USA</option>
			     	<option>England</option>
			     </select>
			</p>
			</p>
			     <label for="state">State</label>
			     <input type="text" name="state" maxlength="100">
			</p>
			<p>
			     <label for="citytown">City/Town</label>
			     <input type="text" name="city" maxlength="100">
			     <label for="zipcode">Zipcode</label>
			     <input type="text" name="zip" maxlength="10" class="short">
			</p>		
			<p>
			     <label for=""phone"">Phone</label>
			     <input type="url" name="phone" maxlength="100">
			</p>		
			<p>
			     <label for="email">Email</label>
			     <input type="email" name="email" maxlength="100">
			     <span>Enter a valid email address</span>
			</p>						
			<p>
			     <label for="zipcode">Timezone</label>
			     <input type="text" name="timezone" maxlength="10">
			     <span>Enter GMT offset</span>
			</p>	
			<div><button class="button">Submit</button></div>
			
	</fieldset>

	</form>

</main>	
<%@include file="navigation.jsp" %>
		
<%@include file="footer.jsp" %>		
</body>
</html>