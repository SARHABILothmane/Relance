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

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css" integrity="sha256-46qynGAkLSFpVbEBog43gvNhfrOj+BmwXdxFgVK/Kvc=" crossorigin="anonymous" /> 
   <!--  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css" integrity="sha256-46qynGAkLSFpVbEBog43gvNhfrOj+BmwXdxFgVK/Kvc=" crossorigin="anonymous" /> -->
    <title>Spring</title>
</head>

<body> 
<!-- form -->
<div class="container-fluid">
    <div class="row">
    <div class="col-2">
 <f:form  action="SaveClt" modelAttribute="c">
  <div class="form-group">
    <label for="exampleInputEmail1">adresse</label>
    <f:input path="adresse" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter votre nom" />
     <f:input path="id" type="hidden"  />
 
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">email</label>
    <f:input path="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter votre prenom" />
    
  </div>
   <div class="form-group">
    <label for="exampleInputEmail1">numero telephone</label>
    <f:input path="num_tele" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter votre age"/>

  </div>
     <div class="form-group">
    <label for="exampleInputEmail1">raison sociale</label>
    <f:input path="raison_sociale" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter votre age"/>

  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</f:form>
</div>
</div>
</div>
<!-- endform -->
   
      


              <!-- End section statistiques -->
              <!-- Start Section Search -->
              <div class="row p-4 alert alert-dismissible alert-warning">
                <div class="col-12">
               
                </div>
              </div>
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
							                          <td>${ showAll.adresse }</td>
							                          <td>${ showAll.email}</td>
							                          <td>${ showAll.num_tele }</td>
							                          <td><form action="delete/${showAll.id}"  method="post"><input type="submit" onclick="return confirm('Are you sure?')" value="Delete"/></form></td> 
							                          <td>
							                          
							                            <%--<a href="delete?id=${ showAll.id }" onclick="return confirm('Are you sure?')"> <button type="button" class="btn btn-danger"><i class="far fa-eye"></i></button></a>--%>
							                           <a href="afficheFrt?id=${ showAll.id }"> <button type="submit" class="btn btn-success"><i class="fas fa-alt"></i></button></a>
							                          <a href="updateClt?id=${ showAll.id }"><button type="button" class="btn btn-primary"><i class="far fa-eye"></i></button> </a>
							                          </td>
							                        </tr>

							 </c:forEach> 
              
                      </tbody>
                    </table>
                </div>
              </div>
              <!-- End Section table -->
    
            </div>
          </div>
        </div>

<!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> -->
</body>
</html>