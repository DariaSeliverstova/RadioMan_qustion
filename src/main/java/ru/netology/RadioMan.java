package ru.netology;




public class RadioMan {
    private int id;
    private int currentRadio;
    private int currentVolume;
    private int minRadio = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int numberOfstaion = 10;


    public RadioMan( int numberOfstaion ) {
        this.numberOfstaion = numberOfstaion;


    }

    public RadioMan() {

    }

    public void setCurrentRadio(int newRadio) {

        if (newRadio < minRadio) {
            return;
        }
        if (newRadio > numberOfstaion) {
            return;
        }

        currentRadio = newRadio;

    }

    public void nextStation() {

        int nextStation = currentRadio + 1;


        if (nextStation > numberOfstaion) {
            currentRadio = minRadio;
        } else {
            currentRadio = nextStation - 1;
        }

    }

    public void beforeStation() {

        int beforeStation = currentRadio;
        int r = currentRadio - 1;
        if (r < minRadio) {
            currentRadio = numberOfstaion;
        } else {
            currentRadio = beforeStation;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentVolume(int newVolume) {

        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;

    }

    public void nextVolume() {

        int nextVolume = currentVolume + 1;
        int v = currentVolume + 1;

        if (v > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = nextVolume - 1;
        }

    }

    public void beforeVolume() {

        int beforeVolume = currentVolume - 1;
        int v = currentVolume - 1;
        if (v < minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = beforeVolume + 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

}


