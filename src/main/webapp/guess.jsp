<%--
  Created by IntelliJ IDEA.
  User: izzybella01
  Date: 4/4/22
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Guessing Game</title>
  </head>
  <body>
    <h1>Wanna play a game?</h1>
    <form action="/guess">
      <label for="userGuess">Enter a number between 1 and 3</label>
      <input type="text" id="userGuess" name="userGuess">
      <button>Submit</button>
    </form>
  </body>
</html>
