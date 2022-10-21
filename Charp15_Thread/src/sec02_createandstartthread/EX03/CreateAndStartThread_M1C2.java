package sec02_createandstartthread.EX03;

//#1. 방법2. Runnable 인터페이스로 생성
class SMIFileThread implements Runnable {

	@Override
	public void run() {
		
		String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("-(자막번호)" + strArray[i]);
			
			try {Thread.sleep(200);} catch (InterruptedException e) {	}
		}
	}
		}

class VideoFileRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] intArray = { 1, 2, 3, 4, 5 };
		// #2. 자막 번호 하나~다섯
	

		// #3. 비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오프레임)" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
	


public class CreateAndStartThread_M1C2 {
	public static void main(String[] args) {
		Runnable smiFileThread = new SMIFileThread();
		Thread tr1 = new Thread(smiFileThread);
		tr1.start();
		Runnable vdioFilerThread = new VideoFileRunnable();
		Thread tr  = new Thread(vdioFilerThread);
		tr.start();
		 
		
	}

}
