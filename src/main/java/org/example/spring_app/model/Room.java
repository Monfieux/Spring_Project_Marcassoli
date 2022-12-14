package org.example.spring_app.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private Integer floor;

    @Column(nullable=false)
    private String name;

    private Double current_temperature;
    private Double target_temperature;


    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    public Room(){
    }
    public Room(Long id, Integer floor, String name, Double current_temperature, Double target_temperature, Set<Heater> heaters, Set<Window> windows) {
        this.id = id;
        this.floor = floor;
        this.name = name;
        this.current_temperature = current_temperature;
        this.target_temperature = target_temperature;
        this.heaters = heaters;
        this.windows = windows;
    }

    public Room(String name, Long id){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getCurrentTemperature() {
        return this.current_temperature;
    }

    public Set<Window> getWindows() {
        return this.windows;
    }

    public Set<Heater> getHeaters() {
        return this.heaters;
    }

}
