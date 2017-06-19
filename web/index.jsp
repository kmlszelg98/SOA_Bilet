<%--
  Created by IntelliJ IDEA.
  User: Kamil
  Date: 23.05.2017
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Bilety</title>
  </head>
  <body>
  <h2>Dodaj nowy bilet</h2>
  <form action="create" method="post">

      Numer rejestracyjny : <input type="text" name="numer">
      <br>
      Rodzaj biletu :
      <select name="rodzaj">
          <option>Ulgowy</option>
          <option selected="selected">Normalny<option>
      </select>
      <br>
      Ile czasu : <input type="text" name="czas">
      <br>
      Strefa :
      <select name="strefa">
          <option selected="selected">1<option>
          <option>2</option>
          <option>3</option>
      </select>
      <br>
      <input type="submit" value="Utworz">
  </form>
  </body>
</html>
