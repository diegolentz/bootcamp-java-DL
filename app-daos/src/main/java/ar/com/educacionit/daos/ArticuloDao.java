package ar.com.educacionit.daos;

import java.util.List;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Articulo;

/**
 * 
 * @author LopezCar
 *
 */
public interface ArticuloDao {

	//definir los metodos CRUD
		public Articulo save(Articulo orden);
		public Articulo getByPK(Long pk) throws GenericException, GenericException;
		public void update(Articulo ordenToUpdate) throws GenericException;
		public void delete(Long pk) throws GenericException, GenericException;
		List<Articulo> findAll() throws GenericException;
 }