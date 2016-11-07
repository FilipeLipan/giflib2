package com.filipeLipan.controller;

import com.filipeLipan.data.CategoryRepository;
import com.filipeLipan.data.GifRepository;
import com.filipeLipan.model.Category;
import com.filipeLipan.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by lispa on 02/11/2016.
 */
@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }

    @RequestMapping("/search")
    public String searchGifs(@RequestParam("q") String name , ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.returnSearch(name);
        modelMap.put("gifs", allGifs);
        return "home";
    }

    //URL => http://localhost:8080/gif/android-explosion <-- name variable
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name , ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
