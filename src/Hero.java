
public class Hero {
	String name;
	int hp;
	final int LEVEL = 10;

	void sleep()
	{
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
	void sit(int sec)
	{
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座って回復した");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	void slip()
	{
		this.hp -= 5;
		System.out.println(this.name + "はころんだ");
		System.out.println("5のダメージ");
	}
	void run()
	{
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
