package common;

public class ChipUtils {
	public static final int NORMAL = 9000;
	public static final int DEMO = 6000;
	
	public static void pause(int milliSeconds, String msg) {
		try {
			Thread.sleep(milliSeconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void pauseNormal() {
		pause(NORMAL, "");
	}
	
	public static void pauseNormal(String msg) {
		System.out.println("Next step: " + msg);
		pause(NORMAL, msg);
	}
	
	public static void pauseDemo() {
		pause(DEMO, "");
	}

	public static void pauseDemo(String msg) {
		System.out.println("Next step: " + msg);
		//pause(DEMO, msg);
	}
}
