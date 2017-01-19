package com.roo.team19.web;
import com.roo.team19.domain.Members;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/memberses")
@Controller
@RooWebScaffold(path = "memberses", formBackingObject = Members.class)
@RooWebFinder
public class MembersController {
}
