package com.thithuchanh4.controller;

import com.thithuchanh4.model.City;
import com.thithuchanh4.service.ICityService;
import com.thithuchanh4.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CityController {
    @Autowired
    ICityService cityService;
    @Autowired
    INationService nationService;
    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("nations", nationService.findAll());
    }
    @GetMapping
    public ModelAndView showListCity(){
        ModelAndView modelAndView=new ModelAndView("cityList");
        modelAndView.addObject("list",cityService.findAll());
        return modelAndView;
    }
    @GetMapping("{id}")
    public ModelAndView find1City(@PathVariable Long id){
        ModelAndView modelAndView=new ModelAndView("detailCity");
        modelAndView.addObject("city",cityService.findById(id));
        return modelAndView;
    }
    @GetMapping("create")
    public String createForm(Model model){
        model.addAttribute("city",new City());
        return "save";
    }
    @GetMapping("delete/{city}")
    public ModelAndView showFormDelete(@PathVariable City city){
        ModelAndView modelAndView=new ModelAndView("delete");
        modelAndView.addObject(city);
        return modelAndView;
    }
    @GetMapping("edit/{city}")
    public ModelAndView editForm(@PathVariable City city){
        ModelAndView modelAndView=new ModelAndView("save");
        modelAndView.addObject("city",city);
        return modelAndView;
    }
    @PostMapping("save")
    public String saveCity(@RequestBody City city){
        cityService.save(city);
        return "redirect:";
    }
    @PostMapping("delete/{city}")
    public String deleteCity(@PathVariable City city){
        cityService.delete(city);
        return "redirect:";
    }
}
