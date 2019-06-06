<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Working With Spring Validator</title>

<style type="text/css">
.err{
	color: red;
	font-size: 15px;
}
</style>
</head>
<body>
<form:form action="save" method="POST" modelAttribute="admin">
		<pre><h2>
			NAME		:<form:input path="adminName" />	<form:errors path="adminName" cssClass="err"/>  
			COUNTRY		:<form:select path="adminDept">
						<form:option value="">-SELECT-</form:option>
 				<form:option value="DEV">DEV</form:option>
 				<form:option value="QA">QA</form:option>
 				<form:option value="BA">BA</form:option>
 				</form:select>		<form:errors path="adminDept" cssClass="err"/> 
			GENDER		:<form:radiobutton path="adminGrade" value="G1"/>G1<form:radiobutton path="adminGrade" value="G2"/>G2<form:radiobutton path="adminGrade" value="G3"/>G3		<form:errors path="adminGrade" cssClass="err"/>
			NOTE		:<form:textarea path="adminNote" />	<form:errors path="adminNote" cssClass="err"/>
			
						
					
			GRANTS		:<form:checkbox path="adminGrants" value="ACCEPT" />ACCEPT
					 <form:checkbox path="adminGrants" value="EXPORT" />EXPORT
					 <form:checkbox path="adminGrants" value="READ" />READ
					 <form:errors path="adminGrants" cssClass="err"/> 
			<input type="submit" value="Register">
		</h2></pre>
	</form:form>
</body>
</html>