package com.levifreire.springboot2essentials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.levifreire.springboot2essentials.domain.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long>{

}
