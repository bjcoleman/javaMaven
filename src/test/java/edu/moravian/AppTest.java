package edu.moravian;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void brilliantMath()
    {
        assertEquals(42, 15 + 27);
    }

    @Test
    public void testTruth()
    {
        assertEquals(true, true);
    }

}
