package model.participation;

import java.io.Serializable;

/**
 * Composite key class prepared for Participation table. It contains values like person's and event's id, that
 * will identify one's participation in particular event.
 * 
 * Class has prepared set of setters and getters, and also override methods, like equals and hashCode.
 * 
 * @see		Participation
 */
public class CompositeKey implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer person_id;
	private Integer event_id;
	
	public CompositeKey() {
		setPerson_id(-1);
		setEvent_id(-1);
	}
	
	public CompositeKey(Integer person_id, Integer event_id) {
		setPerson_id(person_id);
		setEvent_id(event_id);
	}
	
	public Integer getPerson_id() {return person_id;}
	public void setPerson_id(Integer person_id) {this.person_id = person_id;}
	public Integer getEvent_id() {return event_id;}
	public void setEvent_id(Integer event_id) {this.event_id = event_id;}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (person_id ^ (person_id >>> 32));
        result = prime * result + (int) (event_id ^ (event_id >>> 32));
        return result;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        CompositeKey other = (CompositeKey) obj;
        if (person_id != other.person_id) {
            return false;
        }
        if (event_id != other.event_id) {
            return false;
        }
        return true;
    }
}