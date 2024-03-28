package nl.miwnn.se13.mareth.toolshed.controller;


import nl.miwnn.se13.mareth.toolshed.model.Tool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mareth Westhoff.
 * Doel
 */
@Controller
public class ToolController {

    @GetMapping("/")
    private String showToolOverview(Model model) {
        List<Tool> tools = new ArrayList<>();

        tools.add(new Tool("Hammer", "Wood"));

        model.addAttribute("allTools", tools);
        return "toolOverview";
    }

}
