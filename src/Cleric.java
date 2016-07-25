import java.util.Random;


public class Cleric {
	String name;
	int hp = 50;
	int mp = 10;
	final int HP_MAX = 50;
	final int MP_MAX = 10;

	void selfAid()
	{
		if ( this.mp >= 5 )
		{
			this.mp -= 5;
			this.hp = HP_MAX;
			System.out.println("selfAit:HP Max, :MP:" + this.mp);
		}
	}
	int pray(int sec)
	{
		int hosei = new Random().nextInt(3);
		int point = sec + hosei;
		int newMP = this.mp + point;
		if ( newMP > MP_MAX )
		{
			newMP = MP_MAX;
		}
		int diff = newMP - this.mp;
		System.out.println("MP Up:" + diff);
		this.mp = newMP;
		return diff;
	}
}
