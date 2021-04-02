package chapter7;

public class MyThread1 implements Runnable {
	@Override
	public void run() {
		long[] time = new long[2];
		
		// 첫 번째 작업을 시작하기 전의 시간
		long start = System.currentTimeMillis();
	
		int count = 0;
		for(int i=0; i<100000; i++) {
			count++;
			
			if(count % 50 == 0) {
				System.out.println();
			} // end if
			
			System.out.println("-");
		
		} // end for
		
		// 첫 번째 작업 후의 시간
		long end = System.currentTimeMillis();
		// 첫 번째 작업의 소요 시간
		time[0] = end - start;

		// 두 번째 작업을 시작하기 전의 시간
		start = System.currentTimeMillis();
			
		count = 0;
			for(int i=0; i<100000; i++) {
				count++;
					
				if(count % 50 == 0) {
					System.out.println();
				} // end if
					
				System.out.println("-");
				
			} // end for
			
		// 두 번째 작업 후의 시간
		end = System.currentTimeMillis();
		// 두 번째 작업의 소요 시간
		time[1] = end - start;		
				
		System.out.println("소요시간1 = " + time[0]);
		System.out.println("소요시간2 = " + time[1]);
	
	}
	
}
