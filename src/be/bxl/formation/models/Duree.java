package be.bxl.formation.models;

public class Duree {

    //region Champs
    private int totalSeconde;
    //endregion

    //region
    public Duree(int nbSeconde) {
        this.setTotalSeconde(nbSeconde);
    }

    public Duree(int jour, int heure, int minute, int seconde) {
        if(jour < 0 || heure < 0 || minute < 0 || seconde < 0) {
            throw new IllegalArgumentException("Durée invalide !");
        }

        this.setTotalSeconde( (jour * 86400) + (heure * 3600) + (minute * 60) + seconde );
    }
    //endregion

    //region Getters
    public int getTotalSeconde() {
        return totalSeconde;
    }

    public int getJour() {
        return totalSeconde/86400;
    }

    public int getHeure() {
        return (totalSeconde/3600) % 24;
    }

    public int getMinute() {
        return (totalSeconde/60) % 60;
    }

    public int getSeconde() {
        return totalSeconde % 60;
    }
    //endregion

    //region Setters (Mutateur)
    private void setTotalSeconde(int seconde) {
        if(seconde < 0) {
            throw  new IllegalArgumentException("Les durées négative ne sont pas géré!");
        }
        this.totalSeconde = seconde;
    }
    //endregion

    //region Méthode
    public String getDuree() {
        return String.format("%s jour %s heure %s minute et %s seconde",
                getJour(), getHeure(), getMinute(), getSeconde());
    }

    public void addDuree(Duree aAjouter) {
        int valeur = this.getTotalSeconde() + aAjouter.getTotalSeconde();
        this.setTotalSeconde(valeur);

    }

    public void subDuree(Duree aSoustraire) {
        int valeur = this.getTotalSeconde() - aSoustraire.getTotalSeconde();
        this.setTotalSeconde(valeur);
    }
    //endregion
}
