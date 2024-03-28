package nl.miwnn.se13.mareth.toolshed.controller;


import nl.miwnn.se13.mareth.toolshed.model.Tool;
import nl.miwnn.se13.mareth.toolshed.repositories.ToolRepository;
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
    private final ToolRepository toolRepository;

    public ToolController(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }

    @GetMapping("/")
    private String showToolOverview(Model model) {

        model.addAttribute("allTools", toolRepository.findAll());
        return "toolOverview";
    }

}
