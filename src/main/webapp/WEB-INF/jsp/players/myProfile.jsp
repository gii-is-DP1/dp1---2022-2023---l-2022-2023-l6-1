<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!--  >%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%-->

<petclinic:layout pageName="players">

    <h2>Player Information</h2>


    <table class="table table-striped">
        <tr>
            <th>Name</th>
            <td><b><c:out value="${player.firstName} ${player.lastName}"/></b></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><c:out value="${player.email}"/></td>
        </tr>
        <tr>
            <th>Games</th>
            <td><c:out value="${statistics.games}"/></td>
        </tr>
        <tr>
            <th>Games won</th>
            <td><c:out value="${statistics.games_won}"/></td>
        </tr>
        <tr>
            <th>Total Score</th>
            <td><c:out value="${statistics.total_score}"/></td>
        </tr>
    </table>
	
		<spring:url value="{playerId}/edit" var="editUrl">
        	<spring:param name="playerId" value="${player.id}"/>
   	 	</spring:url>
    	<a href="${fn:escapeXml(editUrl)}" class="btn btn-default">Edit player</a>
   

	
    <spring:url value="{playerId}/friends/new" var="addUrl">
        <spring:param name="playerId" value="${player.id}"/>
    </spring:url>
    <a href="${fn:escapeXml(addUrl)}" class="btn btn-default">Add New Friend</a>
    
    <spring:url value="/players/myProfile/statistics" var="addUrl">
    </spring:url>
    <a href="${fn:escapeXml(addUrl)}" class="btn btn-default">Get Statistics</a>


</petclinic:layout>
