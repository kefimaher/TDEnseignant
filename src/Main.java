public class Main {
    public static void main(String[] args) {
        Enseignant e1 = new Enseignant(1, "Kefi", "Maher");
        Enseignant e2 = new Enseignant(2, "Eya", "Riahai");
        Enseignant e3 = new Enseignant(3, "Maha", "kefi");

        GestionEnseignant gestion1 = new EspritHashSet();
        gestion1.ajouterEnseignant(e1);
        gestion1.ajouterEnseignant(e2);
        gestion1.ajouterEnseignant(e3);
        System.out.println(gestion1.rechercherEnseignant(e1));
        System.out.println(gestion1.rechercherEnseignant(4));
        gestion1.supprimerEnseignant(e2);
        gestion1.displayEnseignants();

        GestionEnseignant gestion2 = new EspritTreeSet();
        gestion2.ajouterEnseignant(e1);
        gestion2.ajouterEnseignant(e2);
        gestion2.ajouterEnseignant(e3);
        System.out.println(gestion2.rechercherEnseignant(e1));
        System.out.println(gestion2.rechercherEnseignant(4));
        gestion2.supprimerEnseignant(e3);
        gestion2.displayEnseignants();
    }
}
