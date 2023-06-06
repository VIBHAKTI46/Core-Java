package methodoverriding;

public class RBI {
	
	public float getInterestRate()
	{
		return 8.3f;
	}
}

class HDFS extends RBI
{
	public float getInterestRate()
	{
		System.out.println(super.getInterestRate());
		return 12.3f;
	}

}