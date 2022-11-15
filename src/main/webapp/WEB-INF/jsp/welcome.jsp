<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<petclinic:layout pageName="home">
	
    <div class="container-fluid">
    	<div class="row">
        	<div class="col-md-4">
            </div>
            <div class="col-md-4">
            	<img src="<spring:url value="/resources/images/coollogo_com-241492106.png" htmlEscape="true" />"
            	
            </div>
            <div class="col-md-4">
            	 <img src="<spring:url value="/resources/images/ases_inicio.png" htmlEscape="true"/>"

          </div>
          </div>

</petclinic:layout>



