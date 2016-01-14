package es.egc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import es.egc.App1;

/**
 * Unit test for simple App.
 */
public class App1Test
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App1Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App1Test.class );
    }

    
    public void testApp()
    {
        assertTrue( new App1().suma(2,2) == 4 );
    }
}
