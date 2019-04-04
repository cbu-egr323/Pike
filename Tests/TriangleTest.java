import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle TestT;

    @Test
    public void testIsEquilateral() throws Exception {
        TestT = new Triangle(1, 1, 1);
        assertTrue(TestT.isEquilateral());
    }

    @Test
    public void testIsNotEquilateral() throws Exception {
        TestT = new Triangle(1, 2, 1);
        assertFalse(TestT.isEquilateral());
    }

    @Test
    public void testIsScalene() throws Exception {
        TestT = new Triangle(1, 2, 3);
        assertTrue(TestT.isScalene());
    }

    @Test
    public void testIsNotScalene() throws Exception {
        TestT = new Triangle(1, 1, 3);
        assertFalse(TestT.isScalene());
    }

    @Test
    public void testIsIsoscelesSide1and2Equal() throws Exception {
        TestT = new Triangle(1, 1, 3);
        assertTrue(TestT.isIsosceles());
    }

    @Test
    public void testIsIsoscelesSide1and3Equal() throws Exception {
        TestT = new Triangle(1, 1, 3);
        assertTrue(TestT.isIsosceles());
    }

    @Test
    public void testIsIsoscelesSide2and3Equal() throws Exception {
        TestT = new Triangle(1, 3, 1);
        assertTrue(TestT.isIsosceles());
    }

    @Test
    public void testIsNotIsosceles() throws Exception {
        TestT = new Triangle(1, 1, 1);
        assertFalse(TestT.isIsosceles());
    }
}