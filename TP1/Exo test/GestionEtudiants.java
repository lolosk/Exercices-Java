import java.util.ArrayList;
import java.util.List;

public class GestionEtudiants {
    private List<Etudiant> etudiants;
    private int capaciteMax;

    // Constructeur
    public GestionEtudiants(int capaciteMax) {
        this.capaciteMax = capaciteMax;
        this.etudiants = new ArrayList<>(capaciteMax);
    }

    // Méthode pour ajouter un étudiant
    public boolean ajouterEtudiant(Etudiant etudiant) {
        if (etudiants.size() < capaciteMax) {
            etudiants.add(etudiant);
            return true;
        } else {
            System.out.println("La capacité maximale des étudiants est atteinte.");
            return false;
        }
    }

    // Méthode pour rechercher un étudiant par nom
    public Etudiant rechercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                return etudiant;
            }
        }
        return null;
    }

    // Méthode pour calculer l'âge moyen des étudiants
    public double calculerAgeMoyen() {
        if (etudiants.isEmpty()) {
            return 0;
        }
        int totalAge = 0;
        for (Etudiant etudiant : etudiants) {
            totalAge += etudiant.getAge();
        }
        return totalAge / (double) etudiants.size();
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Etudiant etudiant : etudiants) {
            sb.append(etudiant).append("\n");
        }
        return sb.toString();
    }
}
