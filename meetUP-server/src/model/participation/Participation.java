package model.participation;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Class that represents Participation table, that contains values like: person's and event's id,
 * that are composite key of the class.
 * 
 * The NamedQuery returns list of all records from table.
 * 
 * Class has prepared set of setters and getters.
 * 
 * @see		CompositeKey
 */
@Entity
@IdClass(CompositeKey.class)
@NamedQuery(name="findParticipations", query="SELECT p.person_id, p.event_id FROM Participation p")
public class Participation implements Serializable {
	private static final long serialVersionUID = 1L;
	  
	@Id
	private Integer person_id;
	@Id
	private Integer event_id;
	
	public Participation() {}
	public Participation(Integer person_id, Integer event_id) {
		this.person_id = person_id;
		this.event_id = event_id;
	}
	
	public Integer getEvent_id() {return event_id;}
	public void setEvent_id(Integer event_id) {this.event_id = event_id;}
	public Integer getPerson_id() {return person_id;}
	public void setPerson_id(Integer person_id) {this.person_id = person_id;}
	
}
