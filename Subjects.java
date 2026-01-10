import java.util.Scanner;
class Subjects
{
    double mark1, mark2, mark3;
    double total;
    double percentage;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
	{	
		Subjects sub = new Subjects();
		sub.mainMenu();
    }
	
	void mainMenu()
	{
		inputMarks();
		
		int choice;
        do 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter your choice: ");
            System.out.println("****Menu****");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1: displayTotal(); 
						break;
                case 2: displayPercentage(); 
						break;
                case 3: displayResult(); 
						break;
                case 4: displayGrade(); 
						break;
                case 5: System.out.println("Exit");
						break;
                default: System.out.println("Invalid choice");
						 break;
            }
        } while (choice != 5);
	}

   
    void inputMarks() 
	{
        System.out.print("Enter marks for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        mark3 = sc.nextInt();
    }

 
	void displayTotal()
	{
        total = mark1 + mark2 + mark3;
        System.out.println("Total Marks: " + total);
    }

    
    void displayPercentage()
	{
        percentage = (total / 300) * 100;
        System.out.println("Percentage:"+percentage);
    }

    void displayResult() 
	{
        if (percentage >= 40) 
		{
            System.out.println("Result: PASS");
        } 
		else
		{
            System.out.println("Result: FAIL");
        }
    }

 
	void displayGrade()
	{
        if (percentage >= 75) 
		{
            System.out.println(" Grade A");
        } 
		else if (percentage >= 60) 
		{
            System.out.println("Grade B");
        } 
		else if (percentage >= 40) 
		{
            System.out.println("Grade C");
        } 
		else 
		{
            System.out.println(" Grade F");
        }
    }
}