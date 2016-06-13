package adventureGame;

import java.util.Scanner;

public class Adventure {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome! What's your name?");
		String userName = userInput.nextLine();
		boolean goAgain = true;
		while (goAgain) {
			System.out.println(userName + " would you like to play a game? Enter Y or N");
			String userResponse = userInput.nextLine();
			switch (userResponse.charAt(0)) {
			case 'y':
			case 'Y':
				System.out.println("Great! Let's start.You're walking into a cave. Do you want to go left or right?");
				String gameChoice = userInput.nextLine();
				boolean loop1 = true;
				while (loop1) {
					switch (gameChoice.charAt(0)) {
					case 'l':
						System.out.println(
								"You went left.There's three weapons you can choose for self defense:knife, gun ,bow and arrow. Choose one");
						String userWeapon = userInput.nextLine();
						boolean loop2 = true;
						while (loop2) {
							switch (userWeapon.charAt(0)) {
							case 'k':
								System.out.println("You chose a knife. How many do you want? Input an integer");
								int userWeaponCount = userInput.nextInt();
								if (userWeaponCount < 3) {
									System.out.println(
											"You should've grabbed more. The zombies eat you before you were able to escape!");
									goAgain = false;
									loop2 = false;
									loop1 = false;
								} else {
									System.out.println(
											"Nice choice! You stabbed all the zombies on your way out of the cave!");
									loop2 = false;
									loop1 = false;
									goAgain = false;
									break;
								}
								break;
							case 'g':
								System.out.println("You chose a gun. How many do you want?");
								int userWeaponCount2 = userInput.nextInt();
								if (userWeaponCount2 < 3) {
									System.out.println(
											"You should've grabbed more. The zombies eat you before you were able to escape!");
									goAgain = false;
									loop2 = false;
									loop1 = false;
								} else {
									System.out.println(
											"Nice choice! You shot and killed all the zombies on your way out of the cave!");
									goAgain = false;
									loop2 = false;
									loop1 = false;
								}
								break;
							case 'b':
								System.out.println("You chose bow and arrow. How many arrows do you want?");
								int userWeaponCount3 = userInput.nextInt();
								if (userWeaponCount3 < 3) {
									System.out.println(
											"You should've grabbed more. The zombies eat you before you were able to escape!");
									goAgain = false;
									loop2 = false;
									loop1 = false;
								} else {
									System.out.println(
											"Nice choice! You killed all the zombies on your way out of the cave!");
									goAgain = false;
									loop2 = false;
									loop1 = false;
								}
								break;
							default:
								System.out.println(
										"Not a valid choice! The zombies eat you for your delay in response in choosing your weapon.");
								loop2 = false;
								loop1 = false;
								goAgain = false;
								break;
							}
						}
						break;

					case 'r':
						System.out.println("You went right. You see a light.");
						System.out.println("Go towards it or back away?");
						String userLife = userInput.nextLine();
						switch (userLife.charAt(0)) {
						case 'g':
							System.out.println("You make it out of the cave!");
							loop2 = false;
							loop1 = false;
							goAgain = false;
							break;
						case 'b':
							System.out.println("You travel deeper into the cave and zombies eat you ALIVE!!!!");
							loop2 = false;
							loop1 = false;
							goAgain = false;
							break;
						}
					}
				} break;
			case 'n':
				System.out.println("Goodbye");
				goAgain = false;
				break;
						
						
						
						
						
						
						
						
						
						
						
						
			/*default:
				System.out.println("Not a valid choice");
				break;*/

			}
		}

	}

}

