package sec02_createandstartthread.EX02;

class SMIFileThread extends Thread {
	
	
	public void run() {
		
		String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("-(자막번호)" + strArray[i]);
			
			try {Thread.sleep(200);} catch (InterruptedException e) {	}
		}
	}
}

class VideoFileTread extends Thread{
	@Override
	public void run() {
		
			// #1 비디오프레임 1~5
			int[] intArray = { 1, 2, 3, 4, 5 };
			// #2. 자막 번호 하나~다섯

			// #3. 비디오 프레임 출력
			for (int i = 0; i < intArray.length; i++) {
				System.out.print("(비디오프레임)" + intArray[i]);
				try {		Thread.sleep(200);	} catch (InterruptedException e) {	}

			}
	}
	
	
}

public class CreateAndStartThread_M1C2 {
	public static void main(String[] args) {
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		Thread videoFileThread = new VideoFileTread();
		videoFileThread.start();
	}
}
