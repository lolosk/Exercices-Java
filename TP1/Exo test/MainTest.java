public class MainTest {
    public static void main(String[] args) {
        GestionEtudiants gestion = new GestionEtudiants(5);
        
        // Création et ajout d'étudiants
        Etudiant etudiant1 = new Etudiant("Lois", 20, "R&T");
        Etudiant etudiant2 = new Etudiant("Bob", 22, "Linux");
        gestion.ajouterEtudiant(etudiant1);
        gestion.ajouterEtudiant(etudiant2);

        // Affichage des étudiants
        System.out.println("Liste des étudiants :");
        System.out.println(gestion);

        // Recherche d'un étudiant
        Etudiant etudiantRecherche = gestion.rechercherEtudiant("Lois");
        if (etudiantRecherche != null) {
            System.out.println("Étudiant trouvé : " + etudiantRecherche);
        } else {
            System.out.println("Étudiant non trouvé");
        }

        // Calcul de l'âge moyen
        double ageMoyen = gestion.calculerAgeMoyen();
        System.out.println("Âge moyen des étudiants : " + ageMoyen);
    }
}
