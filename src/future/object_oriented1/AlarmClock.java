package future.object_oriented1;

public class AlarmClock extends Clock {
	private int alarmHour;
	private int alarmMinute;
	public AlarmClock(int hour, int minute, int second,int alarmHour,int alarmMinute) {
		super(hour, minute, second);
		this.alarmHour = alarmHour;
		this.alarmMinute = alarmMinute;
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("アラーム設定時刻："+alarmHour+"時"+alarmMinute+"分");
	}
}
