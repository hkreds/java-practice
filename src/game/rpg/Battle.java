package game.rpg;

public class Battle {
	public static void main(String[] args) {
		Chara chara1 = new Chara();
		Enemy enemy1 = new Enemy();
		chara1.setHP(29);
		chara1.setATK(12);
		chara1.setDEF(8);
		chara1.setName("勇者");
		enemy1.setHP(16);
		enemy1.setATK(8);
		enemy1.setDEF(16);
		enemy1.setName("スライム");
		chara1.status();
		enemy1.status();
		int turn = 0;
		while(enemy1.getHP()>0&&chara1.getHP()>0) {
			turn++;
			System.out.println("ターン"+turn);
			System.out.println(chara1.getName()+"の攻撃、"+enemy1.getName()+"に"+charaAtk(chara1,enemy1)+"のダメージ");
			enemy1.setHP(enemy1.getHP() - charaAtk(chara1,enemy1));
			if(enemy1.getHP()<=0) {
				enemy1.setHP(0);
				System.out.println(enemy1.getName()+"の残り体力："+enemy1.getHP());
				System.out.println(enemy1.getName()+"は倒れた");
				System.out.println(chara1.getName()+"は勝った‼");
				break;
			}else {
				System.out.println(enemy1.getName()+"の残り体力："+enemy1.getHP());
			}
			System.out.println(enemy1.getName()+"の攻撃、"+chara1.getName()+"に"+enemyAtk(chara1,enemy1)+"のダメージ");
			chara1.setHP(chara1.getHP() - enemyAtk(chara1,enemy1));
			if(chara1.getHP()<=0) {
				chara1.setHP(0);
				System.out.println(chara1.getName()+"の残り体力："+chara1.getHP());
				System.out.println(chara1.getName()+"は倒れた");
				System.out.println(chara1.getName()+"は負けた...");
				break;
			}else {
				System.out.println(chara1.getName()+"の残り体力："+chara1.getHP());
			}
		}
	}
	public static int charaAtk(Chara a,Enemy b) {
		return (a.getATK()/2) - (b.getDEF()/4);
	}
	public static int enemyAtk(Chara a,Enemy b) {
		return (b.getATK()/2) - (a.getDEF()/4);
	}
}