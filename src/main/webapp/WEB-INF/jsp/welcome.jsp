<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->

<body style="background: url(/resources/images/background.jpg)">
    <petclinic:layout pageName="home">

    <br>
        <br>
        <div align="center" style="margin-left: 50px; margin-top: -30px;">
            <img src="<spring:url value="/resources/images/logo.png" htmlEscape="true" />"
        </div>

        <div align="center" style="margin-left: 20px; margin-top: -40px;">
            <spring:url value="/resources/images/cartas_move.gif"
                htmlEscape="true" var="videoCartas" />
            <img id="f2" class="img-responsive"
                src="${videoCartas}" width="420" height="420" />
        </div>

        <div align="right" style="margin-right: 20px; margin-top: 50px; margin-bottom: -80px;">
            <spring:url value="/resources/images/logoUniversidad_3.png"
                htmlEscape="true" var="logoUs" />
            <img id="f2" class="img-responsive"
                src="${logoUs}" width="140" height="200" />
        </div>

    </petclinic:layout>
</body>

