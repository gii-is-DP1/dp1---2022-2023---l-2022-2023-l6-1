<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>


<petclinic:layout pageName="friends">
    <h2>Friends List</h2>
    <label>${friends.name}</label>

     <table id="FriendsTable" class="table">
        <thead>
        <tr>
            <th style="width: 150px;">Name</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${friends}" var="friends">
                <tr>
                    <td>
                        <c:out value="${friends.name}"/>
                    </td>
                </tr>
            </c:forEach> 
        </tbody>
    </table>

</petclinic:layout>
