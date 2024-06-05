package com.miage.neo4j.controller;

import com.miage.neo4j.entity.Event;
import com.miage.neo4j.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{event}")
    public Event getEventById(@PathVariable String event) {
        return eventService.getEventById(event);
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PutMapping("/{event}")
    public Event updateEvent(@PathVariable String event, @RequestBody Event eventDetails) {
        eventDetails.setEvent(event);
        return eventService.updateEvent(eventDetails);
    }

    @DeleteMapping("/{event}")
    public void deleteEvent(@PathVariable String event) {
        eventService.deleteEvent(event);
    }
}

