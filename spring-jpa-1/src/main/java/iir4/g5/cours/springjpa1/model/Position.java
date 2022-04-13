package iir4.g5.cours.springjpa1.model;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "Position")
public class Position {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private double latitude;
    private double longitude;
    @Column(unique = true)
    private String imei;
    private String Date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    public Position() {

    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
