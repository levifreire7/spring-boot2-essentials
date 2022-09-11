package com.levifreire.springboot2essentials.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.levifreire.springboot2essentials.domain.Anime;
import com.levifreire.springboot2essentials.mapper.AnimeMapper;
import com.levifreire.springboot2essentials.repository.AnimeRepository;
import com.levifreire.springboot2essentials.requests.AnimePostRequestBody;
import com.levifreire.springboot2essentials.requests.AnimePutRequestBody;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimeService {

	private final AnimeRepository animeRepository;

	public List<Anime> listAll() {
		return animeRepository.findAll();
	}

	public Anime findById(long id) {
		return animeRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
	}

	public Anime save(AnimePostRequestBody animePostRequestBody) {
		return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
	}

	public void delete(long id) {
		animeRepository.delete(findById(id));
	}

	public void replace(AnimePutRequestBody animePutRequestBody) {
		Anime savedAnime = findById(animePutRequestBody.getId());
		Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
		anime.setId(savedAnime.getId());

		animeRepository.save(anime);
	}

}
