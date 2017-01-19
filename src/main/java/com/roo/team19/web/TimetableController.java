package com.roo.team19.web;
import com.roo.team19.domain.Timetable;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/timetables")
@Controller
@RooWebScaffold(path = "timetables", formBackingObject = Timetable.class)
@RooWebFinder
public class TimetableController {
}
