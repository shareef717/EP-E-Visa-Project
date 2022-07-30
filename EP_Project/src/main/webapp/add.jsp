<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<Html>  
<head>   
<title>  
Application Page  
</title>  
</head> 
<center><h2>E-VISA APPLICATION FORM</h2></center>
<center>
<img src="https://www.dailypioneer.com/uploads/2018/story/images/big/thailand-launches-e-visa-on-arrival-for-visitors-2018-11-21.jpg" style="width:20%">
</center>
<body bgcolor="lightPink">  
<br>  
<br>  
<form>  
  
<label> Firstname </label>         
<input type="text" name="firstname" size="15"/> <br> <br>  
<label> Middlename: </label>     
<input type="text" name="middlename" size="15"/> <br> <br>  
<label> Lastname: </label>         
<input type="text" name="lastname" size="15"/> <br> <br>  

<label> Nationality: </label>         
<input type="text" name="nationality" size="15"/> <br> <br>  

<label> passportNumber: </label>         
<input type="text" name="passportnumber" size="15"/> <br> <br>  
  
<label>   
Nationality :  
</label>   
<select>  
<option value="Nationality">Nationality</option>  
<option value="Indian">Indian</option>  
<option value="African">African</option>  
<option value="America">America</option>  
<option value="Japan">Japan</option>  
<option value="Russain">Russain</option>  
<option value="Austria">Austria</option>  
</select>  
  
<br>  
<br>  
<label>   
Gender :  
</label><br>  
<input type="radio" name="male"/> Male <br>  
<input type="radio" name="female"/> Female <br>  
<input type="radio" name="other"/> Other  
<br>  
<br>  
  
<label>   
Phone :  
</label>  
<input type="text" name="country code"  value="+91" size="2"/>   
<input type="text" name="phone" size="10"/> <br> <br>  
Address  
<br>  
<textarea cols="80" rows="5" value="address">  
</textarea>  
<br> <br>  
Email:  
<input type="email" id="email" name="email"/> <br>    
<br> <br>  
Password:  
<input type="Password" id="pass" name="pass"> <br>   
<br> <br>  
Re-type password:  
<input type="Password" id="repass" name="repass"> <br> <br>  
<input type="button" value="Apply"/>  


</form>  
</body>  
</html>  