package singleton;

public class SingletonByBillPugh {
	
private SingletonByBillPugh(){
		
	}
	
	private static class SingletonHolder{
		private static final SingletonByBillPugh inst = new SingletonByBillPugh();
	}
	
	public static SingletonByBillPugh getInstance() {
		return SingletonHolder.inst;
	}

}