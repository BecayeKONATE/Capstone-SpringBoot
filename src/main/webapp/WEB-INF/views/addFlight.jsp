<%@ include file="common/head.jspf" %>
<%@ include file="common/navigation.jspf" %>





<form:form method="post" modelAttribute="flight">
	 <form:hidden path="flightId"/>
	 <form:errors path="airlines" cssClass="text-danger"/><br>
	 <form:input type="text" path="airlines" placeholder="airlines"/><br><br>
	 <form:input type="text" path="source" placeholder="source"/><br><br>
	 <form:input type="text" path="destination" placeholder="destination"/><br><br>
	 <form:input type="text" path="fare" placeholder="fare"/><br><br>
	 <form:input type="text" path="journeyDate" placeholder="Date"/><br><br>
	 <form:input type="text" path="seatCount" placeholder="seat Count"/><br><br>   
	<input type="submit" value="add"/>
</form:form>





<%@ include file="common/footer.jspf" %>