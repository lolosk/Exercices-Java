public class Etudiant {
    private String nom;
    private int age;
    private String programme;

    // Constructeur
    public Etudiant(String nom, int age, String programme) {
        this.nom = nom;
        this.age = age;
        this.programme = programme;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Etudiant [Nom=" + nom + ", Age=" + age + ", Programme=" + programme + "]";
    }
}
