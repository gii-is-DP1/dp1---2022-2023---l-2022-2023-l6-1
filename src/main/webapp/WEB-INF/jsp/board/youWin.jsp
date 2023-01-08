<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<body style="background: url(/resources/images/background.jpg)">
<petclinic:layout pageName="board">
    <div align="center" style="margin-left: 50px; margin-top: -80px;">
            <spring:url value="/resources/images/ganar.png"
                htmlEscape="true" var="ganar" />
            <img id="f2" class="img-responsive"
                src="${ganar}" width="750" height="750" />
    </div>
		<br>
		</br>
		<center>
			<a href="/startGame" class="btn btn-warning">Play again, you are on a roll!</a>
		</center>
		</br>

	</petclinic:layout>
