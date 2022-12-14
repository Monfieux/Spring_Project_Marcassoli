package org.example.spring_app.model;

import javax.persistence.*;

@Entity
@Table(name = "RWINDOW")
public class Window {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private WindowStatus windowStatus;


    @ManyToOne
    @JoinColumn(nullable = false)
    private Room room;

    public Window() {
    }

    public Window(String name, WindowStatus windowStatus, Room room) {
        this.windowStatus = windowStatus;
        this.name = name;
        this.room = room;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WindowStatus getWindowStatus() {
        return windowStatus;
    }

    public void setWindowStatus(WindowStatus windowStatus) {
        this.windowStatus = windowStatus;
    }

    public Room getRoom() {
        return this.room;
    }
}