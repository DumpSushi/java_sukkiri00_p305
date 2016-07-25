public class Wand {
	private String name;
	private double power;

	public void setName(String name)
	{
		if (name==null)
		{
			throw new IllegalArgumentException("name is null");
		}
		this.name = name;
		if(name.length() < 3)
		{
			throw new IllegalArgumentException("name length min");
		}
	}
	public String getName()
	{
		return this.name;
	}
	public void setPower(double val)
	{
		if (val < 0.5 || val > 100.0)
		{
			throw new IllegalArgumentException("invalid power:" + val);
		}
		this.power = val;
	}
	public double getPower()
	{
		return this.power;
	}

}
