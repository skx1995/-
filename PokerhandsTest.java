import org.junit.Assert;
import org.junit.Test;

public class PokerTest {

    @Test
    public void test() {
        Poker poker = new Poker();
        String Result_ 1 = poker.test("2H 3D 5S 9C KD", "2C 3H 4S 8C AH");
        Assert.assertEquals("White wins - high card: Ace", Result_ 1);


        String Result_ 2 = poker.test("2H 4S 4C 2D 4H", "2S 8S AS QS 3S");
        Assert.assertEquals("Black wins - Full House", Result_ 2);


        String Result_ 3 = poker.test("2H 3D 5S 9C KD", "2C 3H 4S 8C KH");
        Assert.assertEquals("Black wins - high card: 9",Result_ 3);


        String Result_ 4 = poker.test("2H 3D 5S 9C KD", "2D 3H 5C 9S KH");
        Assert.assertEquals("Tie", Result_ 4);


    }
}