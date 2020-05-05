package za.co.discovery.assignment.radhikapather.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class PlanetNames {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String planetNode;
    private String planetSourceName;

    private String destinationPlanetName;


    public String getDestinationPlanetName() {
        return destinationPlanetName;
    }
    public void setDestinationPlanetName(String destinationPlanetName) {
        this.destinationPlanetName = destinationPlanetName;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPlanetNode() {
        return planetNode;
    }
    public void setPlanetNode(String planetNode) {
        this.planetNode = planetNode;
    }
    public String getPlanetSourceName() {
        return planetSourceName;
    }
    public void setPlanetSourceName(String planetName) {
        this.planetSourceName = planetName;
    }
}
