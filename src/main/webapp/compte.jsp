<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil Chef DRH</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
    body {
    
        background-size: cover;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

header {
    background-color: #333;
    color: white;
    text-align: center;
    padding: 10px;
}

.content-container {
    display: flex;
    justify-content: space-between;
    margin: 20px;
}

.dashboard {
    width: 20%;
    background-color: #f4f4f4;
    padding: 20px;
}

.dashboard h2 {
    color: #333;
}

.dashboard ul {
    list-style-type: none;
    padding: 0;
}

.dashboard a {
    text-decoration: none;
    color: #007BFF;
    display: block;
    padding: 10px 0;
}

.dashboard a:hover {
    background-color: #ddd;
}

.description {
    width: 100%;
    padding: 5px;
}

.description h2 {
    color: #333;
}

.description p {
    line-height: 1.5;
    color: #666;
}
    </style>

<title>Stagiaire-Ligne</title>
<!-- icon-->
<link rel="icon" type="image/x-icon" href="images/favicon.png" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js"
	crossorigin="anonymous" type="text/javascript"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/index-styles.css" rel="stylesheet" />
<style>
    header.masthead {
        background: url('images/accueil bg.jpg') center center;
        background-size: cover;
</style>

</head>

<body id="page-top">
	<!-- Navigation-->
	<nav
		class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="#page-top" >Stagiaire-Ligne</a>
			<button
				class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded"
				type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="index.jsp">Home</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="acc_admin.jsp">My account</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="index.jsp">Log out</a></li>
					
				</ul>
			</div>
		</div>
	</nav>
	<!-- Masthead-->
	<header>
        <h1>Accueil Chef DRH</h1>
    </header>
<section>
    <div class="content-container">
        <aside class="dashboard">
            <h2>Tableau de Bord</h2>
            <ul>
                <li><a style="color:#000000" href="getCompte">Gestion des Comptes</a></li>
                <li><a href="getstagiaire">Gestion des Stagiaires</a></li>
                <li><a href="getStage">Gestion des Stages</a></li>
                <li><a href="getstatistique">Afficher les statistiques</a></li>
                <li><a href="emails"> Envoyer les emails</a></li>
                <li><a href="#">Marquer l’Absence</a></li>
                <li><a href="#">Imprimer les attestations</a></li>
                <!-- Ajoutez d'autres liens du tableau de bord -->
            </ul>
        </aside>

        <main class="description">
            <div class="container">
    <form method="get" action="deleteCompte" class="border">
      <h3>Gestion des comptes</h3>
     <table class="table">
     <tbody>
          <tr>
            <th>CIN</th>
            <th>Nom</th>
            <th>Prenom</th>
            <th>EMAIL</th>
            <th>ADRESSE</th>
             <th>TEL</th>
            <th>MOT DE PASSE</th>
            <th>DATE DE NAISSANCE</th>
            <th>ROLE</th>
            <th>SUPPRIMER</th>
          </tr>
          </tbody>
    <c:forEach items="${liste}" var="element">
    <c:set var="cin" value="${element.CIN}"/>
    <c:set var="nom" value="${element.nom}"/>
    <c:set var="prenom" value="${element.prenom}"/>
    <c:set var="email" value="${element.email}"/>
    <c:set var="adress" value="${element.adress}"/>
    <c:set var="tel" value="${element.tel}"/>
    <c:set var="pass" value="${element.motPasse}"/>
    <c:set var="dateN" value="${element.dateN}"/>
    <c:set var="role" value="${element.role}"/>
        <tbody>
          <tr>
            <td><c:out value="${CIN}"/></td>
            <td><c:out value="${nom}"/></td>
            <td><c:out value="${prenom}"/></td>
            <td><c:out value="${email}"/></td>
            <td><c:out value="${adress}"/></td>
            <td><c:out value="${tel}"/></td>
            <td><c:out value="${pass}"/></td>
            <td><c:out value="${dateN}"/></td>
             <td><c:out value="${role}"/></td>
            <td><button name="supprimer" value="${CIN}" class="btn btn-danger">supprimer</button></td>
          </tr>
          </tbody>
        </c:forEach>
      </table>
     </form>
     
     <button name="ajouter"  class="btn btn-danger"><a style="color: #000000" href="regostrationAdmin.jsp" class="signup-image-link">Ajouter compte</a></button>
    </div>
        </main>
    </div>
</section>
	<!-- Footer-->
	<footer class="footer text-center">
		<div class="container">
			<div class="row">
				<!-- Footer Location-->
				<div class="col-lg-4 mb-5 mb-lg-0">
					<h4 class="text-uppercase mb-4">Location</h4>
					<p class="lead mb-0">
						2215 El fateh ,Khouribga Maroc  <br /> Mouna, MO 65243
					</p>
				</div>
				
				<!-- Footer Social Icons-->
				<div class="col-lg-4 mb-5 mb-lg-0">
					<h4 class="text-uppercase mb-4">Around the Web</h4>
					<a class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-facebook-f"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-twitter"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-linkedin-in"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-dribbble"></i></a>
				</div>
				<!-- Footer About Text-->
				<div class="col-lg-4">
					<h4 class="text-uppercase mb-4">About Stagiaire-Ligne</h4>
					<p class="lead mb-0">
						Stagiaire-Ligne is an application offers statistical insights into
						 the number of current interns, ongoing stages, and active supervisors
						  in different departments.
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- Copyright Section-->
	<div class="copyright py-4 text-center text-white">
		<div class="container">
			<small>Copyright &copy; Your Website GI  2024</small>
		</div>
	</div>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
	<!-- * *                               SB Forms JS                               * *-->
	<!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
	<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>

