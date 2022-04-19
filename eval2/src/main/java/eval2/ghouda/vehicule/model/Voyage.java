package eval2.ghouda.vehicule.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voyage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double distance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
}
