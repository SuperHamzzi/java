package sec02_createandstartthread.EX01;




class SMIFileThread extends Thread {
	String[] strArray = { "하나", "둘", "셋", "넷", "다섯" };
	public void run() {
	for (int i = 0; i < strArray.length; i++) {
		System.out.println("-(자막프레임)" + strArray[i]);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
	}
	}
	
}




public class CreateAndStartThread_M1C1 {
//#1 방법1 Thread 클래스 상속하여 클래스 생성 case1: 2개의 쓰레드 생성
	public static void main(String[] args) {
		//SMIFileThread 객체 생성 및 시작
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		
		
		// #1 비디오프레임 1~5
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

