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
            <th>Username</th>
            <td><c:out value="${player.user.username}"/></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><c:out value="${player.email}"/></td>
        </tr>
    </table>
	
    <sec:authorize access="hasAuthority('admin')">
		<spring:url value="{playerId}/edit" var="editUrl">
        	<spring:param name="playerId" value="${player.id}"/>
   	 	</spring:url>
    	<a href="${fn:escapeXml(editUrl)}" class="btn btn-default">Edit player</a>
	</sec:authorize>
	
	   <sec:authorize access="hasAuthority('admin')">
		<spring:url value="{playerId}/delete" var="editUrl">
        	<spring:param name="playerId" value="${player.id}"/>
   	 	</spring:url>
    	<a href="${fn:escapeXml(editUrl)}" class="btn btn-default">Delete player</a>
	</sec:authorize>    

    <sec:authorize access="hasAuthority('player')">
    	<a href='${playerId}/friendRequest/new' onclick= miFunc();>
    		<button class="btn btn-default" id="boton1" style="display:block;">Send Friend Request</button>
    	</a>
    	
	</sec:authorize>

</petclinic:layout>
