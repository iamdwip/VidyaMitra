package courseDesign;

public class Questions {
	private int id;
	private String subject;
	private String topic;
	private String questionBody;
	private String choice1;
	private String choice2;
	private String choice3;
	private String key;
	public Questions(){
	}
	public Questions(int id, String subject, String topic, String questionBody, String choice1,String choice2,String choice3,String key) {
		this.id = id;
		this.subject = subject;
		this.topic = topic;
		this.questionBody = questionBody;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.key = key;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getQuestionBody() {
		return questionBody;
	}
	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}
	public String getChoice1() {
		return choice1;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	public String getChoice3() {
		return choice3;
	}
	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}
