package com.miage.calendar_services.controller;

import com.miage.calendar_services.document.Calendar;
import com.miage.calendar_services.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @GetMapping("/calendar/sport/{sport}")
    public List<Calendar> getCalendarBySport(@PathVariable String sport) {
        return calendarService.getCalendarBySport(sport);
    }

    @GetMapping("/calendar/date")
    public List<Calendar> getCalendarByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(LocalTime.MAX);
        return calendarService.getCalendarByDate(startOfDay, endOfDay);
    }

}
