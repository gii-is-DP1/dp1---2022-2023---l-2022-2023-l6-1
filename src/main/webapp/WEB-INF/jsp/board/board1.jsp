<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<petclinic:layout pageName="board">

    <h2>Partida Iniciada</h2>

    <p>	
    <h2><c:out value="${now}"/></h2>
    
	<div class="row">
		<div class="col-md-12">
			<petclinic:board board="${board}">
			<c:forEach items="${board.cards}" var="card">
				<petclinic:card size="100" card="${card}"/>
				out.print(card.id)
			</c:forEach>		
			</petclinic:board>
		</div>
	</div>
</petclinic:layout>


