package unPackage;

public class SuperClasse {
    /**
     * String nom
     */
    private String nom;

    /**
     * Constructeur de la classe SuperClasse
     * @param nom String
     */
    public SuperClasse(String nom) {
        this.nom = nom;
    }

    /**
     * Fonction qui retourne un mot
     * @return String
     */
    public String getNom() {
        return nom;
    }
}
