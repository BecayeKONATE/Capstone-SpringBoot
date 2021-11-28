<%@ include file="common/head.jspf" %>
<%@ include file="common/navigation.jspf" %>


<h1>Welcome to our Flight Application</h1><br><br>
		
		
		<a href="/add-flight"><button type="button" class="btn btn-primary">Add flight</button></a>
		<a href="/search-flight"><button type="button" class="btn btn-primary">search flight</button></a>
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Airlines</th>
      				<th scope="col">Source</th>
      				<th scope="col">Destination</th>
      				<th scope="col">Fare</th>
      				<th scope="col">Date</th>
      				<th scope="col">Seat Count</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${flights }" var="fly">
					<tr>
						<td>${fly.flightId}</td>
						<td>${fly.airlines}</td>
						<td>${fly.source}</td>
						<td>${fly.destination}</td>
						<td>${fly.fare}</td>
						<td>${fly.journeyDate}</td>
						<td>${fly.seatCount}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
			
		
		
				

<%@ include file="common/footer.jspf" %>