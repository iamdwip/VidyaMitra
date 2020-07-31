package courseDesign;

public class Results {
	//private int cid;
	private String subject;
	private String topic;
	private String username;
	private String attemptdate;
	private int score;
	private int totalscore;
	public Results(){
	}
	public Results(String username, String subject, String topic,int score, String attemptdate, int totalscore) {
		this.username = username;
		this.subject = subject;
		this.topic = topic;
		this.score=score;
		this.attemptdate=attemptdate;
		this.totalscore=totalscore;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setsubject(String subject) {
		this.subject = subject;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAttemptDate() {
		return attemptdate;
	}
	public void setAttemptDate(String attemptdate) {
		this.attemptdate = attemptdate;
	}
	public int getTotalScore() {
		return totalscore;
	}
	public void setTotalScore(int totalscore) {
		this.totalscore = totalscore;
	}
		
}
