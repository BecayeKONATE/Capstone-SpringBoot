<%@ include file="common/head.jspf" %>
<%@ include file="common/navigation.jspf" %>



<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Airlines</th>
      				<th scope="col">Source</th>
      				<th scope="col">Destination</th>
      				<th scope="col">Fare</th>
      				<th scope="col">Date</th>
      				<th scope="col">Seat Count</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${search }" var="see">
					<tr>
						<td>${see.source}</td>
						<td>${see.destination}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>







<%@ include file="common/footer.jspf" %>