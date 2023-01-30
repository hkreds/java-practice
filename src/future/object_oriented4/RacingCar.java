package future.object_oriented4;

import java.util.Random;

class RacingCar extends Thread {
	private final int GOAL = 100;
	private String name;
	private int maxDistance;
	private int engineStop;
	public RacingCar(final String name,int maxDistance,int engineStop) {
		this.name = name;
		this.maxDistance = maxDistance;
		this.engineStop = engineStop;
	}
	@Override
	public void run() {
		int totalMileage = 0;
		int mileage = 0;
		Random r = new Random();
		while (true) {
			try {
				if (r.nextInt(engineStop)==0) {
					System.out.println(name+"がエンストしました！");
					Thread.sleep(3000);
				}else {
					mileage = r.nextInt(maxDistance)+1;
					System.out.println(name+"が"+mileage+"km走行しました！");
					totalMileage += mileage;
					if (totalMileage>=GOAL) {
						break;
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"がゴールしました！！！！！");
	}
}
