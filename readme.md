# projet IDM
 

## Installation
Ce projet fonctionne sous Eclipse DSL developer. 

1 - Télécharger le projet.
2 - Ouvrir Eclispse, aller dans File > switch workspace > choisir le dossier ou se trouve le projet.
3 - Ajouter au build path du projet les libraries jackson contenues dans le dossier **IDM_Project_jar**.

Vous pouvez executer les tests dans : 
IDMProject\org.xtext.idmProject.tests\src\org\xtext\idmProject\tests
en cliquant sur IDMProjectParsingTest.xtend faites "Run as Junit Tests"

## Modèle

Vous trouverez le diagramme de classe qui décrit le méta-modèle du projet dans IDMProject\img\projectJson class diagram.jpg 
Il a été produit grâce à l'éditeur de diagramme fourni par l'IDE et qui se base sur notre  grammaire écrite en Xtext.

Nous avons aussi proposé un modèle de l'opération "print" ici :
IDMProject\img\model_print.png


## Description des tests

Le détail des tests se trouve ici : IDMProject\org.xtext.idmProject.tests\progs
Il y a 8 fichiers qui contiennent les commandes de chaque test. Chaque fichier à pour but de tester une opération particulière : load, print, store, insert, select etc.
