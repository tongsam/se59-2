package com.roo.team19.web;
import com.roo.team19.domain.NewsOnline;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/newsonlines")
@Controller
@RooWebScaffold(path = "newsonlines", formBackingObject = NewsOnline.class)
@RooWebFinder
public class NewsOnlineController {
}
