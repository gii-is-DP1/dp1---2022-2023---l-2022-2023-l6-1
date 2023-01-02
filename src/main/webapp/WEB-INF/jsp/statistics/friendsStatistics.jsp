<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<petclinic:layout pageName="statistics">
	<h2> Statistics </h2>

    <table id="playersTable" class="table table-striped">
        <thead>
        <tr>
        	<th style="width: 150px;">Games</th>
            <th style="width: 150px;">Games_won</th>
            <th style="width: 200px;">Games_lost</th>
          	<th style="width: 150px;">Total_score</th>
        </tr>
        </thead>
        <tbody>
	        <c:forEach items="${statistics}" var="statistics">
	            <tr>
	            	<td>
	                    <c:out value="${statistics.games}"/>
	                </td>
	                <td>
	                    <c:out value="${statistics.gamesWon}"/>
	                </td>
	                <td>
	                    <c:out value="${statistics.gamesLost}"/>
	                </td>
	                <td>
	                    <c:out value="${statistics.totalScore}"/>
	                </td>
	            </tr>
	        </c:forEach>
        </tbody>
    </table>
    
    
</petclinic:layout>