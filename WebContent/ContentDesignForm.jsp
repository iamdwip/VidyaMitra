<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

         <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
     <!-- Site Metas -->
    <title>VidyaMitra -Student Home</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="style.css">
    <!-- ALL VERSION CSS -->
    <link rel="stylesheet" href="css/versions.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/custom.css">

    <!-- Modernizer for Portfolio -->
    <script src="js/modernizer.js"></script>

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

        <body>
        <!-- Start header -->
			<header class="top-navbar">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="Login.jsp">
					<img src="images/logo.png" alt="" />
				</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbars-host" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
					<span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbars-host">
					<ul class="navbar-nav ml-auto">
						
						<li class="nav-item"><a class="nav-link" href="/VidyaMitra/TeacherHome">Home</a></li>
						
					</ul>
					<ul class="nav navbar-nav navbar-right">
                        <li><a class="hover-btn-new log orange" href="Login.jsp" data-toggle="modal" data-target="#login"><span>Log Out</span></a></li>
                    </ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->
<form action="SaveContent" method="get">
        
          <table>
          <tr>
            <td> <label style="font-size: 25px;"><b>Subject &nbsp;&nbsp;</b></label></td>
             <td><input type="text" id="subject" name="subject" value=""></td>
          </tr>
          
           <tr>
            <td> <label style="font-size: 25px;"><b>Topic&nbsp;&nbsp;</b></label></td>
            <td> <input type="text" id="topic" name="topic" value=""><br> </td>
          </tr>
          </table>
       
<span class="login100-form-title p-b-37">  </span>

<div class="container-login100" style="background-color:#FEF5E7;" align="center">
  <h3 align="center">Content Design:</h3>
  <div id='block-11' style='padding: 10px;'>
  <script type="text/javascript" src="http://js.nicedit.com/nicEdit-latest.js"></script> 
  <script type="text/javascript">
//<![CDATA[
        bkLib.onDomLoaded(function() { new nicEditor({fullPanel : true}).panelInstance('courseContent'); });
  //]]>
  
  </script>
  <textarea id="courseContent" name="courseContent" rows="25" cols="171">
  
  </textarea>
  </div>

  <input type='submit' style='width: 100px; height: 40px; border-radius: 3px; background-color: lightblue; font-weight: 700;' name="submit" value="Submit">
  
</div>
</form>
</body></html>
