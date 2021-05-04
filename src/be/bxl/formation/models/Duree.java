package be.bxl.formation.models;

public class Duree {

    //region Champs
    private int totalSeconde;
    //endregion

    //region
    public Duree(int nbSeconde) {
        this.totalSeconde = nbSeconde;
    }

    public Duree(int jour, int heure, int minute, int seconde) {
        if(jour < 0 || heure >= 24 || heure < 0 || minute >= 60 || minute < 0 || seconde >= 60 || seconde < 0) {
            throw new IllegalArgumentException("Durée invalide !");
        }

        this.totalSeconde = (jour * 86400) + (heure * 3600) + (minute * 60) + seconde;
    }
    //endregion
}