package com.winhong.bookstore.web;

import com.winhong.bookstore.common.RankType;
import com.winhong.bookstore.entity.Book;
import com.winhong.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    BookService bookService;

	@RequestMapping(method = RequestMethod.GET, value = "index")
	public String index(ModelMap model) {
        // 畅销书
        List<Book> popularBooks = bookService.rankBooks(6, RankType.BUY);
        // 新书
        List<Book> newestBooks = bookService.rankBooks(6, RankType.NEW);
        model.addAttribute("pupolarBooks", popularBooks);
        model.addAttribute("newestBooks", newestBooks);
        return "homepage";
    }

	@RequestMapping(method = RequestMethod.GET, value = "register")
	public String register(ModelMap model) {

		return "register";
	}
}
