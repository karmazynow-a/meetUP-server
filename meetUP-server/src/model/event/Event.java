package model.event;


import java.io.Serializable;
import javax.persistence.*;


/**
 * Class that represents Event table, that contains values like: auto-generated id, name, date,
 * key and author's id. The date should be in format: YYYY-MM-DD hh:mm:ss, stored in String.
 * 
 * The NamedQuery returns list of all records from table.
 * 
 * Class has prepared set of setters and getters.
 */
@Entity
@NamedQuery(name="findEvents", query="SELECT e.id, e.name, e.date, e.key, e.author_id FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String name;
	private String date;
	private String key;
	private Integer author_id;
	
	public Event() {}
	public Event(Integer id, String name, String date, String key, Integer author_id) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.key = key;
		this.setAuthor_id(author_id);
	}
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDate() {return date;}
	public void setDate(String date) {this.date = date;}
	public String getKey() {return key;}
	public void setKey(String key) {this.key = key;}
	public Integer getAuthor_id() {return author_id;}
	public void setAuthor_id(Integer author_id) {this.author_id = author_id;}

}
