<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New/Edit Students</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		
		$(".langChange").click(function(){
			
				var lang=$(this).data("lang");
				//alert("selected lang = "+lang);
				$.get("http://localhost:8082/SpringMVCHibernateCRUD/language",
						{lang:lang},
						function(data){
							//alert(data);
							location.reload();
						}
				);
			
		});
		
	});
</script>

</head>
<body>

<div align="center">
	<h1>Create new or Edit Student Detail</h1>
	<h4>
		Language: <button class="langChange" data-lang="en">English</button> | <button class="langChange" data-lang="es">Spanish</button>
	</h4>
	<h3> <spring:message code="MyDate"/>  </h3> 
	<form:form action="saveStudent" method="post" modelAttribute="student">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Date of Birth:</td>
                <td><form:input path="dateOfBirth" /></td>
                <td><form:errors path="dateOfBirth" /> </td>
            </tr>
            <tr>
                <td colspan="3" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
</div>

</body>
</html>