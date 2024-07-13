<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<!-- icon-->
<link rel="icon" type="image/x-icon" href="images/favicon.png" />
<title>Sign Up Form </title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">
<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
<style>
    .main{
        background: url('images/accueil bg.jpg') center center;
        background-size: cover;
</style>

</head>
<body>
 
	<div class="main">
<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
					
						<form method="get" action="SaveStagiaire" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="cin"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="CIN" id="cin" placeholder="Your CIN" />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="nom" id="name" placeholder="Your last name" />
							</div>
							<div class="form-group">
								<label for="prenom"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="prenom" id="prenom" placeholder="Your first name" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="dateN"><i class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="date" name="dateN" id="dateN" placeholder="Your date of birth" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pwd" id="pass" placeholder="Password" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							<div class="form-group">
								<label for="adress"><i class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="adress" id="adress" placeholder="Your adress" />
							</div>
							<div class="form-group">
								<label for="tel"><i class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="tel" name="tel" id="tel" placeholder="phone number" />
							</div>
							<div class="form-group">
								<label for="filiere"><i class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="filiere" id="filiere" placeholder="filiere" />
							</div>
							<div class="form-group">
								<label for="etablissement"><i class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="etablissement" id="etablissement" placeholder="etablissement" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/signup-image.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">I am already member</a>
						<a href="RegistrationAdmin.jsp" class="signup-image-link">I am not a Trainee</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>



</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>