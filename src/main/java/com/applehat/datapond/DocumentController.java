package com.applehat.datacup;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

	private static final String template = "Hello, %s!";


	@GetMapping("/documents")
	public Document document(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Document("fakeid", String.format(template, name), "foo");
	}


}