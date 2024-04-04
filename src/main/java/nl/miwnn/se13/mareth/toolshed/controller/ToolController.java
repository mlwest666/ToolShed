package nl.miwnn.se13.mareth.toolshed.controller;


import nl.miwnn.se13.mareth.toolshed.model.Tool;
import nl.miwnn.se13.mareth.toolshed.repositories.ToolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/tool/new")
    private String showToolForm(Model model) {
        model.addAttribute("newTool", new Tool());
        return "toolForm";
    }

    @PostMapping("/tool/new")
    private String saveTool(@ModelAttribute("newTool") Tool toolToBeAdded, BindingResult result) {
        // als er geen problemen zijn met result sla toolToBeAdded op.
        if (!result.hasErrors()) {
            toolRepository.save(toolToBeAdded);
        }
        return "redirect:/";

    }

}
