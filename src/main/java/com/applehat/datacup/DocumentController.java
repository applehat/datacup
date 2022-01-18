package com.applehat.datacup;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

	private static final String template = "Hello, %s!";


	@GetMapping("/documents")
	public Document document(
			@RequestParam(value = "type", defaultValue = "item") String type, 
			@RequestParam(value = "page", defaultValue = "1") Int page,
			@RequestParam(value = "perPage", defaultValue = "10") Int perPage) {

		return new Document("fakeid", "fakedata", type);
	}

	@GetMapping("/documents/{id}")
	public Document document(@PathVariable String id) {
		return new Document(id, String.format(template, name), "item");
	}

}