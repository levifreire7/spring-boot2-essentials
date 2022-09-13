package com.levifreire.springboot2essentials.requests;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AnimePostRequestBody {
	@NotEmpty(message = "The anime name cannot be empty")
	private String name;

}
