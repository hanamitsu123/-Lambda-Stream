package practice;
import java.time.LocalDate;

    //Comparableインタフェースを実装
    public class Task implements Comparable<Task> {
    private LocalDate date;
    private String task;
    private boolean done; // 

	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	// boolean型のgetterメソッド
	public boolean isDone() {
		return done;
	}


	// 日付で並び替えるため、LocalDateのcompareToを使用
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	@Override
	public String toString() {
		return this.date + " " + this.task;
	}
}