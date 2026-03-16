
package duplicatecharacters;

import java.util.Scanner;


public class DuplicateCharactersMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string:");
        String word = sc.nextLine();
        
        char[] charArray =word.toCharArray();
        
        System.out.println("Duplicate Characters:");
        
        for (int i = 0; i <charArray.length; i++) 
        {
            int count =1;
            
            for (int j = i+1; j <charArray.length; j++) 
            {
                if(charArray[i]==charArray[j]&&charArray[i]!=' ')
                {
                    count++;
                    
                    charArray[j]='0';
                }
            }
            
            if(count>1 && charArray[i]!='0')
            {
                System.out.println(charArray[i]);
            }
        }
    }
    
}
