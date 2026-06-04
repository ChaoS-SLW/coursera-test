package teamwork01;

import java.util.Random;
import java.util.Scanner;

public class project01 {
	public static void main(String[] args) {

		Scanner scanStr = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Random r = new Random();

		//		System.out.println("playerの人数を選択してください");
		//		System.out.println("1:1player 2:2player 3:3player ");
		//		int choice = scanInt.nextInt();

		int Whealth;
		int Mhealth;
		int kappahealth;
		int Wdamage;
		int Mdamage;
		int kappadamage;
		int Wdefence;
		int Mrecovery;
		int defence = 0;
		int recovery = 0;
		int Ohealth;
		int Odamage;
		int Orecovery;

		//		if (choice == 1) {
		System.out.println("=================================");
		System.err.println("      RPG ADVENTURE WORLD");
		System.out.println("=================================");
		System.out.println();

		System.out.println("playerの名前を入力してください");
		System.out.print(">>>");
		String name = scanStr.nextLine();

		System.out.println(name + " Welcome to the adventure World!!!");

		System.out.println("遊びたいplayer タイプを選んでください");
		System.out.println("1:ウォリアー  2:メイジ ");
		int type = scanInt.nextInt();
		Whealth = 100;

		Mhealth = 90;

		kappahealth = 100;

		if (type == 1) {

			System.out.println("ウォリアー's STATS");
			System.out.println("HEALTH:100 DAMAGE:25 DEFENCE:+5");
			while (true) {

				System.out.println("------------------------------");
				System.out.println("あなたは冒険の世界へようこそ！");
				System.out.println(" ");
				System.out.println("レベル1のモンスター「カッパ」が現れた！");
				System.out.println(" ");
				System.out.println("KAPPA's STATS");
				System.out.println("HEALTH:100 DAMAGE:25 RECOVERY:+0");
				System.out.println(" ");

				//				System.out.println("行動を選んでください！");
				//				System.out.println("1:Fight 2:run");
				//				int choice1 = scanInt.nextInt();

				//				if (choice == 1) {
				System.out.println("⚔️ 戦闘が始まる！");

				while (Whealth > 0 || kappahealth > 0) {
					Wdamage = r.nextInt((25) + 1);
					Wdefence = r.nextInt((10) + 1);
					defence = 0;
					kappadamage = r.nextInt((25) + 1);
					System.out.println(name + "'s Health:" + Whealth);
					System.out.println("KAPPA's Health:" + kappahealth);
					System.out.println("行動を選んでください");
					System.out.println("1:attack 2:defence");
					int action = scanInt.nextInt();

					if (action == 1) {
						int attack = Wdamage;
						kappahealth -= attack;
						System.out.println(name + "attacks!!" + attack + "Damage");
					} else if (action == 2) {

						defence += Wdefence;
						System.out.println(name + "defence!" + defence + "+Defence");

					} else {
						System.out.println("Please enter a valid number");
					}

					if (defence > 0 && kappahealth > 0) {
						int kappaATK = (kappadamage - defence);

						if (kappaATK < 0) {
							kappaATK = 0;
						}

						Whealth -= kappaATK;

						System.out.println("KAPPA attacks " + kappaATK + " Damage");
					} else if (kappahealth > 0) {
						int kappaATK = kappadamage;
						Whealth -= kappaATK;
						System.out.println("KAPPA attacks" + kappaATK + "Damage");
					}

					// you gotta fix this defence isn't defending

					if (kappahealth <= 0) {

						break;
					}

					if (Whealth <= 0) {
						System.out.println("YOU've been defeated!!");
						System.out.println("  ");
						break;
					}

				}
				if (kappahealth <= 0) {
					System.out.println("YOU've passed the level 1");
					System.out.println("  ");
					break;
				} else if (Whealth <= 0) {
					System.out.println("GAME OVER ");
					break;
				}

				//	}	this is level 1 end 		

			} //type
				// this is level 2
			while (kappahealth <= 0) {
				System.out.println("You've reached on level 2");
				System.out.println("All of your stats has been add by 10");
				System.out.println("  ");
				Whealth = 110;

				System.out.println("ウォリアー's STATS");
				System.out.println("  ");
				System.out.println("HEALTH:110 DAMAGE:35 DEFENCE:+15");
				System.out.println("  ");
				System.out.println("レベル2のモンスター「鬼👹」が現れた！");
				System.out.println(" ");
				System.out.println("鬼's STATS");
				System.out.println("HEALTH:150 DAMAGE:30 RECOVERY:+5");
				System.out.println(" ");
				Ohealth = 150;

				System.out.println("⚔️ 戦闘が始まる！");

				while (Whealth > 0 || Ohealth > 0) {
					Wdamage = r.nextInt((25) + 1) + 10;
					Wdefence = r.nextInt((5) + 1) + 10;

					Odamage = r.nextInt((30) + 1);
					System.out.println(name + "'s Health:" + Whealth);
					System.out.println("   ");
					System.out.println("Oni's Health:" + Ohealth);
					System.out.println("   ");
					System.out.println("行動を選んでください");
					System.out.println("1:attack 2:defence");
					int action = scanInt.nextInt();
					System.out.println("   ");

					if (action == 1) {
						int attack = Wdamage;
						Ohealth -= attack;
						System.out.println(name + "attacks!!" + attack + "Damage");
					} else if (action == 2) {

						defence += Wdefence;
						System.out.println(name + "defence!" + defence + "+Defence");
					} else {
						System.out.println("Please enter a valid number");
					}

					if (defence > 0 && kappahealth > 0) {
						int OATK = (Odamage - defence);

						if (OATK < 0) {
							OATK = 0;
						}

						Whealth -= OATK;

						System.out.println("ONI attacks " + OATK + " Damage");
					} else if (Ohealth > 0) {
						int OATK = Odamage;
						Whealth -= OATK;
						System.out.println("ONI attacks" + OATK + "Damage");
					}

					if (Ohealth <= 0) {

						break;
					} else if (Whealth <= 0) {
						System.out.println("YOU've been defeated!!");
						break;
					}

				}
				if (Ohealth <= 0) {
					System.out.println("YOU've passed the level 2");
					System.out.println("Congratulations");
					System.out.println("YOU've now clear all the levels");
					break;
				} else if (Whealth <= 0) {
					System.out.println("GAME OVER ");
					break;
				}
				break;
			}
			//this is W level2 end

			// this is Mage

		} else if (type == 2) {
			System.out.println("メイジ's STATS");
			System.out.println("HEALTH:90 DAMAGE:30 RECOVERY:+10");
			while (true) {

				System.out.println("------------------------------");
				System.out.println("あなたは冒険の世界へようこそ！");
				System.out.println(" ");
				System.out.println("レベル1のモンスター「カッパ」が現れた！");
				System.out.println(" ");
				System.out.println("KAPPA's STATS");
				System.out.println("HEALTH:100 DAMAGE:25 RECOVERY:+0");
				System.out.println(" ");

				//				System.out.println("行動を選んでください！");
				//				System.out.println("1:Fight 2:run");
				//				int choice1 = scanInt.nextInt();

				//				if (choice == 1) {
				System.out.println("⚔️ 戦闘が始まる！");

				while (Mhealth > 0 || kappahealth > 0) {
					Mdamage = r.nextInt((25) + 1);
					Mrecovery = r.nextInt((5) + 1);
					recovery = 0;
					kappadamage = r.nextInt((25) + 1);
					System.out.println(name + "'s Health:" + Mhealth);
					System.out.println("KAPPA's Health:" + kappahealth);
					System.out.println("行動を選んでください");
					System.out.println("1:Attack 2:Heal");
					int action = scanInt.nextInt();

					if (action == 1) {
						int attack = Mdamage;
						kappahealth -= attack;
						System.out.println(name + "attacks!!" + attack + "Damage");
					} else if (action == 2) {

						recovery += Mrecovery;

						System.out.println(name + "recovery!" + recovery + "Health");
					} else {
						System.out.println("Please enter a valid number");
					}
					if (recovery > 0 && kappahealth > 0) {
						int kappaATK = kappadamage;
						Mhealth -= kappaATK;
						System.out.println("KAPPA attacks" + kappaATK + "Damage");
						Mhealth += recovery;
						System.out.println("Your health has been restored by" + recovery + "HEALTH");

					} else if (kappahealth > 0) {
						int kappaATK = kappadamage;
						Mhealth -= kappaATK;
						System.out.println("KAPPA attacks" + kappaATK + "Damage");
					}
					if (kappahealth <= 0) {

						break;
					} else if (Mhealth <= 0) {
						System.out.println("YOU've been defeated!!");
						System.out.println("  ");
						break;
					}

				}
				if (kappahealth <= 0) {
					System.out.println("YOU've passed the level 1");
					System.out.println("  ");
					break;
				} else if (Mhealth <= 0) {
					System.out.println("GAME OVER ");
					break;
				}

				//	}	this is level 1 end 		

			} //type
				// this is level 2
			while (kappahealth <= 0) {
				System.out.println("You've reached on level 2");
				System.out.println("All of your stats has been add by 10");
				System.out.println("  ");
				Mhealth = 100;

				System.out.println("メイジ's STATS");
				System.out.println("  ");
				System.out.println("HEALTH:100 DAMAGE:40 RECOVERY:15");
				System.out.println("  ");
				System.out.println("レベル2のモンスター「鬼👹」が現れた！");
				System.out.println(" ");
				System.out.println("鬼's STATS");
				System.out.println("HEALTH:150 DAMAGE:30 RECOVERY:+5");
				System.out.println(" ");
				Ohealth = 150;

				System.out.println("⚔️ 戦闘が始まる！");

				while (Mhealth > 0 || Ohealth > 0) {
					Mdamage = r.nextInt((25) + 1) + 10;
					Mrecovery = r.nextInt((5) + 1) + 10;
					recovery = 0;
					Odamage = r.nextInt((30) + 1);
					Orecovery = r.nextInt((5) + 1);
					System.out.println(name + "'s Health:" + Mhealth);
					System.out.println("   ");
					System.out.println("Oni's Health:" + Ohealth);
					System.out.println("Oni is recovering" + Orecovery + "HEALTH");
					System.out.println("   ");
					System.out.println("行動を選んでください");
					System.out.println("1:attack 2:Heal");
					int action = scanInt.nextInt();
					System.out.println("   ");

					if (action == 1) {
						int attack = Mdamage;
						Ohealth -= attack;
						System.out.println(name + "attacks!!" + attack + "Damage");
					} else if (action == 2) {

						recovery += Mrecovery;
						System.out.println(name + " recovery !" + recovery + " Health");
					} else {
						System.out.println("Please enter a valid number");
					}
					if (recovery > 0 && Ohealth > 0) {
						int OATK = Odamage;
						Mhealth -= OATK;
						System.out.println("ONI attacks " + OATK + " Damage");
						Mhealth += recovery;
						System.out.println("Your health has been restored by " + recovery + " HEALTH");
					} else if (Ohealth > 0) {
						int OATK = Odamage;
						Mhealth -= OATK;
						System.out.println("ONI attacks " + OATK + " Damage");
					}
					if (Ohealth <= 0) {

						break;
					} else if (Mhealth <= 0) {
						System.out.println("YOU've been defeated!!");
						break;
					}

				}
				if (Ohealth <= 0) {
					System.out.println("YOU've passed the level 2");
					System.out.println("Congratulations");
					System.out.println("YOU've now clear all the levels");
					break;
				} else if (Mhealth <= 0) {
					System.out.println("GAME OVER ");
					break;
				}
				break;
			}
			//this is W level2 end

			// this is Mage

		} //player type

		//		} //player nums

	}

}
