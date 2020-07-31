<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
     <!-- Site Metas -->
    <title>VidyaMitra -Design Your Quiz</title>  
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
	
<form method="get" action="quizdesign">
<div class="container-login100" style="background-image: url('images/bg-02.jpg');">
<fieldset><p></p>
<table>
<tr><td><label style="font-size: 25px;"><b>&nbsp;Subject&nbsp;&nbsp;</b></label></td><td> <input readonly type="text" name="Subject" value=<%=request.getParameter("Subject") %> ></td></tr>
<tr><td><label style="font-size: 25px;"><b>&nbsp;Topic&nbsp;&nbsp;</b></label></td><td> <input readonly type="text" name="Topic" value=<%=request.getParameter("Topic") %> ></td></tr>
</table>
</fieldset>
<div style="transform: scale(0.65); position: relative; top: -100px;">
<span class="login100-form-title p-b-37">
					  '
				</span>


<div id='block-11' style='padding: 10px;background-color: #A9CCE3;'>
<table>
<tr><td><label for='option-11' style=' padding: 5px; font-size: 3.5rem;'>Question:</label></td>
<td><input type="text" name="QBlock" size="80" style="font-size:25px;"></td></tr>
</table>
</div>
<hr />

<div id='block-11' style='padding: 10px; background-color: #A9CCE3;' align="center">
<label for='option-11' style=' padding: 5px; font-size: 2.5rem;'>Choices</label>
</div>
<hr />

<div id='block-11' style='padding: 10px;background-color: #A9CCE3;'>
<table>
<tr><td><label for='option-11' style=' padding: 5px; font-size: 2.5rem;'>a.</label></td>
<td><input type="text" name="QC1" style="font-size:25px;"></td></tr>
</table>
<span id='result-11'></span>
</div>
<hr />

<div id='block-11' style='padding: 10px;background-color: #A9CCE3;'>
<table>
<tr><td><label for='option-11' style=' padding: 5px; font-size: 2.5rem;'>b.</label></td><td>
<input type="text" name="QC2"style="font-size:25px;" >	</td></tr>
</table>
<span id='result-11'></span>
</div>
<hr />

<div id='block-11' style='padding: 10px;background-color: #A9CCE3;'>
<table>
<tr><td><label for='option-11' style=' padding: 5px; font-size: 2.5rem;'>c.</label></td><td>
<input type="text" name="QC3" style="font-size:25px;"></td></tr>
</table>
<span id='result-11'></span>
</div>
<hr />

<div id='block-11' style='padding: 10px;background-color: #A9CCE3;'>
<table>
<tr><td><label for='option-11' style=' padding: 5px; font-size: 2.5rem;'>Correct Answer </label></td><td>
<input type="text" name="key" style="font-size:25px;"></td></tr>
</table>
<span id='result-11'></span>
</div>
<hr />
<div id='block-11' style='padding: 10px;' align="center">
<input type="submit" style='font-size:25px; width: 180px; height: 50px; border-radius: 3px; background-color: lightblue; font-weight: 700;' name = "action" value="Add More">
<input type="submit" style='font-size:25px; width: 180px; height: 50px; border-radius: 3px; background-color: lightblue; font-weight: 700;' name = "action" value="Submit">
</div></div></div></form>
</body>
</html>