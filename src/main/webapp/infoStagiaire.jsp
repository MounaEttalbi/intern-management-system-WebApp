<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Informations</title>

    <!-- Ajouter le lien vers la feuille de style Bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

    <!-- Vous pouvez également utiliser une feuille de style locale -->
    <!-- <link rel="stylesheet" href="chemin/vers/votre/fichier/bootstrap.min.css"> -->
</head>
<body class="container mt-5">
    <h1>Vos Informations</h1>
    <ul class="list-group">
        <li class="list-group-item">Votre CIN est : <strong>${CIN}</strong></li>
        <li class="list-group-item">Votre Nom est : <strong>${nom}</strong></li>
        <li class="list-group-item">Votre Prenom est : <strong>${prenom}</strong></li>
        <li class="list-group-item">Votre Email est : <strong>${email}</strong></li>
        <li class="list-group-item">Votre Etablissement est : <strong>${etablissement}</strong></li>
        <li class="list-group-item">Votre filiere est : <strong>${filiere}</strong></li>
        <li class="list-group-item">Votre Adresse est : <strong>${adresse}</strong></li>
        <li class="list-group-item">Votre date de naissance est : <strong>${nais}</strong></li>
        <li class="list-group-item">Votre numéro de téléphone est : <strong>${phone}</strong></li>
        <li class="list-group-item">Votre Mot de passe est : <strong>${phone}</strong></li>
    </ul>

    <!-- Ajouter les scripts Bootstrap (facultatif) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
