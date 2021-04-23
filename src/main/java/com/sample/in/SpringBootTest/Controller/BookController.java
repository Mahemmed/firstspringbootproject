package com.sample.in.SpringBootTest.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping(path="/test")
	public List<Book> getBook() {
		return Arrays.asList(new Book(1, "MindLogic", "B.V Pattabhi Ram"));
	}
}
