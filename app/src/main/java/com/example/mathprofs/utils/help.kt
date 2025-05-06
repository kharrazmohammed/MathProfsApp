package com.example.mathprofs.utils

import com.example.mathprofs.models.Exercice
import com.example.mathprofs.models.Fiche
import com.example.mathprofs.models.activite

class help {
    val toutesLesFiches = listOf(
        // 1AC
        Fiche("Cercle et disque", "1AC", "1AC/pdf/Cercle_et_disque.pdf", "1AC/word/Cercle_et_disque.docx"),
        Fiche("Deux Parallèles et une Sécante", "1AC", "1AC/pdf/Deux_Parallèles_et_une_Secante.pdf", "1AC/word/Deux_Parallèles_et_une_Secante.docx"),
        Fiche("Développement et Factorisation", "1AC", "1AC/pdf/Developpement_et_Factorisation.pdf", "1AC/word/Developpement_et_Factorisation.docx"),
        Fiche("Droites dans le Plan", "1AC", "1AC/pdf/Droites_dans_le_Plan.pdf", "1AC/word/Droites_dans_le_Plan.docx"),
        Fiche("Droites Remarquables d’un Triangle", "1AC", "1AC/pdf/Droites_Remarquables_dun_Triangle.pdf", "1AC/word/Droites_Remarquables_dun_Triangle.docx"),
        Fiche("Droite Graduée - Repère dans le Plan", "1AC", "1AC/pdf/Droite_Graduee_-_Repère_dans_le_Plan.pdf", "1AC/word/Droite_Graduee_-_Repère_dans_le_Plan.docx"),
        Fiche("Les Angles et le Triangle", "1AC", "1AC/pdf/Les_Angles_et_Le_triangle.pdf", "1AC/word/Les_Angles_et_Le_triangle.docx"),
        Fiche("Les Équations", "1AC", "1AC/pdf/Les_Equations.pdf", "1AC/word/Les_Equations.docx"),
        Fiche("Les Fractions", "1AC", "1AC/pdf/Les_Fractions.pdf", "1AC/word/Les_Fractions.docx"),
        Fiche("Les Nombres Relatifs", "1AC", "1AC/pdf/Les_Nombres_Relatifs.pdf", "1AC/word/Les_Nombres_Relatifs.docx"),
        Fiche("Opérations sur les Nombres Décimaux Relatifs", "1AC", "1AC/pdf/Operations_sur_les_Nombres_Decimaux_Relatifs.pdf", "1AC/word/Operations_sur_les_Nombres_Decimaux_Relatifs.docx"),
        Fiche("Opérations sur les Nombres Entiers et Décimaux - Priorités", "1AC", "1AC/pdf/Operations_sur_les_Nombres_Entiers_et_Decimaux_-_Priorites.pdf", "1AC/word/Operations_sur_les_Nombres_Entiers_et_Decimaux_-_Priorites.docx"),
        Fiche("Parallélogramme", "1AC", "1AC/pdf/Parallelogramme.pdf", "1AC/word/Parallelogramme.docx"),
        Fiche("Périmètre et Aire", "1AC", "1AC/pdf/Perimètre_et_Aire.pdf", "1AC/word/Perimètre_et_Aire.docx"),
        Fiche("Prisme et cylindre", "1AC", "1AC/pdf/Prisme_et_cylindre.pdf", "1AC/word/Prisme_et_cylindre.docx"),
        Fiche("Proportionnalité", "1AC", "1AC/pdf/Proportionnalite.pdf", "1AC/word/Proportionnalite.docx"),
        Fiche("Puissance d’un Nombre Relatif", "1AC", "1AC/pdf/Puissance_d'un_Nombre_Relatif.pdf", "1AC/word/Puissance_d'un_Nombre_Relatif.docx"),
        Fiche("Quadrilatères Particuliers", "1AC", "1AC/pdf/Quadrilatères_Particuliers.pdf", "1AC/word/Quadrilatères_Particuliers.docx"),
        Fiche("Statistiques", "1AC", "1AC/pdf/Statistiques.pdf", "1AC/word/Statistiques.docx"),
        Fiche("Symétrie Centrale", "1AC", "1AC/pdf/Symetrie_Centrale.pdf", "1AC/word/Symetrie_Centrale.docx"),

        // 2AC
        Fiche("Calcul Littéral", "2AC", "2AC/pdf/Calcul_Litteral.pdf", "2AC/word/Calcul_Litteral.docx"),
        Fiche("Droites Remarquables dans les Triangles", "2AC", "2AC/pdf/Droites_Remarquables_dans_les_Triangles.pdf", "2AC/word/Droites_Remarquables_dans_les_Triangles.docx"),
        Fiche("L'Ordre et Opérations", "2AC", "2AC/pdf/L'Ordre_et_Operations.pdf", "2AC/word/L'Ordre_et_Operations.docx"),
        Fiche("Les Équations", "2AC", "2AC/pdf/Les_Equations.pdf", "2AC/word/Les_Equations.docx"),
        Fiche("Les Nombres Rationnels", "2AC", "2AC/pdf/Les_Nombres_Rationnels.pdf", "2AC/word/Les_Nombres_Rationnels.docx"),
        Fiche("Les Nombres Relatifs", "2AC", "2AC/pdf/Les_Nombres_Relatifs.pdf", "2AC/word/Les_Nombres_Relatifs.docx"),
        Fiche("Proportionnalité", "2AC", "2AC/pdf/Proportionnalite.pdf", "2AC/word/Proportionnalite.docx"),
        Fiche("Puissances des Nombres Rationnels", "2AC", "2AC/pdf/Puissances_des_Nombres_Rationnels.pdf", "2AC/word/Puissances_des_Nombres_Rationnels.docx"),
        Fiche("Pyramides et Cônes de Révolution", "2AC", "2AC/pdf/Pyramides_et_Cônes_de_Revolution.pdf", "2AC/word/Pyramides_et_Cônes_de_Revolution.docx"),
        Fiche("Statistiques", "2AC", "2AC/pdf/Statistiques.pdf", "2AC/word/Statistiques.docx"),
        Fiche("Symétrie Axiale", "2AC", "2AC/pdf/Symetrie_Axiale.pdf", "2AC/word/Symetrie_Axiale.docx"),
        Fiche("Triangles et Parallèles", "2AC", "2AC/pdf/Triangles_et_Parallèles.pdf", "2AC/word/Triangles_et_Parallèles.docx"),
        Fiche("Triangle Rectangle et Cercle", "2AC", "2AC/pdf/Triangle_Rectangle_et_Cercle.pdf", "2AC/word/Triangle_Rectangle_et_Cercle.docx"),
        Fiche("Vecteurs et Translations", "2AC", "2AC/pdf/Vecteurs_et_Translations.pdf", "2AC/word/Vecteurs_et_Translations.docx"),

        // 3AC
        Fiche("Calcul Trigonométrique", "3AC", "3AC/pdf/Calcul_Trigonometrique.pdf", "3AC/word/Calcul_Trigonometrique.docx"),
        Fiche("Équations et Inéquations", "3AC", "3AC/pdf/Equations_et_Inequations.pdf", "3AC/word/Equations_et_Inequations.docx"),
        Fiche("Équation d’une Droite", "3AC", "3AC/pdf/Equation_dune_Droite.pdf", "3AC/word/Equation_dune_Droite.docx"),
        Fiche("Fonctions linéaires et Affines", "3AC", "3AC/pdf/Fonctions_lineaires_et_Affines.pdf", "3AC/word/Fonctions_lineaires_et_Affines.docx"),
        Fiche("Identités Remarquables", "3AC", "3AC/pdf/Identites_Remarquables.pdf", "3AC/word/Identites_Remarquables.docx"),
        Fiche("L'Ordre et Opérations", "3AC", "3AC/pdf/L'Ordre_et_Operations.pdf", "3AC/word/L'Ordre_et_Operations.docx"),
        Fiche("L'Angle Inscrit et l'Angle au Centre", "3AC", "3AC/pdf/l'Angle_Inscrit_et_l'Angle_au_Centre.pdf", "3AC/word/l'Angle_Inscrit_et_l'Angle_au_Centre.docx"),
        Fiche("La Géométrie dans l'Espace", "3AC", "3AC/pdf/La_Geometrie_dans_l'Espace.pdf", "3AC/word/La_Geometrie_dans_l'Espace.docx"),
        Fiche("Les Puissances", "3AC", "3AC/pdf/Les_Puissances.pdf", "3AC/word/Les_Puissances.docx"),
        Fiche("Les Racines Carrées", "3AC", "3AC/pdf/Les_Racines_Carrees.pdf", "3AC/word/Les_Racines_Carrees.docx"),
        Fiche("Repère du Plan", "3AC", "3AC/pdf/Repère_du_Plan.pdf", "3AC/word/Repère_du_Plan.docx"),
        Fiche("Statistiques", "3AC", "3AC/pdf/Statistiques.pdf", "3AC/word/Statistiques.docx"),
        Fiche("Système de deux équations", "3AC", "3AC/pdf/Système_de_deux_equations.pdf", "3AC/word/Système_de_deux_equations.docx"),
        Fiche("Théorème de Pythagore", "3AC", "3AC/pdf/Theorème_de_Pythagore.pdf", "3AC/word/Theorème_de_Pythagore.docx"),
        Fiche("Théorème de Thales", "3AC", "3AC/pdf/Theorème_de_Thales.pdf", "3AC/word/Theorème_de_Thales.docx"),
        Fiche("Triangles Isométriques Triangles Semblables", "3AC", "3AC/pdf/Triangles_Isometriques_Triangles_Semblables.pdf", "3AC/word/Triangles_Isometriques_Triangles_Semblables.docx"),
        Fiche("Vecteurs et Translation", "3AC", "3AC/pdf/Vecteurs_et_Translation.pdf", "3AC/word/Vecteurs_et_Translation.docx")
    )

    val TousLesExos = listOf(
        //1AC exercices
        Exercice("Angles et triangles", "1AC", "1ACEXERCICES/Angles et triangles.pdf"),
        Exercice("Angles formés par deux parallèles et une sécante", "1AC", "1ACEXERCICES/Angles formés par deux parallèles et une sécante.pdf"),
        Exercice("Calcul littéral-Développement-Factorisation", "1AC", "1ACEXERCICES/Calcul littéral-Développement-Factorisation.pdf"),
        Exercice("Droites remarquables dans un triangle", "1AC", "1ACEXERCICES/Droites remarquables dans un triangle.pdf"),
        Exercice("La droite graduée et repérage dans le plan", "1AC", "1ACEXERCICES/La droite graduée et repérage dans le plan.pdf"),
        Exercice("Le cercle", "1AC", "1ACEXERCICES/Le cercle.pdf"),
        Exercice("Les nombres en écriture fractionnaire", "1AC", "1ACEXERCICES/Les nombres en écriture fractionnaire.pdf"),
        Exercice("Les opérations sur les fractions", "1AC", "1ACEXERCICES/Les opérations sur les fractions.pdf"),
        Exercice("Les équations", "1AC", "1ACEXERCICES/Les équations.pdf"),
        Exercice("Nombres décimaux relatifs", "1AC", "1ACEXERCICES/Nombres décimaux relatifs.pdf"),
        Exercice("Nombres relatifs multiplication et division", "1AC", "1ACEXERCICES/Nombres relatifs multiplication et division.pdf"),
        Exercice("Notions de géométrie", "1AC", "1ACEXERCICES/Notions de géométrie.pdf"),
        Exercice("Parallélogramme", "1AC", "1ACEXERCICES/Parallélogramme.pdf"),
        Exercice("Prisme droit et cylindre de révolution", "1AC", "1ACEXERCICES/Prisme droit et cylindre de révolution.pdf"),
        Exercice("Proportionnalité", "1AC", "1ACEXERCICES/Proportionnalité.pdf"),
        Exercice("Puissances", "1AC", "1ACEXERCICES/Puissances.pdf"),
        Exercice("Quadrilatères particuliers", "1AC", "1ACEXERCICES/Quadrilatères particuliers.pdf"),
        Exercice("Statistiques", "1AC", "1ACEXERCICES/Statistiques.pdf"),
        Exercice("Symétrie centrale", "1AC", "1ACEXERCICES/Symétrie centrale.pdf"),

        //2AC exercices

        Exercice("Calcul littéral", "2AC", "2ACEXERCICES/calcul litterale.pdf"),
        Exercice("La pyramide et cône de révolution", "2AC", "2ACEXERCICES/la pyramide et cone de revolution.pdf"),
        Exercice("Les droites remarquables dans un triangle", "2AC", "2ACEXERCICES/les droites remarquables dans un triangle.pdf"),
        Exercice("Les équations", "2AC", "2ACEXERCICES/les equations.pdf"),
        Exercice("Nombres rationnels - addition et soustraction", "2AC", "2ACEXERCICES/nombres rationels addition et soustraction.pdf"),
        Exercice("Nombres rationnels - introduction", "2AC", "2ACEXERCICES/nombres rationels introduction.pdf"),
        Exercice("Nombres rationnels - produit quotient", "2AC", "2ACEXERCICES/nombres rationels produit quotient.pdf"),
        Exercice("Ordre et opérations", "2AC", "2ACEXERCICES/ordre et operations.pdf"),
        Exercice("Proportionnalité", "2AC", "2ACEXERCICES/proportionnalite.pdf"),
        Exercice("Puissances", "2AC", "2ACEXERCICES/puissance.pdf"),
        Exercice("Quatre opérations sur les nombres rationnels", "2AC", "2ACEXERCICES/quatres operations sur les nombres rationels.pdf"),
        Exercice("Statistiques", "2AC", "2ACEXERCICES/statistiques.pdf"),
        Exercice("Symétrie axiale", "2AC", "2ACEXERCICES/symetrie axiale.pdf"),
        Exercice("Triangle - milieux et parallèles", "2AC", "2ACEXERCICES/traiangle milieux et paralleles.pdf"),
        Exercice("Triangle rectangle et cercle", "2AC", "2ACEXERCICES/Triangle rectangle et cercle.pdf"),
        Exercice("Vecteurs et translation", "2AC", "2ACEXERCICES/vecteurs et translation.pdf")
    )

    val tous_les_activites = listOf(
        activite("angles inscritset angle au centre","geogebra/angles_inscritset_angle_au_centre__full.html"),
        activite("Le cosinus","geogebra/cosinus_full.html"),
        activite("Deux paralleles et une secante","geogebra/deuxparalelesecante_full.html"),
        activite("Les mediatrices","geogebra/mediatrice_full.html"),
        activite("Theoreme de Thales","geogebra/thales_full.html")
    )


}
