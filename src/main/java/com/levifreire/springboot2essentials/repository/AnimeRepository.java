package com.levifreire.springboot2essentials.repository;

import java.util.List;

import com.levifreire.springboot2essentials.domain.Anime;

public interface AnimeRepository {
	
	List<Anime> listAll();

}
