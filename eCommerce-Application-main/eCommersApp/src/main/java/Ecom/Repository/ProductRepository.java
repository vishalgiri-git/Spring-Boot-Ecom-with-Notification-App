package Ecom.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Ecom.Model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("SELECT p FROM Product p  WHERE p.name like %:prduct%")
	public List<Product> findByName(@Param("prduct") String name);
	
	@Query("SELECT p FROM Product p  WHERE p.category like %:cat%")
	public List<Product> getProductCategoryName(@Param("cat") String category);

	List<Product> findByNameContainingIgnoreCase(String name);


	List<Product> findByPriceBetween(double x, double y);

	List<Product> findAllByNameContainingIgnoreCase(String keyword, Sort sort);
	// method to support pagination.
   // Page<Product> findAllByNameContainingIgnoreCase(String keyword, Pageable  pageable);

//	@Query(value = "SELECT p FROM Product p JOIN Category c ON p.category_id = c.category_id WHERE c.name = :cat", nativeQuery = true)
//	public List<Product> getProductCategoryName(@Param("cat") String category);

	// query to find product which is greater than x Rs

/*
	@Query("SELECT p FROM PRODUCT p WHERE p.price > : price" )
	List<Product> findByPriceGreaterThan(@Param("price") Double amount);
*/

}
