<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<petclinic:layout pageName="board">
    <h2>Game Started</h2>
    
    <p>	
    <h2><c:out value="${now}"/></h2>
    	
    <div class="container-fluid">
		<div class="row">
    		<div class="col-md-4">
				<table id="board1Game"class="table table-striped">
				<thead>
				<tr>
					<th>CardsToMove</th>
				</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<petclinic:menuItem active="${name eq 'play'}" url="/"
								title="Possible Cards To Move" dropdown="${true}">
								<ul class="dropdown-menu">
								<c:forEach items="${board.cards}" var="card">
									<c:if test="${card.isShowed == true }">
										<li>
											<a href="<c:url value="/board/moveCard/${card.id}"/>" >${card.number}-${card.suit}</a>
										</li>
									
									</c:if>
									</c:forEach>
								</div>
								
								</ul>
							</petclinic:menuItem>
					
						<br>
						<center>
								<a href="/board/moveCardDeck" class="btn btn-warning">Take card from deck</a>
								<a href="/board/giveup" class="btn btn-danger">Give up!</a>
						</center>
							</td>
						</tr>
				</tbody>
			</table>
			</div>

			<div class="col-md-4">
			<petclinic:board board="${board}">
				<c:forEach items="${board.cards}" var="card">
					<petclinic:card size="100" card="${card}" />
				</c:forEach>
			</petclinic:board>
			</div>
    	</div>
   	</div>
    
</petclinic:layout>
