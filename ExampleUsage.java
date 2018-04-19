/**
 * Example usage of Day "enum" class
 * @author DEMcKnight
 */
public class ExampleUsage
{
	public static void main (String[] args)
	{
		Day day1 = Day.Monday;
		Day day2 = Day.Tuesday;
		Day otherDay = Day.Monday;
		
		if (day1==day2)
			System.out.println("Mondays are the same as Tuesdays");
		else
			System.out.println("Mondays are not the same as Tuesdays");
		
		if (day1==otherDay)
			System.out.println("Mondays are Mondays, though");
		else
			System.out.println("Error. This should not be reached, lol.");
	}

}
