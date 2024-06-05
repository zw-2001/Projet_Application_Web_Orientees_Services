package com.miage.neo4j.service;

import com.miage.neo4j.entity.Event;
import com.miage.neo4j.repository.EventRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(String event) {
        return eventRepository.findById(event).orElse(null);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Event event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(String event) {
        eventRepository.deleteById(event);
    }
}

