import java.util.HashMap;

public class HashMapDemo extends Thread {
	
	static HashMap<Integer, String> map = new HashMap<>();
	public void run()
	{
		map.put(111,"Lmn");
		
		try
		{
			Thread.sleep(1000);
			
			
			
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Child thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		map.put(101, "Abc");
		map.put(102, "Cde");
		map.put(103, "Pqr");
		
		HashMapDemo thread = new HashMapDemo();
		thread.start();
		
		for ( Object obj : map.entrySet())
		{
			System.out.println(obj);
			Thread.sleep(1000);
		}
		System.out.println(map);
		

	}

}
