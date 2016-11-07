package com.filipeLipan.controller;

import com.filipeLipan.data.GifRepository;
import com.filipeLipan.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lispa on 02/11/2016.
 */
@Controller
public class FavoriteController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String favorites(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getFavorites();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
