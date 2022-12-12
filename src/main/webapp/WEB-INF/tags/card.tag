<%@ attribute name="size" required="true" rtexprvalue="true" 
 description="Size of the card to show" %>
 <%@ attribute name="card" required="true" rtexprvalue="true" type="org.springframework.samples.petclinic.card.Card"
 description="Card to be rendered" %>
 
 image = document.getElementById('${card.number}-${card.suit}-${card.color}');
 ctx.drawImage(image,${card.getPositionXInPixels(size)},${card.getPositionYInPixels(size)},${size},${size});
 

