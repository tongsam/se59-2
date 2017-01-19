package com.roo.team19.web;
import com.roo.team19.domain.FlightOneWay;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/flightoneways")
@Controller
@RooWebScaffold(path = "flightoneways", formBackingObject = FlightOneWay.class)
@RooWebFinder
public class FlightOneWayController {
}
