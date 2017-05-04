import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTest {

    @Test
    public void shouldReturnAreaOfThirtySixWhenLengthIsSix() throws Exception {
        Square square = new Square(6);
        assertEquals(36, square.getArea());

    }

    @Test
    public void shouldReturnAreaOfTwentyFiveWhenLenghtIsFive() throws Exception {
        Square square = new Square(5);
        assertEquals(25, square.getArea());
    }

    @Test
    public void shouldReturnPerimeterOfSixteenWhenLengthIsFour() throws Exception {
        Square square = new Square(4);
        assertEquals(16, square.getPerimeter());
    }
}
