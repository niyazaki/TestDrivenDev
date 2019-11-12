# Pokemon Project
A Test Driven Developpement application (I4020)

## Description
Cette application a pour objectif de simuler un simple combat entre deux Pokémons possédant leurs propres statistiques et type.

## Diagramme de classe
Basée sur le modèle Builder (design pattern) l'application permettra de créer deux instances de Pokémons possédant un nom, des statistiques particulières (points de vie, puissance d'attaque, défense, vitesse) et un type afin de les faire combattre ensembles.

![Class Diagram](https://zupimages.net/up/19/41/plx6.png)

Nous prendrons en compte uniquement les Pokémons de la première génération (il n'y aura donc que 15 types différents). Nous avons choisi ce design pattern afin d'éviter la répétition du code très proche entre les différents types.
> Nous considérons que les Pokémons n'ont aucune capacité particulière (ex: lance-flammes), le nombre de points de vie perdu est uniquement basé sur les statistiques et le type du Pokémon

Le TypeBuilder contient une hashmap contenant toutes les informations du tableau suivant :
![Table des types de la première génération de Pokémons](https://zupimages.net/up/19/41/dsch.png)

Lorsque l'on souhaite créer un Pokémon d'un certain type (Combat par exemple) TypeBuilder créera le type en se contentant de donner une liste reprenant les forces de l'élément (lorsque l'élément est avantagé, exemple le type Roche) ses faiblesses (le type Vol par exemple) seront elles aussi stockées dans une liste et enfin, les types qui sont immunisés contre lui (Spectre dans ce cas-ci).

## Déroulement
L'utilisateur entrerait les différentes statistiques de son Pokémon ainsi que son nom et son type. Ce dernier influencera le nombre de points de vie perdus d'un certain facteur (0;1/2;1 ou 2).
La classe Fight s'occupera de calculer l'issue du combat entre deux Pokémons. Dans celle-ci on retrouve deux méthodes : Attack() et Winner().

La première se contente de déterminer le nombre de points de vie perdus au terme d'une attaque unique (le Pokémon attaquant en premier est celui possédant la plus grande vitesse). Quant à la seconde elle fait une succession d'Attack afin de faire diminuer le nombre de points de vie des deux Pokémons jusqu'à ce que l'un des deux tombe K.O (points de vie restants nuls).

## Critères de qualité
### Évolutivité
Le jeu Pokémon et son univers continuent encore à ce jour de grandir et d'évoluer, il est donc important pour nous, afin de rester fidèle à cette réalité, que notre programme puisse également évoluer en permettant d'ajouter facilement de nouveaux types ou de nouvelles statistiques. Il doit également être facile de pouvoir créer de nouveaux Pokémons personnalisés.
 
### Facilité d'utilisation
Il est également important que l'application soit simple d'emploi, ergonomique.

### Efficacité
Elle doit être rapide et demander peu de performances. Si cela devait être implémenté dans un vrai jeu Pokémon, personne n'aimerait que chaque attaque prenne énormément de temps à s'effectuer.

### Maintenabilité
Etant vouée à évoluer, il faut nécessairement qu'elle soit simple à maintenir et facile à comprendre afin de pouvoir y ajouter rapidement de nouvelles fonctionnalités et s'assurer que celles déjà présentes fonctionnent encore.

## Mesures sur les critères de qualité
### Évolutivité
Grâce au design pattern Builder, il nous est possible de créer différents éléments distincts qui, à la manière de Legos, s’emboîteraient d'une certaine façon ou d'une autre afin d'obtenir un nouveau résultat. Cette versatilité est très pratique lorsque l'on sait que Pokémon est un jeu changeant ajoutant de nouvelles façon de jouer basées sur des choses préexistantes (comme par exemple le combat à 3 joueurs basé sur le combat en 1 contre 1).

### Facilité d'utilisation
Bien que ce soit un critère assez subjectif, le programme est relativement simple étant donné qu'il réside en quelques aspects : créer deux Pokémons concrets et chercher le vainqueur parmi eux avec la méthode Winner.  

### Efficacité
Afin de s'assurer de l'efficacité du code nous avons testé la vitesse à laquelle on obtenait le gagnant d'un combat entre deux Pokémons. Le temps nécessaire pour obtenir un winner est de 0.422ms.

### Maintenabilité
La mesure de la maintenabilité n'est pas évidente, il existe bel et bien le MI (Maintainability Index) mais nous n'avons pas réussi à quantifier ce critère de qualité.

## Tests JUnits
Afin de s'assurer du bon fonctionnement de notre code nous avons :
- créé deux Pokémons et appelé la fonction Attack. La fonction Attack permet de réduire la vie des deux Pokémons. Donc le but était de vérifier que nous avons le bon nombre de "hp" (points de vie) et la fonction réalisait bien ce qui était demandé.

- réalisé un test sur la fonction Winner. Deux Pokémons ont combattu ensembles, sachant le gagnant, nous avons regardé si la fonction renvoyait bien le bon Pokémon. Le test s'est également bien déroulé.

## Exécution du programme
Afin d'executer le programme, nous créons dans la fonction Main autant de Pokémons que l'on souhaite, avec la classe ConcretePokemon. Dans le constructeur de ConcretePokemon, on indique le nom, le type et les statistique (santé, attaque, défense ...) du Pokemon.
On fait ensuite combattre deux Pokémons en appelant la méthode Winner de la classe Fight. Un string est renvoyé avec le nom du gagnant.

## Equipe
Kassabeh Zakariya 16131
El Haddadi Yassine 16146
El Bakkoury Yassine 16050

## Contraintes
Le programme utilisé est IntelliJ.
