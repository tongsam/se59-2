package com.roo.team19.web;
import com.roo.team19.domain.Baggage;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/baggages")
@Controller
@RooWebScaffold(path = "baggages", formBackingObject = Baggage.class)
@RooWebFinder
public class BaggageController {
}
