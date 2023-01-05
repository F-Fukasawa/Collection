package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		//タスク インスタンスの生成
		Task task1 = new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。");
		Task task2 = new Task(LocalDate.of(2021, 9, 15), "○○社面談。");
		Task task3 = new Task(LocalDate.of(2021, 12, 4), "手帳を買う。");
		Task task4 = new Task(LocalDate.of(2021, 8, 10), "散髪に行く。");
		Task task5 = new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。");
		
		//リストを作成して要素を追加
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);
		
		//並べ替える
		Collections.sort(tasks);
		
		//タスクを表示
		for (Task task : tasks) {
			System.out.println(task.getDate() + ":" + task.getContents());
		}
	}
}
