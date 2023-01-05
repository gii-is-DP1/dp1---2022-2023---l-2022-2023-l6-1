<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<body style="background: url(/resources/images/background.jpg)">
<petclinic:layout pageName="board">
    <div align="center" style="margin-left: 50px; margin-top: 50px;">
            <spring:url value="/resources/images/Ganar.png"
                htmlEscape="true" var="perder" />
            <img id="f2" class="img-responsive"
                src="${perder}" width="960" height="1020" />
    </div>
		<br>
		</br>
		<br>
		</br>
		<br>
		<center>
			<a href="/startGame" class="btn btn-warning">Try again?</a>
		</center>
		</br>

	</petclinic:layout>
