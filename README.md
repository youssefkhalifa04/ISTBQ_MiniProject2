
# 🧪 Mini-Projet Java : Méthode `exist(int, String[])`

Ce dépôt contient un mini-projet Java qui implémente la méthode `exist(int, String[])`. Cette méthode vérifie si un entier donné existe dans un tableau de chaînes de caractères, en gérant les cas d'entrées invalides de manière sécurisée. Le projet inclut également des tests unitaires JUnit 5 pour valider différents scénarios.

## 📄 Description

La méthode `exist(int, String[])` prend en paramètres un entier et un tableau de chaînes de caractères. Elle retourne `true` si l'entier est présent dans le tableau (après conversion des chaînes en entiers), et `false` sinon. Les chaînes non convertibles en entiers sont ignorées sans provoquer d'erreurs.

## 🧪 Tests unitaires

Le projet utilise JUnit 5 pour tester la méthode `exist` dans divers cas :

- **Correspondance valide** : L'entier est présent dans le tableau.
- **Chaînes non numériques** : Le tableau contient des chaînes qui ne peuvent pas être converties en entiers.
- **Tableau vide** : Le tableau ne contient aucun élément.
- **Aucune correspondance** : L'entier n'est pas présent dans le tableau.

## 🛠️ Technologies utilisées

- Java
- JUnit 5
- Maven (pour la gestion des dépendances et la compilation)

## 📁 Structure du projet

```
.
├── .idea/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── [paquetage]/Exist.java
│   └── test/
│       └── java/
│           └── [paquetage]/ExistTest.java
├── pom.xml
└── README.md
```

*Remplacez `[paquetage]` par le nom réel du paquetage utilisé dans votre projet.*

## ⚙️ Installation et exécution

1. **Cloner le dépôt** :

   ```bash
   git clone https://github.com/youssefkhalifa04/ISTBQ_MiniProject2.git
   cd ISTBQ_MiniProject2
   ```

2. **Compiler le projet avec Maven** :

   ```bash
   mvn compile
   ```

3. **Exécuter les tests unitaires** :

   ```bash
   mvn test
   ```

## 📄 Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus d'informations.

---

*Note : N'oubliez pas de remplacer les sections entre crochets par les informations spécifiques à votre projet, telles que le nom du paquetage.*
``` 
