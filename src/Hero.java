
public class Hero {
	private String name;
	private int hp;
	final int LEVEL = 10;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	void sleep()
	{
		this.setHp(100);
		System.out.println(this.getName() + "は眠って回復した");
	}
	void sit(int sec)
	{
		this.setHp(this.getHp() + sec);
		System.out.println(this.getName() + "は" + sec + "秒座って回復した");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	void slip()
	{
		this.setHp(this.getHp() - 5);
		System.out.println(this.getName() + "はころんだ");
		System.out.println("5のダメージ");
	}
	void run()
	{
		System.out.println(this.getName() + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.getHp() + "でした");
	}
}
