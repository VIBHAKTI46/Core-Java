package tnsif.org.thiskeyword;
public class ThisKeywordEx {
	
	private int cvvno ;
	private long atmno;
	
	//parameterised constructor 
	public ThisKeywordEx(int cvvno, long atmno) {
		super();
		//cureent class instance return by this keyword
		this.cvvno = cvvno;
		this.atmno = atmno;
	}
	
	public void print ()
	{
		System.out.println("CVV no is "+cvvno+" atm no "+atmno);
	}
	
	

}
