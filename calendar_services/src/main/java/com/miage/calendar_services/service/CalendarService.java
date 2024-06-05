package com.miage.calendar_services.service;

import com.miage.calendar_services.document.Calendar;
import com.miage.calendar_services.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private CalendarRepository calendarRepository;

    public List<Calendar> getCalendarBySport(String sport) {
        return calendarRepository.findBySport(sport);
    }

    public List<Calendar> getCalendarByDate(LocalDateTime startDate, LocalDateTime endDate) {
        return calendarRepository.findByDateBetween(startDate, endDate);
    }
}
