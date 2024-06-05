package com.miage.calendar_services.repository;

import com.miage.calendar_services.document.Calendar;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface CalendarRepository extends MongoRepository<Calendar, String> {
    List<Calendar> findBySport(String sport);
    List<Calendar> findByDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}
