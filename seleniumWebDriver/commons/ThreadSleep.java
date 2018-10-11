package commons;
public class ThreadSleep{

	public void threadSleep(int tempo) {

		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}