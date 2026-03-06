package stringoperations;


public class StringFunctions 
{
    private String name;
    
    public int getLength(String name)
    {
        return name.length();
    }
    
    public String reverseName(String name)
    {
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }
    
    public String upperName(String name)
    {
        return name.toUpperCase();
    }
}
