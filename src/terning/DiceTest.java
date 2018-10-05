package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    /**
     * tester om Dice.roll() kun returnerer værdier mellem 1 og 6
     * og om alle værdier forekommer ca lige hyppigt
     */

    @org.junit.jupiter.api.Test
    void roll() {
        Dice tester = new Dice();
        int i = 0;
        int et, to, tre, fire, fem, seks;
        int n = 0;
        et = to = tre = fire = fem = seks = 0;
        int resultat;
        int intervalMin = 10000-400;
        int intervalMax = 10000+400;


        while (i < 60001) {
            resultat = tester.roll();
            switch (resultat) {
                case 1:
                    et++;
                    break;
                case 2:
                    to++;
                    break;
                case 3:
                    tre++;
                    break;
                case 4:
                    fire++;
                    break;
                case 5:
                    fem++;
                    break;
                case 6:
                    seks++;
                    break;
                default:
                    n++;
                    break;
            }
            i++;
        }

        assertTrue(intervalMin <= et && et <= intervalMax && intervalMin <= to && to <= intervalMax && intervalMin <= tre && tre <= intervalMax && intervalMin <= fire && fire <= intervalMax && intervalMin <= fem && fem <= intervalMax && intervalMin <= seks && seks <= intervalMax);
        assertTrue(n == 0);
    }


    @org.junit.jupiter.api.Test
    void rollMultiple() {

    }
}