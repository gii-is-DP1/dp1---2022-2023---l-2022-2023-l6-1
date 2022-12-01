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
    <h2>FriendRequests</h2>
	
		
	
	
		
		
		    <table id="friendRequestTable" class="table table-striped">
		        <thead>
		        <tr>
		        	<th style="width: 150px;">Username</th>
		            <th style="width: 150px;">Name</th>
		          	<th style="width: 150px;">Accept or Reject</th>
		        </tr>
		        </thead>
		        <tbody>
		        
		        <c:forEach items="${selections}" var="player">
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
		            		<spring:url value="{playerSenderId}/friendRequest/accept" var="addFriendUrl">
        						<spring:param name="playerSenderId" value="${player.id}"/>
    						</spring:url>	                   
    						<a href="${fn:escapeXml(addFriendUrl)}" class="btn btn-success">Accept</a>
    						
    						<spring:url value="{playerSenderId}/friendRequest/reject" var="rejectFriendUrl">
        						<spring:param name="playerSenderId" value="${player.id}"/>
    						</spring:url>	                   
    						<a href="${fn:escapeXml(rejectFriendUrl)}" class="btn btn-danger">Reject</a>
		                </td>
		            </tr>
		        </c:forEach>
		        </tbody>
		    </table>
	    
</petclinic:layout>
