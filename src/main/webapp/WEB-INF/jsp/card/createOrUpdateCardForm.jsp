<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="cards">
    
    <h2>
         Card
    </h2>
    
    <form:form modelAttribute="card" class="form-horizontal" id="update-card-form">
        <div class="form-group has-feedback">
            <petclinic:inputField label="Columna" name="xPosition"/>
            <petclinic:inputField label="Fila" name="yPosition"/>
            <petclinic:inputField label="Numero" name="number"/>
            <petclinic:inputField label="Color" name="color"/>
            <petclinic:inputField label="Palo" name="suit"/>
            <petclinic:inputField label="Muestra" name="isShowed"/>
            <petclinic:inputField label="BoardId" name="board.id"/>
        </div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button class="btn btn-default" type="submit">Update Card</button>
			</div>
		</div>
	</form:form>
</petclinic:layout>
