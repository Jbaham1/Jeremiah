package com.resume.Jeremiah.controllers;

import com.resume.Jeremiah.models.Item;
import com.resume.Jeremiah.repo.ItemRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ShopController {
    private final ItemRepo itemDao;

    public ShopController(ItemRepo itemDao) {
        this.itemDao = itemDao;
    }


    @GetMapping("/shop")
    public String welcome() {
        return "shop/home";
    }
    @GetMapping("/shop")
    public String seeAllItems(Model viewModel){
        List<Item> items = itemDao.findAll();
        viewModel.addAttribute("item", itemDao);
        return "shop/index";
    }
//    @GetMapping("/shop/item/{id}")
//    public String showOneItem(@PathVariable Long id, Model vModel){
//        vModel.addAllAttributes("item", itemDao.getOne(id));
//        return "shop/show";
//    }
//
//
//        @GetMapping("/shop/item/create")
//        public String viewItemForm(Model model) {
//        model.addAllAttributes( new Item());
//            return "shop/create";
//        }
}