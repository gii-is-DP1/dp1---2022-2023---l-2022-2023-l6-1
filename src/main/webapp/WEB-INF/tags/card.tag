<%@ attribute name="size" required="true" rtexprvalue="true" 
 description="Size of the card to show" %>
 <%@ attribute name="card" required="true" rtexprvalue="true" type="org.springframework.samples.solitaire.card.Card"
 description="Card to be rendered" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
 
 <c:if test="${card.isShowed == false }">
	 image2 = document.getElementById('${card.number}-${card.suit}-${card.color}-Solapa');
	 ctx.drawImage(image2,${card.getPositionXInPixels(size)},${card.getPositionYInPixels(size)},${size},${size});
 </c:if>
	 <c:if test="${card.isShowed == true}">
	 image = document.getElementById('${card.number}-${card.suit}-${card.color}');
	 ctx.drawImage(image,${card.getPositionXInPixels(size)},${card.getPositionYInPixels(size)},${size},${size});
	</c:if>
	<c:if test="${card.getXPosition() == 5 && card.getYPosition() == 0}">
	 image = document.getElementById('${card.number}-${card.suit}-${card.color}');
	 ctx.drawImage(image,${card.getPositionXInPixels(size)},${card.getPositionYInPixels(size)},${size},${size});
	</c:if>
	<c:if test="${card.getXPosition() == 6 && card.getYPosition() == 0}">
	 image = document.getElementById('${card.number}-${card.suit}-${card.color}');
	 ctx.drawImage(image,${card.getPositionXInPixels(size)},${card.getPositionYInPixels(size)},${size},${size});
	</c:if>
	<c:if test="${card.getXPosition() == 7 && card.getYPosition() == 0}">
	 image = document.getElementById('${card.number}-${card.suit}-${card.color}');
	 ctx.drawImage(image,${card.getPositionXInPixels(size)},${card.getPositionYInPixels(size)},${size},${size});
	</c:if>
	<c:if test="${card.getXPosition() == 8 && card.getYPosition() == 0}">
	 image = document.getElementById('${card.number}-${card.suit}-${card.color}');
	 ctx.drawImage(image,${card.getPositionXInPixels(size)},${card.getPositionYInPixels(size)},${size},${size});
	</c:if>
	
