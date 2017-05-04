import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void shouldReturnTwelvePointFiveSixWhenRadiusIsTwo() throws Exception {
        Circle circle = new Circle(2);
        assertEquals(12.56, circle.getArea(), 0.01);
    }

    @Test
    public void shouldReturnTwentyFivePointTwelveWhenRadiusIsFour() throws Exception {
        Circle circle = new Circle(4);
        assertEquals(25.12, circle.getPerimeter(), 0.001);
    }
}
