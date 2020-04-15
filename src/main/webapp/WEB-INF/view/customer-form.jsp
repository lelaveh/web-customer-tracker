<%--
  Created by IntelliJ IDEA.
  User: Амир
  Date: 07.04.2020
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Save customer</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2> Customer relationship manager </h2>
    </div>
</div>

<div id="container">
    <h3>Save customer</h3>
    <form:form action="saveCustomer" modelAttribute="customer" method="post">
        <form:hidden path="id"/>
        <td><label>First name:</label></td>
        <td><form:input path="firstName"/></td>
        <br/>
        <td><label>Last name:</label></td>
        <td><form:input path="lastName"/></td>
        <br/>
        <td><label>Email:     </label></td>
        <td><form:input path="email"/></td>
        <br/> <br/>
        <button type="submit"> Save </button>
    </form:form>
    <a href="list">Return to the main page</a>
</div>

</body>
</html>
