package com.filipeLipan.data;

import com.filipeLipan.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lispa on 02/11/2016.
 */
@Component
public class CategoryRepository {
    //repository with all categories
    private static List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"Technology"),
            new Category(2,"People"),
            new Category(3,"Destruction")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }

    public Category findById(int id){
        for(Category category : ALL_CATEGORIES){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }
}
