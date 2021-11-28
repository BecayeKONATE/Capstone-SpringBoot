<%@ include file="common/head.jspf" %>
<%@ include file="common/navigation.jspf" %>





<form:form method="post" modelAttribute="search">
	
	 <form:errors path="airlines" cssClass="text-danger"/><br>
	 <form:input type="text" path="source" placeholder="source"/><br><br>
	 <form:input type="text" path="destination" placeholder="destination"/><br><br>
	 <form:input type="text" path="journeyDate" placeholder="Date"/><br><br>
	<input type="submit" value="Search"/>
</form:form>





<%@ include file="common/footer.jspf" %>