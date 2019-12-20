package com.codegym.cms.controller;

import java.util.List;

import com.codegym.cms.entity.Blog;
import com.codegym.cms.exception.ResourceNotFoundException;
import com.codegym.cms.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/blog")
public class BlogController {

    private static final Logger LOG = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public String listBlog(Model theModel) {
        List<Blog> theBlog = blogService.getBlog();
        theModel.addAttribute("blog", theBlog);
        return "list-blog";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show customer-form handler method");
        Blog theBlog = new Blog();
        theModel.addAttribute("blog", theBlog);
        return "blog-form";
    }

    @PostMapping("/saveBlog")
    public String saveBlog(@ModelAttribute("blog") Blog theBlog) {
        blogService.saveBlog(theBlog);
        return "redirect:/blog/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("blogId") int theId,
                                    Model theModel) throws ResourceNotFoundException {
        Blog theBlog = blogService.getBlog(theId);
        theModel.addAttribute("blog", theBlog);
        return "blog-form";
    }

    @GetMapping("/delete")
    public String deleteBlog(@RequestParam("blogId") int theId) throws ResourceNotFoundException {
        blogService.deleteBlog(theId);
        return "redirect:/blog/list";
    }}

