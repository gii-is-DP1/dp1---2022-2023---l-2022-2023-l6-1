<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<petclinic:layout pageName="board">


    <h2><fmt:message key="welcome"/></h2>
    
    <p>	
    <h2><c:out value="${now}"/></h2>

    <div class="row">
       	<petclinic:board board="${board}">	
   		</petclinic:board>
    </div>
</petclinic:layout>
