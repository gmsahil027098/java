public class WaterSong {
	public static void main (String  [] args) {
		int WaterNum =  9;
		String word = "bottles";
		while (WaterNum > 0)
		{
			if (WaterNum == 1)
			{
				word =  "bottle";
			}
			System.out.println(WaterNum+" "+word+" of water on wall");
			System.out.println(WaterNum+" "+word+" of water");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			WaterNum=WaterNum-1;
			if(WaterNum>0)
			{
				System.out.println(WaterNum+" "+word+" of water on wall");
			}
			else
			{
				System.out.println("No more bottles of water on the wall.");
			}
		}
	}
}