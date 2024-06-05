package com.miage.calendar_services.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "calendrier")
public class Calendar {
    @Id
    private String id;
    private String sport;
    private String site;
    private LocalDateTime date;
    private String event;
}