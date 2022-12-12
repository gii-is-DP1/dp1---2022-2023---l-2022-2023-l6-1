<%@ attribute name="board" required="false" rtexprvalue="true" type="org.springframework.samples.petclinic.board.Board"
 description="Board to be rendered" %>
<canvas id="canvas" width="${board.width}" height="${board.height}"></canvas>
<img id="source" src="${board.background}" style="display:none">
<img id="1-DIAMONDS-RED" src="resources/images/1-DIAMONDS-RED.png" style="display:none">
<img id="1-HEARTS-RED" src="resources/images/1-HEARTS-RED.png" style="display:none">
<img id="12-HEARTS-RED" src="resources/images/12-HEARTS-RED.png" style="display:none">
<img id="4-CLUBS-BLACK" src="resources/images/4-CLUBS-BLACK.png" style="display:none">
<img id="5-CLUBS-BLACK" src="resources/images/5-CLUBS-BLACK.png" style="display:none">
<img id="6-CLUBS-BLACK" src="resources/images/6-CLUBS-BLACK.png" style="display:none">
<img id="7-CLUBS-BLACK" src="resources/images/7-CLUBS-BLACK.png" style="display:none">
<img id="8-CLUBS-BLACK" src="resources/images/8-CLUBS-BLACK.png" style="display:none">
<img id="9-CLUBS-BLACK" src="resources/images/9-CLUBS-BLACK.png" style="display:none">
<img id="10-CLUBS-BLACK" src="resources/images/10-CLUBS-BLACK.png" style="display:none">
<img id="11-CLUBS-BLACK" src="resources/images/11-CLUBS-BLACK.png" style="display:none">
<img id="12-CLUBS-BLACK" src="resources/images/12-CLUBS-BLACK.png" style="display:none">
<img id="13-CLUBS-BLACK" src="resources/images/13-CLUBS-BLACK.png" style="display:none">
<img id="Solapa" src="resources/images/Solapa.png" style="display:none">

<script>
function drawBoard(){ 
    var canvas = document.getElementById("canvas");
    var ctx = canvas.getContext("2d");
    var image = document.getElementById('source');
    ctx.drawImage(image, 0, 0, ${board.width}, ${board.height});     
    <jsp:doBody/>
}
window.onload =drawBoard();
</script>