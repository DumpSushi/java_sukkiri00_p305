
public class Wizard
{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp<0)
		{
			hp = 0;
		}
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		if(mp<0)
		{
			throw new IllegalArgumentException();
		}
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name==null)
		{
			throw new IllegalArgumentException("name is null");
		}
		if(name.length() < 3)
		{
			throw new IllegalArgumentException("name length min");
		}
		this.name = name;
	}
	public Wand getWand() {
		return wand;
	}
	public void setWand(Wand wand) {
		if(wand==null)
		{
			throw new IllegalArgumentException("wand is null");
		}
		this.wand = wand;
	}

	void heal(Hero h)
	{
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());

		h.setHp((h.getHp() + recovPoint));
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

}
