<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>

<script src="<c:url value='bower_components/toastr/toastr.min.js'/>"></script>


<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/2.1.3/toastr.min.css">
<title>User</title>

</head>
<body>
	<div id="root"></div>
	<script type="text/babel" src="<c:url value='js/react/popup.js'/>"></script>
</body>
</html>