<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<petclinic:layout pageName="players">
    <h2>All Players</h2>
		    
		    <table id="playersTable" class="table table-striped">
		        <thead>
		        <tr>
		        	<th style="width: 150px;">Username</th>
		            <th style="width: 150px;">Name</th>
		            <th style="width: 200px;">Email</th>
		          	<th style="width: 150px;">Password</th>
		          	<th style="width: 150px;">Stats</th>
		        </tr>
		        </thead>
		        <tbody>
		        
		        <c:forEach items="${players}" var="player">
		            <tr>
		            	<td>
		                    <c:out value="${player.user.username}"/>
		                </td>
		                <td>
		                    <spring:url value="/players/{playerId}" var="playerUrl">
		                        <spring:param name="playerId" value="${player.id}"/>
		                    </spring:url>
		                    <a href="${fn:escapeXml(playerUrl)}"><c:out value="${player.firstName} ${player.lastName}"/></a>
		                </td>
		                <td>
		                    <c:out value="${player.email}"/>
		                </td>
		            	<td>
		                    <a value="${player.user.password}"/><span class="glyphicon glyphicon glyphicon-duplicate warning" aria-hidden="true"></span></a>
		                </td>
		                <td>
							<spring:url value="/statistics/{playerId}" var="addUrl">
								<spring:param name="playerId" value="${player.id}"/>
							</spring:url>
							<a href="${fn:escapeXml(addUrl)}" class="btn btn-warning">Stats</a>
						</td>
		            </tr>
		        </c:forEach>
		        </tbody>
		    </table>
	    
	    <td>Page <c:out value="${page_id + 1}" /> of <c:out
				value="${total_pages}" /></td>
		<br>

		<c:forEach begin="0" step="1" end="${total_pages - 1}" var="variable">
			<td><spring:url value="/allPlayers/{PageId}"
					var="urlBoton">
					<spring:param name="PageId" value="${variable}" />
				</spring:url> <a href="${fn:escapeXml(urlBoton)}">${variable + 1}</a></td>
		</c:forEach>
		
		<br>
		<div class="form-group">
	            <div class="col-sm-offset-10 col-sm-10">
	            		<right>
							<a class="btn btn-default" href='<spring:url value="/players/new" htmlEscape="true"/>'>Add player</a>
						</right>
	            </div>
	        </div>
		
</petclinic:layout>
	    