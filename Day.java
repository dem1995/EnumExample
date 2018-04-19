/**
 * A class to demonstrate what a compiler might generate from enum Day {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
 * @author DEMcKnight
 */
public class Day
{	
	/**
	 * Each of these is in a different part of memory. Since == compares locations in memory, they won't be equal to anything but themselves.
	 */
	public static Day Sunday = new Day();
	public static Day Monday = new Day();
	public static Day Tuesday = new Day();
	public static Day Wednesday = new Day();
	public static Day Thursday = new Day();
	public static Day Friday = new Day();
	public static Day Saturday = new Day();
}