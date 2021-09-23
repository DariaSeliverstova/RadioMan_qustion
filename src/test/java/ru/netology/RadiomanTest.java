package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {
    RadioMan rad = new RadioMan( 10);
    @Test
    void ShouldRadio1() {

        rad.setCurrentRadio(-1);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }
    @Test
    void ShouldRadio2() {

        rad.setCurrentRadio(11);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }


    @Test
    void ShouldNextStation1() {

        rad.setCurrentRadio(10);

        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }

    @Test
    void ShouldNextStation2() {

        rad.setCurrentRadio(5);

        rad.nextStation();
        int expected = 5;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }

    @Test
    void ShouldBeforeStation1() {

        rad.setCurrentRadio(0);

        rad.beforeStation();
        int expected = 10;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }

    @Test
    void ShouldBeforeStation2() {

        rad.setCurrentRadio(5);

        rad.beforeStation();
        int expected = 5;
        int actual = rad.getCurrentRadio();

        assertEquals(expected, actual);

    }
    @Test
    void shouldVolume1() {


        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldVolume2() {

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldNextVolume1() {

        rad.setCurrentVolume(100);

        rad.nextVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldNextVolume2() {

        rad.setCurrentVolume(5);

        rad.nextVolume();
        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void ShouldBeforeVolume1() {

        rad.setCurrentVolume(0);

        rad.beforeVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void ShouldBeforeVolume2() {

        rad.setCurrentVolume(1);

        rad.beforeVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}

