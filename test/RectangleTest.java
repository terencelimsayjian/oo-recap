import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void dummyTest() {
        assertTrue(true);
    }

    @Test
    public void shouldReturnAreaSixWhenLengthIsThreeAndWidthIsTwo() throws Exception {
        Rectangle rectangle = new Rectangle(3, 2);
        assertEquals(6, rectangle.getArea());
    }

    @Test
    public void shouldReturnAreaEightWhenLengthIsTwoAndWithIsFour() throws Exception {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(8, rectangle.getArea());
    }

    @Test
    public void shouldReturnPerimeterTwelveWhenLengthIsTwoAndWidthIsFour() throws Exception {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(12, rectangle.getPerimeter());
    }

    @Test
    public void shouldReturnPerimeterTwentyWhenLengthIsFiveAndWidthIsFive() throws Exception {
        Rectangle rectangle = new Rectangle(5, 5);
        assertEquals(20, rectangle.getPerimeter());
    }
}
