<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="content-type" content="text/html; charset=utf-8">

<link
	href="<c:url value='bower_components/bootstrap/dist/css/bootstrap.min.css'/>"
	rel="stylesheet"></link>

<script src="<c:url value='bower_components/react/react.min.js'/>"></script>
<script src="<c:url value='bower_components/react/react-dom.min.js'/>"></script>
<script
	src="<c:url value='bower_components/jquery/dist/jquery.min.js'/>"></script>

<script
	src="<c:url value='bower_components/bootstrap/dist/js/bootstrap.min.js'/>"></script>

<%--Necessario per usare i file react in ambienti non nodeJs--%>
<script src="<c:url value='js/lib/babel/babel.min.js'/>" charset="utf-8"></script>


<title><sitemesh:write property='title' /></title>

<sitemesh:write property='head' />



</head>
<body>

	<sitemesh:write property='body' />
	</div>
</body>
</html>

