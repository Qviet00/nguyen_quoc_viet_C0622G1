package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/")
    public String list(@PageableDefault (size = 5) Pageable pageable, Model model) {
        model.addAttribute("blogList", iBlogService.findAll(pageable));
        model.addAttribute("category",iCategoryService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("category",iCategoryService.findAll());
        return "create";
    }

    @PostMapping("/saveCreate")
    public String saveCreate(@ModelAttribute Blog blog) {
        iBlogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        iBlogService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam int id, Model model) {
        Optional<Blog> blog = iBlogService.findId(id);
        model.addAttribute("blog", blog.get());
        model.addAttribute("category",iCategoryService.findAll());
        return "update";
    }

    @PostMapping("/saveUpdate")
    public String saveUpdate(@ModelAttribute Blog blog) {
        iBlogService.update(blog);
        return "redirect:/";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam int id, Model model) {
        Optional<Blog> blog = iBlogService.findId(id);
        model.addAttribute("blog", blog.get());
        return "detail";
    }
    @GetMapping ("/search")
    public String search (@RequestParam(defaultValue = "") String categoryId, Model model,@PageableDefault (size = 5)Pageable pageable) {
        model.addAttribute("blogList", iBlogService.findAllByCategoryBlog_NameOfCategoryContains(pageable,categoryId));
        model.addAttribute("category",iCategoryService.findAll());
        return "list";
    }
}
