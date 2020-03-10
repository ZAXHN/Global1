package mx.edu.utng.anime.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.edu.utng.anime.entity.Anime;
import mx.edu.utng.anime.repository.IAnimeRepository;


@Service
public class AnimeService {

		private IAnimeRepository service;		
		
		public AnimeService(IAnimeRepository service) {
		super();
		this.service = service;
	}


		public Anime save(Anime p) {
			return service.save(p);
		}
		
		
		public void deleteById(Long id) {
			service.deleteById(id);
		}
		
		
		public List<Anime> findAll(){
			return service.findAll();
		}
		
		
		public Optional<Anime> findById(Long id){
			return service.findById(id);
		}
}
