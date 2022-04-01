<%--
  Created by IntelliJ IDEA.
  User: izzybella01
  Date: 4/1/22
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Pick Color</title>
    </head>
    <body>
        <form method="POST" action="/pick-color">
            <label for="color">Please enter a color</label>
            <input type="text" id="color" name="color">
            <button>Submit</button>
        </form>
    </body>
</html>
