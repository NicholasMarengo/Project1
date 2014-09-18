import java.util.Arrays;
import java.util.Scanner;

//^ Scanner takes user's input

public class LawnGameOlympics {
	
	private static String[] games;
	private static String[][] players; 
	
	public static void main(String[] args) {
		
		//Calling the methods to use the private arrays
		olympianListArray();
		gameArray();
		
		
	}
		
		
	public static String[][] getPlayers() {
		return players; 
	}

	public static String displayAllGames(){
		int size = games.length;
		String listOfGames= "";
		
		for(int i=0; i < size-1 ;i++){
			listOfGames += games[i] + ", ";
		}
		listOfGames += games[size-1];
		
		return listOfGames;
	}

	public static void gameArray()
	{
		String[] anArrayOfGames = {
			"Washoos",
			"Ladderball", 
			"CanJam", 
			"HorseShoes",
			"CornHole", 
			"StickGame"
		};
		
		
		//declaring my variable
		games = anArrayOfGames;
	}
	
	public static void olympianListArray()
	{
		Scanner a = new Scanner(System.in);
		String input = a.toString();
		a.close();
				
		String[][] olympianList = {
				{"Nicholas", "Male", "18"},
				{"Tito", "Male", "19"},
				{"Brandon", "Male", "19"},
				{"Alyssa", "Female", "19"},
				{"Duane", "Male", "20"},
				{"Rachelle", "Female", "19"},
				{"Jae", "Male", "18"},
				{"Zack", "Male", "18"},
				{"Jon", "Male", "18"},
				{"Gab", "Female", "19"},
				{"Talia", "Female", "20"},
				{"Brian", "Male", "19"},
				{"Ethan", "Male", "19"},
				{"Max", "Male", "20"},
				{"Will", "Male", "19"}
									};
		
		
		//ERROR LOOP
		while(input != "o:" || input != "olympians" || input != "e:" || input != "events" || input != "h:" || input != "help")
		{
			System.out.println("Error! Please input valid statement: ");
			Scanner temp = new Scanner(System.in);
			input = temp.toString();
			temp.close();
		}
		
		String[][] player = new String[olympianList.length][3];

		
		if(input == "o:" || input == "olympians")
		{
			for(int i = 0; i < olympianList.length; i++)
			{
				//0-2 used for the attributes of that Olympians (Name, Sex, Age)
				
				System.out.println(olympianList[i][0]);
				player[i][0] = olympianList[i][0];
				player[i][1] = olympianList[i][1];
				player[i][2] = olympianList[i][2];
			}
		}
		
		else if(input == "e:" || input == "events")
		{
			for(int i = 0; i < olympianList.length; i++)
			{
				System.out.println(olympianList[i][0]);
				player[i][0] = olympianList[i][0];
				player[i][1] = olympianList[i][1];
				player[i][2] = olympianList[i][2];
			}
		}
		
		else if(input == "h:" || input == "help")
		{
			for(int i = 0; i < olympianList.length; i++)
			{
				System.out.println(olympianList[i][0]);
				player[i][0] = olympianList[i][0];
				player[i][1] = olympianList[i][1];
				player[i][2] = olympianList[i][2];
			}
		}
			
		players = player;
	}
	
	public static String displayAllOlympians(){
		return Arrays.deepToString(getPlayers());
	}
	
	public static String displayHelpInfo(){
		return "Welcome to the Help Page!\n "
				+ "Currently there is no help available!\n"
				+ "We apologize for the inconvenience";
	}
	
	
	//this was pretty difficult but I did learn a lot!
}