package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
	private LocalDate date;
	private String contents;
	
	//コンストラクタ
	public Task(LocalDate date, String contents) {
		this.date = date;
		this.contents = contents;
	}

	//ゲッター
	public LocalDate getDate() {
		return date;
	}
	public String getContents() {
		return contents;
	}
	
	//compareTo()オーバーライド
	public int compareTo(Task obj) {
		if (this.date.isBefore(obj.date)) {
			return -1;
		}
		if (this.date.isAfter(obj.date)) {
			return 1;
		}
		return 0;
	}
}
