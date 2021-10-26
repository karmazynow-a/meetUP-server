package model.comment;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Class that represents Comment table, that contains values like: auto-generated id, author's id, event's id, 
 * date and content. The date should be in format: YYYY-MM-DD hh:mm:ss, stored in String.
 * 
 * The NamedQuery returns list of all records from table.
 * 
 * Class has prepared set of setters and getters.
 */
@Entity
@NamedQuery(name="findComments", query="SELECT c.id, c.author_id, c.event_id, c.content, c.date FROM Comment c")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer author_id;
	private Integer event_id;
	private String date;
	private String content;
	
	public Comment() {}
	public Comment(Integer id, Integer author_id, Integer event_id, String content, String date) {
		this.id = id;
		this.author_id = author_id;
		this.event_id = event_id;
		this.content = content;
		this.date = date;
	}
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public Integer getAuthor_id() {return author_id;}
	public void setAuthor_id(Integer author_id) {this.author_id = author_id;}
	public Integer getEvent_id() {return event_id;}
	public void setEvent_id(Integer event_id) {this.event_id = event_id;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getDate() {return date;}
	public void setDate(String date) {this.date = date;}
}
