package com.roo.team19.web;
import com.roo.team19.domain.Seat;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/seats")
@Controller
@RooWebScaffold(path = "seats", formBackingObject = Seat.class)
@RooWebFinder
public class SeatController {
}
