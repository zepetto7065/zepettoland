package me.zepetto.zepettoland.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board/list")
    public String getList(Model model){
        model.addAttribute("name", "test");
        return "board/list";
    }

}
