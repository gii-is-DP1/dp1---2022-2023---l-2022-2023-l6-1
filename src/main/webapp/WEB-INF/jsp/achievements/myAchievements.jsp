<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<petclinic:layout pageName="achievements">
    <h2>Achievements</h2>
    
     <table id="achievementsTable" class="table table-striped">
        <thead>
        <tr>
        	<th style="width: 150px;">Name</th>
            <th style="width: 400px;">Description</th>
            <th style="width: 50px;">Image</th>
            
        </tr>
        </thead>
        <tbody>
	        <c:forEach items="${achievements}" var="achievements">
	            <tr>
	            	<td>
	                    <c:out value="${achievements.name}"/>
	                </td>
	                <td>
	                    <c:out value="${achievements.description}"/>
	                </td>
	         
	                <td>
                        <img src="resources/images/${achievements.image}" width="50" height="50" /> 
	                </td>
	                
	            </tr>
	        </c:forEach> 
        </tbody>
    </table>

</petclinic:layout>