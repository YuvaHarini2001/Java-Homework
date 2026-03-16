
package frequencycount;

import java.util.Scanner;


public class FrequencyCountMain 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string:");
        String word = sc.nextLine();
        
        char[] charArray = word.toCharArray();
        
        System.out.println("Frequency Count:");
        
        for (int i = 0; i <charArray.length; i++)
        {
            int count = 1;
            
            if(charArray[i]=='0'|| charArray[i]==' ')
            {
                continue;
            }
            
            for (int j = i+1; j <charArray.length; j++)
            {                
                if(charArray[i]==charArray[j])
                {
                    count++;
                    
                    charArray[j]='0';
                }
            }
            
            System.out.println(charArray[i]+":"+count);
        }
    }
    
}
