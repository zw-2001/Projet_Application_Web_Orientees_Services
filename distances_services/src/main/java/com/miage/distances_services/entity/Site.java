package com.miage.neo4j.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import java.util.Set;

@Node
public class Site {
    @Id
    private String name;
    private double latitude;
    private double longitude;

    @Relationship(type = "LOCATED_AT", direction = Relationship.Direction.INCOMING)
    private Set<Event> events;

    @Relationship(type = "DISTANCE_TO")
    private Set<Distance> distances;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Set<Distance> getDistances() {
        return distances;
    }

    public void setDistances(Set<Distance> distances) {
        this.distances = distances;
    }}


