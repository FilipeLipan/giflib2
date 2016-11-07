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

import java.util.List;

/**
 * Created by lispa on 02/11/2016.
 */
@Controller
public class CategoryController {
    @Autowired
    private GifRepository gifRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @RequestMapping("/categories")
    public String categories(ModelMap modelMap){
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String categoryId(@PathVariable int id , ModelMap modelMap){
        Category category = categoryRepository.findById(id);
        List<Gif> allGifs = gifRepository.getGifsByCategory(category);
        modelMap.put("category", category);
        modelMap.put("gifs", allGifs);
        return "category";
    }
}
