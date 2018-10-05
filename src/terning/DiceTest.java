package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test
    void roll() {
        Dice tester = new Dice();
        int i = 0;
        int et, to, tre, fire, fem, seks;
        et = to = tre = fire = fem = seks = 0;
        int resultat;

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
            }
            i++;
        }

        assertTrue(9600 <= et && et <= 14000 && 9600 <= to && to <= 14000 && 9600 <= tre && tre <= 14000 && 9600 <= fire && fire <= 14000 && 9600 <= fem && fem <= 14000 && 9600 <= seks && seks <= 14000);

    }
    @org.junit.jupiter.api.Test
    void rollMultiple() {
    }
}