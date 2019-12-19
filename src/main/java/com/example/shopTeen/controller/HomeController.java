package com.example.shopTeen.controller;

import java.util.List;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.shopTeen.entity.Banner;
import com.example.shopTeen.entity.Category;
import com.example.shopTeen.entity.DisplayPosition;
import com.example.shopTeen.entity.Support;
import com.example.shopTeen.entity.Topic;
import com.example.shopTeen.repository.BannerRepository;
import com.example.shopTeen.repository.CategoryRepository;
import com.example.shopTeen.repository.SupportRepository;
import com.example.shopTeen.repository.TopicRepository;
import com.example.shopTeen.service.DisplayPositionService;
import com.example.shopTeen.service.ProductService;
import com.example.shopTeen.vm.ProductVM;




@RestController
public class HomeController {
	@Autowired
	private ProductService productService;
	@Autowired
	private BannerRepository banner;
	@Autowired
	private DisplayPositionService displayPositionService;
	@Autowired
	private SupportRepository supportRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private TopicRepository topicRepository;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView HomeX(Model model) {
		List<Banner> theBanner = banner.findAll();
		model.addAttribute("banners", theBanner);
		List<ProductVM> abc = productService.listHome();		
		 model.addAttribute("test", abc);	 
		//get list danh muc
		List<DisplayPosition> theDisplay = displayPositionService.getAll();
		model.addAttribute("displays", theDisplay);
		
		 List<Support> supports = supportRepository.LstSupport();
		 model.addAttribute("supports", supports);	
		ModelAndView md = new ModelAndView("/home/index");
		 return md;
	}
	@RequestMapping(value="/home/display_home_binding", method = RequestMethod.GET)
    public ModelAndView Helo(Model model,HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		List<ProductVM> theProduct = productService.lstProductHome(id);
	    model.addAttribute("products", theProduct);		
	    ModelAndView mav = new ModelAndView("home/_list-home-products");
        return mav;
    }
	
	
	@GetMapping("/home/menu-binding")
	public ModelAndView Menu(Model model) {
		List<Topic> topics = topicRepository.findAll();
		
		List<Category> category = categoryRepository.findAll();
		model.addAttribute("menutopics", topics);
		model.addAttribute("menucategories", category);
		  ModelAndView menu = new ModelAndView("/shared/_menu");
		return menu;
	}
	
}
