<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!--  >%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%-->

<body style="background: url(/resources/images/background.jpg)">

<petclinic:layout pageName="Difficult">
		
		<br>
    	<center>
    		<a href="/difficult1" class="btn btn-warning btn-lg">Easy Mode</a>
		</center>
		</br>
		<br>
		<br>
		<center>
    		<a href="/startGame/difficult2" class="btn btn-warning btn-lg" >Hard Mode</a>
		</center>
		</br>

</petclinic:layout>
</body>