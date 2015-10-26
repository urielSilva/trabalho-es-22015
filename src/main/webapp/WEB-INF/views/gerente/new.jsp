<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<c:import url="../templates/header.jsp" />
<div class="container">
	<h3>Novo Gerente</h3>
	
	<sf:form class="form-horizontal" modelAttribute="gerente" action="createManager">
			
		<div class="row form-group">
		    <label class="control-label">Matrícula:</label>
		    <div class="col-md-6">	
		    	<sf:input class="form-control" path="matricula"/>
		    </div>
	    </div>
	    <div class="row form-group">
		    <label class="control-label">Senha:</label>
		    <div class="col-md-6">
		    	<sf:password class="form-control" path="senha"/>
		    </div>
	    </div>
	    
	    <div class="row form-group">
	    	<input class="btn btn-primary" type="submit" value="Cadastrar!"/>
	    </div>
	    
	</sf:form>

	</div>


<c:import url="../templates/footer.jsp"></c:import>
</html>