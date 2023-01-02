<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!--  >%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%-->
<%@ attribute name="name" required="true" rtexprvalue="true"
	description="Name of the active menu: home, owners, vets or error"%>


<nav class="navbar navbar-default" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand"
				href="<spring:url value="/" htmlEscape="true" />"><span></span></a>
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#main-navbar">
				<span class="sr-only"><os-p>Toggle navigation</os-p></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<div class="navbar-collapse collapse" id="main-navbar">
			<ul class="nav navbar-nav">

				<petclinic:menuItem active="${name eq 'home'}" url="/"
					title="home page">
					<span class="glyphicon glyphicon-home" aria-hidden="true"></span>
					<span>Home</span>
				</petclinic:menuItem>
               
				<petclinic:menuItem active="${name eq 'players'}" url="/players/find"
					title="find players">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					<span>Find players</span>
				</petclinic:menuItem>
				
				<sec:authorize access="hasAuthority('player')">
				<petclinic:menuItem active="${name eq 'game'}" url="/startGame"
					title="Start Game">
					<span class="glyphicon glyphicon-phone" aria-hidden="true"></span>
					<span>Start Game</span>
				</petclinic:menuItem>
				</sec:authorize>
				
				<petclinic:menuItem active="${name eq 'rules'}" url="https://www.youtube.com/watch?v=5G-xi5QkCmo&ab_channel=JulenRedondo"
					title="Rules">
					<span class="glyphicon glyphicon-book" aria-hidden="true"></span>
					<span>Rules</span>
				</petclinic:menuItem>

			</ul>

			<ul class="nav navbar-nav navbar-right">
				<sec:authorize access="!isAuthenticated()">
					<li><a href="<c:url value="/login" />">Login</a></li>
					<li><a href="<c:url value="/users/new" />">Register</a></li>
				</sec:authorize>
				<sec:authorize access="isAuthenticated()">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <span class="glyphicon glyphicon-user"></span>
							<strong><sec:authentication property="name" /></strong> <span
							class="glyphicon glyphicon-chevron-down"></span>
					</a>
						<ul class="dropdown-menu">
							<li>
								<div class="navbar-login">
									<div class="row">
										<div class="col-lg-2">
										</div>
										<div class="col-lg-12">
											<p class="text-center">
												<span class="glyphicon glyphicon-user icon-size"></span>
												<strong><sec:authentication property="name" /></strong>
											</p>
											<br/>
											<p class="text-left">
												<sec:authorize access="hasAuthority('player')">
													<spring:url value="/players/myProfile" var="editUrl">                           		
	                        						</spring:url>
	    											<a href="${fn:escapeXml(editUrl)}" class="btn btn-primary btn-block">My Profile</a>
                    							</sec:authorize>
                    							<sec:authorize access="hasAuthority('player')">
                    								<spring:url value="/statistics" var="addUrl">
    												</spring:url>
    												<a href="${fn:escapeXml(addUrl)}" class="btn btn-warning btn-block">Get my Stats</a>
    											</sec:authorize>
    											
    											
    											
                    							<a href="<c:url value="/logout" />"
													class="btn btn-danger btn-block">Logout</a>
												
                    						<br/>
											</p>
										</div>
									</div>
								</div>
						
							
				</sec:authorize>
			</ul>
		</div>

	</div>
</nav>
