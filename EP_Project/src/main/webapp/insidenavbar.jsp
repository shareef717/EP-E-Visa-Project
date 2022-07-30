<!DOCTYPE html>
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: pink;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 50px;
  text-align: center;
  background-color: #474e5d;
  color: pink;
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}
.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: pink;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}
</style>
</head>
<body>

<ul>
  <li><a href="add.jsp">E-Visa </li>
  <li><a href="coord.jsp">Add Visa</a></li>
  <li><a href="class.jsp">Add Person Details</a></li>
  <li><a href="time.jsp">Visa Store</a></li>
  <li><a href ="co.jsp"></a>
  <li><a href ="enroll.jsp">No of Visa Sold </a>
  <li><a href ="out.jsp">LOGOUT</a>
</ul>
<div class="column">
    <div class="card">
      <img src="https://th.bing.com/th/id/OIP.wvqsPBc1jCfPynyKpnvjyQHaE9?pid=ImgDet&rs=1" alt="Mike" style="width:30%">
      <div class="container">
        <h2>45</h2>
        <p class="title">PRV</p>
        
        <p>PRV.com</p>
        <p href="Apply.jsp"><button class="button">Apply<button></p>
      </div>
    </div>
  </div>
  
  
 <div class="column">
    <div class="card">
      <img src="https://www.wonderfulpackage.com/uploads/article/Non-O_Eng.jpg?v=59" alt="Mike" style="width:30%">
      <div class="container">
        <h2>oo</h2>
        <p class="title">Non-Migration Visa</p>
        <p>NMV</p>
        <p>NMigration.com</p>
         <p href="Apply.jsp"><button class="button">Apply<button></p>
      </div>
    </div>
  </div>
  
  
  <div class="column">
    <div class="card">
      <img src="https://www.willflyforfood.net/wp-content/uploads/2016/11/us-visa.jpg" style="width:30%">
      <div class="container">
        <h2>TV</h2>
        <p class="title">Tourist Visa</p>
        <p>Discount Available</p>
        <p>TouristVisa.com</p>
        <p href="Apply.jsp"><button class="button">Apply<button></p>
      </div>
    </div>
  </div>
  
  
  <div class="column">
    <div class="card">
      <img src="https://legalservicesincorporated.com/wp-content/uploads/2020/03/visa-eb5.jpg" alt="Mike" style="width:30%">
      <div class="container">
        <h2>:</h2>
        <p class="title">EB-5 Visa</p>
       
        <p>EB-5cVisa.com</p>
        <p href="Apply.jsp"><button class="button">Apply<button></p>
      </div>
    </div>
  </div>
  <div class="column">
    <div class="card">
      <img src="https://th.bing.com/th/id/OIP.Xq3x2e3GiUBPeN4EcpLxxAHaDg?pid=ImgDet&rs=1" alt="Mike" style="width:30%">
      <div class="container">
        <h2>:)</h2>
        <p class="title">E2 Visa</p>
        
        <p>E2 Visa.com</p>
        <p href="Apply.jsp"><button class="button">Apply<button></p>
    
      
  
</body>
</html>


