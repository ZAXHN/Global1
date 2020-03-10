package mx.edu.utng.anime.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utng.anime.entity.Anime;
import mx.edu.utng.anime.service.AnimeService;

@RestController
@RequestMapping("/anime")
public class AnimeController {
	
	private AnimeService service;

	
	public AnimeController(AnimeService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	private ResponseEntity<List<Anime>> listar(){
		return ResponseEntity.ok(service.findAll());
	}
	@PostMapping
	public ResponseEntity<Anime> create(@Valid @RequestBody Anime ani){
		return ResponseEntity.ok(service.save(ani));
	}
	@GetMapping("/={id}")
	public ResponseEntity<Anime> findById(@PathVariable Long id){
		Optional<Anime> bi = service.findById(id);
		if(!bi.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(bi.get());
	}
	@DeleteMapping("/={id}")
	public ResponseEntity<Anime> delete(@PathVariable Long id){
		if(!service.findById(id).isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		service.deleteById(id);
		return ResponseEntity.badRequest().build();
	}
}
