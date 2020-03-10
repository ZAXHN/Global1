package mx.edu.utng.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utng.anime.entity.Anime;

public interface IAnimeRepository extends JpaRepository<Anime, Long>{

}
