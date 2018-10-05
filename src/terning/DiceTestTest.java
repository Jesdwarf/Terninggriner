package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTestTest {

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void roll() {
        Dice test = new Dice();
        int count = 60000;
        int one, two, three, four, five, six;
        one = two = three = four =  five = six = 0;
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        System.out.println("three: " + three);
        System.out.println("four: " + four);
        System.out.println("five: " + five);
        System.out.println("six: " + six);
        int result;
        while(count > 0){
            result = test.roll();
            switch (result) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
            }
            count--;
        }
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        System.out.println("three: " + three);
        System.out.println("four: " + four);
        System.out.println("five: " + five);
        System.out.println("six: " + six);

    }

    @org.junit.jupiter.api.Test
    void rollMultiple() {

    }
}