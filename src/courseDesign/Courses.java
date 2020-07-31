package courseDesign;

public class Courses {
	//private int cid;
	private String subject;
	private String topic;
	private String hasquiz;
	private String content;
	public Courses(){
	}
	public Courses(String subject, String topic, String hasquiz, String content) {
		//this.cid = cid;
		this.subject = subject;
		this.topic = topic;
		this.hasquiz=hasquiz;
		this.content=content;
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
	public String getHasQuiz() {
		return hasquiz;
	}
	public void setHasQuiz(String hasquiz) {
		this.hasquiz = hasquiz;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
