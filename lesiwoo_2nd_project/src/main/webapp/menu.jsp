<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-dark  bg-dark">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled">Disabled</a>
      </li>
    </ul>
    	<h3 class="text-white">
    		<%
    			response.setIntHeader("Refresh", 1);
    			Date day = new java.util.Date();
    			DecimalFormat df = new DecimalFormat("00");
    			String am_pm;
    			int hour = day.getHours();
    			int minute = day.getMinutes();
    			int second = day.getSeconds();
   				
    			
    			if(hour/12 == 0){
    				am_pm="오전";
    			}else{
    				am_pm="오후";
    				hour = hour-12;
    			}
    			
    			
    			// String currentTime=am_pm+" "+df.format(hour)+":"+df.format(minute)+":"+df.format(second)+" "+am_pm;
    			// out.println("현재 접속 시각: "+ currentTime+ "\n");
    			
    			String currentTime=am_pm+" "+((hour<10) ? "0" : "")+hour+":"+((minute<10) ? "0" : "")+minute+":"+ ((second<10) ? "0" : "")+ second+" "+am_pm;
    			out.println("현재 접속 시각: "+ currentTime+ "\n");
    		%>
    	</h3>
  		</div>
	</nav>
