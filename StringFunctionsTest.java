
package stringoperations;

import org.junit.Assert;
import org.junit.Test;


public class StringFunctionsTest 
{
    
    @Test
    public void testLength()
    {
        StringFunctions sf = new StringFunctions();
        String name = "java";
        Assert.assertEquals(4,sf.getLength(name));
    }
    
    @Test
    public void testReverse()
    {
        StringFunctions sf = new StringFunctions();
        String name = "java";
        Assert.assertEquals("avaj",sf.reverseName(name));
    }
    
    @Test
    public void testUpperCase()
    {
        StringFunctions sf = new StringFunctions();
        String name = "java";
        Assert.assertEquals("JAVA", sf.upperName(name));
    }
}
