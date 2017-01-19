package com.roo.team19.web;
import com.roo.team19.domain.SelectFood;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/selectfoods")
@Controller
@RooWebScaffold(path = "selectfoods", formBackingObject = SelectFood.class)
@RooWebFinder
public class SelectFoodController {
}
