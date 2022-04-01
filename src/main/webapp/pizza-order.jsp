<%--
  Created by IntelliJ IDEA.
  User: izzybella01
  Date: 4/1/22
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1>Pizza Form</h1>
    <form method="POST" action="/pizza-order">
        <label for="size">Choose a size: </label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="x-large">X-large</option>
        </select>
        <br>

        <label for="crust">Choose a crust: </label>
        <select name="crust" id="crust">
            <option value="hand-tossed">Hand-Tossed</option>
            <option value="pan">Pan</option>
            <option value="thin">Thin</option>
        </select>
        <br>

        <label for="sauce">Choose a sauce: </label>
        <select name="sauce" id="sauce">
            <option value="marinara">Marinara</option>
            <option value="alfredo">Alfredo</option>
            <option value="tomato-basil">Tomato Basil</option>
            <option value="red-pepper">Crushed Red Pepper</option>
        </select>
        <br>

        <label for="sauce">Choose toppings: </label>
        <br>
        <input type="checkbox" id="topping" name="choice" value="pepperoni">
        <label for="topping">Pepperoni</label><br>
        <input type="checkbox" id="topping2" name="choice" value="bacon">
        <label for="topping2">Bacon</label><br>
        <input type="checkbox" id="topping3" name="choice" value="ham">
        <label for="topping3">Ham</label>
        <br>

        <label for="delivery">Delivery Address:</label>
        <input type="text" id="delivery" name="delivery"><br>
        <button>Place Order</button>
    </form>

</body>
</html>
