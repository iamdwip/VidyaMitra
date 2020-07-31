<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html lang="en">

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
<body class="host_version"> 

    <!-- LOADER -->
	<div id="preloader">
		<div class="loader-container">
			<div class="progress-br float shadow">
				<div class="progress__item"></div>
			</div>
		</div>
	</div>
	<!-- END LOADER -->	
	
	
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
						
						<li class="nav-item"><a class="nav-link" href="">Home</a></li>
						
					</ul>
					<ul class="nav navbar-nav navbar-right">
                        <li><a class="hover-btn-new log orange" href="/Login.jsp" data-toggle="modal" data-target="#login"><span>Log Out</span></a></li>
                    </ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->
	
	
	<div id="carouselExampleControls" class="carousel slide bs-slider box-slider" data-ride="carousel" data-pause="hover" data-interval="false" >
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleControls" data-slide-to="0" class="active"></li>
			<li data-target="#carouselExampleControls" data-slide-to="1"></li>
			<li data-target="#carouselExampleControls" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="carousel-item active">
				<div id="home" class="first-section" style="background-image:url('images/slider-01.jpg');">
					<div class="dtab">
						<div class="container">
							<div class="row">
								<div class="col-md-12 col-sm-12 text-right">
									<div class="big-tagline">
										<h2><strong>VidyaMitra </strong></h2>
										<p class="lead">Learn New Things. </p>
									</div>
								</div>
							</div><!-- end row -->            
						</div><!-- end container -->
					</div>
				</div><!-- end section -->
			</div>
			<div class="carousel-item">
				<div id="home" class="first-section" style="background-image:url('images/slider-02.jpg');">
					<div class="dtab">
						<div class="container">
							<div class="row">
								<div class="col-md-12 col-sm-12 text-left">
									<div class="big-tagline">
										<h2><strong>VidyaMitra </strong></h2>
										<p class="lead">Enhance your Knowledge. </p>
									</div>
								</div>
							</div><!-- end row -->            
						</div><!-- end container -->
					</div>
				</div><!-- end section -->
			</div>
			<div class="carousel-item">
				<div id="home" class="first-section" style="background-image:url('images/slider-03.jpg');">
					<div class="dtab">
						<div class="container">
							<div class="row">
								<div class="col-md-12 col-sm-12 text-center">
									<div class="big-tagline">
										<h2><strong>VidyaMitra </strong></h2>
										<p class="lead">Resolve your queries. </p>
									</div>
								</div>
							</div><!-- end row -->            
						</div><!-- end container -->
					</div>
				</div><!-- end section -->
			</div>
			<!-- Left Control -->
			<a class="new-effect carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
				<span class="fa fa-angle-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>

			<!-- Right Control -->
			<a class="new-effect carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
				<span class="fa fa-angle-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	
<form method="get" action="StudentFeatures">
    <div id="plan" class="section lb">
        <div class="container">
            <div class="section-title text-center">
                <h3>Student Home Page</h3>
                <p>Choose your function </p>
            </div><!-- end title -->

            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="message-box">
                        <ul class="nav nav-pills nav-stacked" id="myTabs">
                            
                            <li><a class="active" href="#tab1" data-toggle="pill" label for="course">Choose a course:</label> <select name="course" id="course">
                            <option value="">--Select--</option>
            <c:forEach items="${Courselist}" var="courses">
            <option value="${courses.subject}:${courses.topic}">${courses.subject}:${courses.topic}</option>
        </c:forEach>
                            </select> </a></li>
                            </ul>
                    </div>
                </div><!-- end col -->
            </div>

            <hr class="invis">

            <div class="row">
                <div class="col-md-12">
                    <div class="tab-content">
                        <div class="tab-pane active fade show" id="tab1">
                            <div class="row text-center">
                                <div class="col-md-4">
                                    <div class="pricing-table pricing-table-highlighted">
                                        <div class="pricing-table-header grd1">
                                            <h2>Download</h2>
                                            <h3>Study Material</h3>
                                        </div>
                                        <div class="pricing-table-space"></div>
                                        <div class="pricing-table-features">
                                            <p><i class="fa fa-database"></i> <strong>User Friendly</strong> Databases</p>
                                            <p><i class="fa fa-link"></i> <strong>Various</strong> Subjects</p>
                                            <p><i class="fa fa-life-ring"></i> <strong>24/7 Unlimited</strong> Access</p>
                                        </div>
                                        <div class="pricing-table-sign-up">
                                           
                                            <input type="submit" class="btn submit" value="Download" name="Submit">
                                            
                                        </div>
                                    </div>
                                </div>
                                
                                
                                <div class="col-md-4">
                                    <div class="pricing-table pricing-table-highlighted">
                                        <div class="pricing-table-header grd1">
                                            <h2>Take Up</h2>
                                            <h3>Your Quiz</h3>
                                        </div>
                                        <div class="pricing-table-space"></div>
                                        <div class="pricing-table-features">
                                            <p><i class="fa fa-database"></i> <strong>User Friendly</strong> Databases</p>
                                            <p><i class="fa fa-link"></i> <strong>Various</strong> Subjects</p>
                                            <p><i class="fa fa-life-ring"></i> <strong>24/7 Unlimited</strong> Access</p>
                                        </div>
                                        <div class="pricing-table-sign-up">
                                            <input type="submit" class="btn submit" value="Quiz" name="Submit">
                                        </div>
                                    </div>
                                </div>
<div class="col-md-4">
                                    <div class="pricing-table pricing-table-highlighted">
                                        <div class="pricing-table-header grd1">
                                            <h2>View Previous</h2>
                                            <h3>Result</h3>
                                        </div>
                                        <div class="pricing-table-space"></div>
                                        <div class="pricing-table-features">
                                            <p><i class="fa fa-database"></i> <strong>User Friendly</strong> Databases</p>
                                            <p><i class="fa fa-link"></i> <strong>Various</strong> Subjects</p>
                                            <p><i class="fa fa-life-ring"></i> <strong>24/7 Unlimited</strong> Access</p>
                                        </div>
                                        <div class="pricing-table-sign-up">
                                            <input type="submit" class="btn submit" value="Result" name="Submit">
                                        </div>
                                    </div>
                                </div>

                                
                            </div><!-- end row -->
                        </div><!-- end pane -->

                       
                    </div><!-- end content -->
                </div><!-- end col -->
            </div><!-- end row -->
        </div><!-- end container -->
    </div><!-- end section -->
</form>
   
    <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>
    
    
    
    <style>
.btn {
  border: none;
  background-color: inherit;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  display: inline-block;
}

.submit {
  color: green;
}

.submit:hover {
  background-color: #4CAF50;
  color: white;
}
</style>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>
	<script src="js/timeline.min.js"></script>
	<script>
		timeline(document.querySelectorAll('.timeline'), {
			forceVerticalMode: 700,
			mode: 'horizontal',
			verticalStartPosition: 'left',
			visibleItems: 4
		});
	</script>
</body>
</html>