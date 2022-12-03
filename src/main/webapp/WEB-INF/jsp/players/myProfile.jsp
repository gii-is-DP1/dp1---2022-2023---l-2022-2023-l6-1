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
	
	<spring:url value="{playerId}/edit" var="editUrl">
    	<spring:param name="playerId" value="${player.id}"/>
 	</spring:url>
	<a href="${fn:escapeXml(editUrl)}" class="btn btn-default">Edit Profile</a>
   
   
   <spring:url value="{playerId}/friendRequest" var="addUrl">
        <spring:param name="playerId" value="${player.id}"/>
    </spring:url>
    <a href="${fn:escapeXml(addUrl)}" class="btn btn-default">Friends Request</a>
   
   
    <br></br>
    <h2>Friends Information</h2>
	
    
	<table id="friendTable" class="table table-striped">
		        <thead>
		        <tr>
		        	<th style="width: 150px;">Username</th>
		            <th style="width: 150px;">Name</th>
		        </tr>
		        </thead>
		        <tbody>
		        <c:forEach items="${selections}" var="friends">
		            <tr>
		            	<td>
		                    <c:out value="${friends.friend1.player.user.username}"/>
		                </td>
		                <td>
		                    <spring:url value="/players/{playerId}" var="playerUrl">
		                        <spring:param name="playerId" value="${player.id}"/>
		                    </spring:url>
		                    <a href="${fn:escapeXml(playerUrl)}"><c:out value="${friends.friend1.firstName} ${friends.friend1.lastName}"/></a>
		                </td>
		            </tr>
		        </c:forEach>
		        </tbody>
	  </table>
		    
</petclinic:layout>
