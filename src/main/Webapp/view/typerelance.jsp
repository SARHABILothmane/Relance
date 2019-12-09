<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
     <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css" integrity="sha256-46qynGAkLSFpVbEBog43gvNhfrOj+BmwXdxFgVK/Kvc=" crossorigin="anonymous" />
    <title>Document</title>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
    <div class="container-fluid">
        
        <a class="navbar-brand" href="#">
            <img src="https://s3.eu-central-1.amazonaws.com/bootstrapbaymisc/blog/24_days_bootstrap/logo_white.png" width="30" height="30" alt="logo">
            Gestion Relance
        </a>

        <button class="navbar-toggler float-right" type="button" data-toggle="collapse" data-target="#navbar9">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse collapse" id="navbar9">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item"><a class="nav-link" href=""><i class="fas fa-bell"></i></a></li>
                <li class="nav-item"><a class="nav-link" href=""><i class="fas fa-envelope"></i></a></li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <img src="https://s3.eu-central-1.amazonaws.com/bootstrapbaymisc/blog/24_days_bootstrap/fox.jpg" width="25" height="25" class="rounded-circle">
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" href="#">Dashboard</a>
                        <a class="dropdown-item" href="#">Edit Profile</a>
                        <a class="dropdown-item" href="#">Log Out</a>
                    </div>
                </li> 
            </ul>
        </div>
    </div>
</nav> 
<div class="container-fluid">
    <div class="row">
    <div class="col-2 bg-dark navbar-dark">
        <ul class="nav flex-column">
        <li class="nav-item">
            <a class="nav-link active" href="#">Active</a>
        </li>
               <li class="nav-item">
            <button class="nav-link active" href="#">Client</button>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="index.jsp">Facture</a>
        </li>
        <li class="nav-item">
            <a class="nav-link disabled" href="#">Relance</a>
        </li>
        </ul>
    </div>
    <div class="col-10 p-4">
    
    <!-- form -->
<div class="container-fluid">
    <div class="row">
    <div class="col-2">
 <f:form  action="SaveTypeRelance" modelAttribute="t">
  <div class="form-group">
    <label for="exampleInputEmail1">label</label>
    <f:input path="label" type="text" class="form-control"  aria-describedby="emailHelp" placeholder="Enter votre nom" />
     <f:input path="id" type="hidden"  />
  </div>


  <button type="submit" class="btn btn-primary">Submit</button>
</f:form>
</div>
</div>
</div>
<!-- endform -->
              <!-- Start Section table -->
              <div class="row">
                <div class="col-12">
                    <table class="table table-striped">
                      <thead>
                        <tr>
                          <th scope="col">#</th>
                          <th scope="col">First</th>
                          <th scope="col">Last</th>
                          <th scope="col">Handle</th>
                        </tr>
                      </thead>
                           <tbody>
							<c:forEach  items="${ showAll }" var="showAll">
							             
							                        <tr>
							                          <td>${ showAll.id }</td>
							                          <td>${ showAll.label }</td>
							                        
							                          <td><form action="deleteTypeRelance/${showAll.id}"  method="post"><input type="submit" onclick="return confirm('Are you sure?')" value="Delete"/></form></td> 
							                          <td>
							                          
							                          <%--   <a href="deleteTypeRelance?id=${ showAll.id }" onclick="return confirm('Are you sure?')"> <button type="button" class="btn btn-danger"><i class="far fa-eye"></i></button></a> --%>
							                           <a href="afficheFrt?id=${ showAll.id }"> <button type="submit" class="btn btn-success"><i class="fas fa-alt"></i></button></a>
							                          <a href="updateTypeRelance?id=${ showAll.id }"><button type="button" class="btn btn-primary"><i class="far fa-eye"></i></button> </a>
							                          </td>
							                        </tr>
							 </c:forEach>  

                      </tbody>
                    </table>
                </div>
              </div>
              <!-- End Section table -->
   
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>