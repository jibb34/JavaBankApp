<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Student List</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
    <h2>List of Students</h2>
    <table border="1">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Postal Address</th>
        <th>Email</th>
        <th>Telephone</th>
      </tr>
      <c:forEach var="student" items="${students}">
        <tr>
          <td>${student.id}</td>
          <td>${student.name}</td>
          <td>${student.postalAddress}</td>
          <td>${student.email}</td>
          <td>${student.telephone}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
