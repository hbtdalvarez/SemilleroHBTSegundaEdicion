/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidad.Comic;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * los comics
 * 
 * @author ccastano
 * @version
 */
@Stateless
public class GestionarComicBean implements IGestionarComicLocal {

	/**
	 * Atributo em que se usa para interacturar con el contexto de persistencia.
	 */
	@PersistenceContext
	private EntityManager em;

	/**
	 * 
	 * Metodo encargado de crear un nuevo comic con informacion por defecto
	 * 
	 * @author ccastano
	 *
	 */
	public void crearComic(ComicDTO comicNuevo) {
		//Entidad nueva 
		Comic comic = new Comic();
		comic.setId(comicNuevo.getId());
		//Se almacena la informacion y se maneja la enidad comic
		em.persist(comicNuevo);
	}

	/**
	 * 
	 * Metodo encargado de cambiar el nombre a un comic con el mismo id
	 * 
	 * @author ccastano
	 * 
	 * @param comicModificar
	 */
	public void modificarComic(Comic comicModificar) {
		em.merge(comicModificar);
	}

	/**
	 * 
	 * Metodo encargado de eliminar un elemento determinado de la lista de comic
	 * 
	 * @param comicEliminar
	 */
	public void eliminarComic(Comic comicEliminar) {
		em.remove(comicEliminar);
	}

	/**
	 * 
	 * Metodo encargado de retornar un comic dado un id determinadao
	 * 
	 * @param idComic identificador del comic a ser buscado
	 * @return comic encontrado
	 */
	public ComicDTO consultarComic(String idComic) {
		Comic comic = null;
		comic = new Comic();
		comic = em.find(Comic.class, idComic);

		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId(comic.getId());
		comicDTO.setNombre(comic.getNombre());
		return comicDTO;
	}

	// Sobreescribir un metod, sobrecargar
	public List<ComicDTO> consultarComic() {

		List<Comic> resultados = (List<Comic>) em.createQuery("select c from Comic").getResultList();
		return null;
	}

}
