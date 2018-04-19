/**
 * A class to demonstrate what else a compiler might generate from enum Day {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
 * @author DEMcKnight
 */
public class Day
{
	
	int i;
	
	private Day(int i)
	{
		this.i=i;
	}
	
	/**
	 * Each of these is in a different part of memory. Since == compares locations in memory, they won't be equal to anything but themselves.
	 */
	public static Day Sunday = new Day(0);
	public static Day Monday = new Day(1);
	public static Day Tuesday = new Day(2);
	public static Day Wednesday = new Day(3);
	public static Day Thursday = new Day(4);
	public static Day Friday = new Day(5);
	public static Day Saturday = new Day(6);
}