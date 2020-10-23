
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Java Boss</title>
</head>
<body>
  <h1>Scegli un colore</h1>
  <hr>
  <form action="postColor" method="post">
  <label for="cars">Choose a color:</label>
  <select name="color" id="color">
      <option value="rosso">rosso</option>
      <option value="verde">verde</option>
  </select>
  <br><br>
  <input type="submit" value="Submit">
</form>
 
</body>
</html>