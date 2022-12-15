<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
					<petclinic:card size="100" card="${card}" />
				</c:forEach>
			</petclinic:board>
		</div>
	</div>
	
	<table id="board1Game"class="table table-striped">
		<thead>
		<tr>
			<th>CartasAMover</th>
		</tr>
		</thead>
		<tbody>
			<tr>
				<td>
					<petclinic:menuItem active="${name eq 'play'}" url="/"
					title="Posibles Cartas Para Mover" dropdown="${true}">
						<ul class="dropdown-menu">
							<c:forEach items="${board.cards}" var="card">
								<c:if test="${card.isShowed == true }">
									<li>
										<a href="<c:url value="/board/moveCard/${card.id}"/>" >${card.number}-${card.suit}</a>
									</li>
									
								</c:if>
							</c:forEach>
								
							</ul>
					</petclinic:menuItem>
					
					
					<petclinic:menuItem active="${name eq 'play'}" url="/"
					title="Sacar Carta de la baraja" dropdown="${true}">
						<ul class="dropdown-menu">
							<c:forEach items="${board.cards}" var="card">
								<c:if test="${card.isShowed == false && card.getXPosition() == 0 && card.getYPosition() == 0}">
									<li>
										<a href="<c:url value="/board/moveCardDeck/${card.id}"/>" >${card.number}-${card.suit}</a>
									</li>
									
								</c:if>
							</c:forEach>
								
							</ul>
					</petclinic:menuItem>
				</td>
			</tr>
		</tbody>
	</table>
</petclinic:layout>
