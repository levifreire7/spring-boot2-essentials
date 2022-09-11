package com.levifreire.springboot2essentials.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.levifreire.springboot2essentials.domain.Anime;
import com.levifreire.springboot2essentials.requests.AnimePostRequestBody;
import com.levifreire.springboot2essentials.requests.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
	public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

	public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

	public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);

}
