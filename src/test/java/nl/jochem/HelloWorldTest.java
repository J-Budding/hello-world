package nl.jochem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple HelloWorld.
 */
public class HelloWorldTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest( String testName )
    {
        super( testName );
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello in de Test Klasse!!!" );
		    System.out.println( "---- " + "Testert" );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorldTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHelloWorld()
    {
        assertTrue( true );
    }

    public void testFlip()
    {
        String s = "Hello, World";  //new HelloWorld();
        System.out.println( "++++ " + s );
        if (s.equals("Hello, World"))
            assertTrue( true );
        else
            assertTrue (false);
    }

}
