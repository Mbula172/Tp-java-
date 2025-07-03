/**
 * Interface définissant le contrat pour tous les types de véhicules
 */
interface Vehicule {
    void demarrer();
    void arreter();
    int obtenirVitesseMaximale();
}

/**
 * Implémentation concrète d'une voiture
 */
final class Voiture implements Vehicule {
    private final int vitesseMaximale;

    public Voiture(int vitesseMaximale) {
        this.vitesseMaximale = vitesseMaximale;
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage du moteur de la voiture (VROUM VROUM)");
    }

    @Override
    public void arreter() {
        System.out.println("Freinage et arrêt de la voiture");
    }

    @Override
    public int obtenirVitesseMaximale() {
        return vitesseMaximale;
    }
}

/**
 * Implémentation concrète d'un vélo
 */
final class Velo implements Vehicule {
    private final int vitesseMaximale;

    public Velo(int vitesseMaximale) {
        this.vitesseMaximale = vitesseMaximale;
    }

    @Override
    public void demarrer() {
        System.out.println("Début de pédalage du vélo (C'EST PARTI !)");
    }

    @Override
    public void arreter() {
        System.out.println("Arrêt du vélo en freinant");
    }

    @Override
    public int obtenirVitesseMaximale() {
        return vitesseMaximale;
    }
}

/**
 * Implémentation concrète d'une moto
 */
final class Moto implements Vehicule {
    private final int vitesseMaximale;

    public Moto(int vitesseMaximale) {
        this.vitesseMaximale = vitesseMaximale;
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage de la moto (BRAAAP BRAAAP)");
    }

    @Override
    public void arreter() {
        System.out.println("Arrêt de la moto avec un freinage puissant");
    }

    @Override
    public int obtenirVitesseMaximale() {
        return vitesseMaximale;
    }
}

/**
 * Programme principal de test des véhicules
 */
public class TestVehicules {
    public static void main(String[] args) {
        Vehicule[] vehicules = {
            new Voiture(200),
            new Velo(30),
            new Moto(180)
        };

        String[] nomsVehicules = {"Voiture", "Vélo", "Moto"};

        for (int i = 0; i < vehicules.length; i++) {
            testerVehicule(vehicules[i], nomsVehicules[i]);
        }

        afficherMessageFinal();
    }

    private static void testerVehicule(Vehicule vehicule, String typeVehicule) {
        System.out.println("\n=== Test " + typeVehicule + " ===");
        vehicule.demarrer();
        System.out.printf("Vitesse maximale: %d km/h%n", vehicule.obtenirVitesseMaximale());
        vehicule.arreter();
    }

    private static void afficherMessageFinal() {
        System.out.println("\nMerci pour votre attention !");
        System.out.println("Code développé avec passion par Joseph Mbula");
        System.out.println("Date: " + java.time.LocalDate.now());
    }
}