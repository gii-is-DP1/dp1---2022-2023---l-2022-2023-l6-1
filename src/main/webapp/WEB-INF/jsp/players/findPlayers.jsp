<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!--  >%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%-->

<petclinic:layout pageName="players">

    <h2>Find Players</h2>

    
    <form:form modelAttribute="player" action="/players" method="get" class="form-horizontal"
               id="search-player-form">
        <div class="form-group">
            <div class="control-group" id="lastName">
                <label class="col-sm-2 control-label">Last name </label>
                <div class="col-sm-10">
                    <form:input class="form-control" path="lastName" size="30" maxlength="80"/>
                    <span class="help-inline"><form:errors path="*"/></span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Find Player</button>
            </div>
        </div>
	
    </form:form>
    	

    <br/> 
    <sec:authorize access="hasAuthority('admin')">
		<a class="btn btn-default" href='<spring:url value="/players/new" htmlEscape="true"/>'>Add player</a>
	</sec:authorize>
	
	
	<sec:authorize access="hasAuthority('admin')">
		<table id="playersTable" class="table table-striped">
		        <thead>
		        <tr>
		        	<th style="width: 150px;">Username</th>
		            <th style="width: 150px;">Name</th>
		            <th style="width: 200px;">Email</th>
		          	<th style="width: 150px;">Password</th>
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
		                    <c:out value="${player.email}"/>
		                </td>
		            	<td>
		                    <a value="${player.user.password}"/><span class="glyphicon glyphicon glyphicon-duplicate warning" aria-hidden="true"></span></a>
		                </td>
		            </tr>
		        </c:forEach>
		        </tbody>
		    </table>
	</sec:authorize>
	
</petclinic:layout>
