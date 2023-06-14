package singleton;

public class BillPughExecutor {

	public static void main(String[] args) {
		
		SingletonByBillPugh sb1 = SingletonByBillPugh.getInstance();
		SingletonByBillPugh sb2 = SingletonByBillPugh.getInstance();
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());

	}

}