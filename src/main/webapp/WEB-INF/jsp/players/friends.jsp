<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!--  >%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%-->

<petclinic:layout pageName="players">

  
   
    <br></br>
    <h2>Friends Information</h2>
	
    
	<table id="friendTable" class="table table-striped">
		        <thead>
		        <tr>
		        	<th style="width: 150px;">Username</th>
		            <th style="width: 150px;">Name</th>
		            <th style="width: 150px;">Email</th>
		            <th style="width: 30px;">Delete</th>
		        </tr>
		        </thead>
		        <tbody>
		        <c:forEach items="${selections}" var="friend">
		            <tr>
		            	<td>
		                    <c:out value="${friend.user.username}"/>
		                </td>
		                <td>
		                    <spring:url value="/players/{playerId}" var="playerUrl">
		                        <spring:param name="playerId" value="${friend.id}"/>
		                    </spring:url>
		                    <a href="${fn:escapeXml(playerUrl)}"><c:out value="${friend.firstName} ${friends.lastName}"/></a>
		                </td>
		                <td>
		                    <c:out value="${friend.email}"/>
		                </td>
		                <td>
		                	<spring:url value="/players/{friendId}/deleteFriend" var="FriendUrl">
        						<spring:param name="friendId" value="${friend.id}"/>
    						</spring:url>	                   
    						<a href="${fn:escapeXml(FriendUrl)}" class="btn btn-danger">Remove</a>
						</td>
		            </tr>
		        </c:forEach>
		        </tbody>
	  </table>
		    
</petclinic:layout>
