<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

 


    <div align="center">
        <form:form action="./login" method="Post" modelAttribute="user">
            <style type="text/css">
.error {
    color: red
}

 

form { 
        border: 3px solid #f1f1f1; 
    }
     
    input[type=text], 
    input[type=password] { 
        width: 50%; 
        padding: 12px 20px; 
        margin: 8px 0; 
        display: inline-block; 
        border: 1px solid #ccc; 
        box-sizing: border-box; 
    } 
    
    button { 
        background-color: #4CAF50; 
        color: white; 
        padding: 14px 20px; 
        margin: 8px 0; 
        border: none; 
        cursor: pointer; 
        width: 100%; 
    } 
    
    button:hover { 
        opacity: 0.8; 
    } 
    
    .cancelbtn { 
        width: auto; 
        padding: 10px 18px; 
        background-color: #f44336; 
    } 
    
    .imgcontainer { 
        text-align: center; 
        margin: 24px 0 12px 0; 
    } 
    /*set image properties*/ 
      
    img.avatar { 
        width: 10%; 
        border-radius: 50%; 
    } 
    /*set padding to the container*/ 
      
    .container { 
        padding: 16px; 
    } 
    /*set the forgot password text*/ 
      
    span.psw { 
        float: right; 
        padding-top: 16px; 
        }
        
        @media screen and (max-width: 300px) { 
        span.psw { 
            display: block; 
            float: none; 
        } 
        .cancelbtn { 
            width: 100%; 
        } 
    } 

 

</style>

 

<h2>Login Form</h2>

 

<div class="imgcontainer">
<img src="https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2Foriginals%2F92%2F63%2Fc5%2F9263c5215f06b2d85d3b01be971d73d1.png&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F313492824061506374%2F&tbnid=tQryjXDXt0SBFM&vet=12ahUKEwjwjaqPp8DtAhXhnUsFHZJSCi4QMygBegUIARCwAQ..i&docid=gGiIfc7aCRvO1M&w=800&h=600&q=pet%20app%20logo&ved=2ahUKEwjwjaqPp8DtAhXhnUsFHZJSCi4QMygBegUIARCwAQ" alt="Avatar" class="avatar">
</div>

 <h3 style="color: red">${errorMessage}</h3>

            <label for="username" class="field">Enter the userName:<span
                class="mandatory">*</span>
            </label>
            
            <form:input path="userName" />
            <br>
            
            <label for="password" class="field">Enter the password:<span
                class="mandatory">*</span>
            </label>
            
            <form:password path="password" />
            <form:errors path="password" cssClass="error"></form:errors>
            <br>
            
            <input type="submit" id="button1" value="Login">
            
            <input type ="reset" id="button1" value="reset">

 

        </form:form>
        
        <div class="container" style="background-color:#f1f1f1"> 
            
            <span class="psw">Forgot <a href="#">password?</a></span> 
        </div> 

 

    </div>

 

</body>
</html>