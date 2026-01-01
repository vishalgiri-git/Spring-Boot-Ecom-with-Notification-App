package Ecom.Service;

import java.util.List;

import Ecom.Exception.ProductException;
import Ecom.Model.Product;
import Ecom.ModelDTO.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
	
	public Product addProduct(Product products)throws ProductException;

	public List<Product> addAllProducts(List<Product> products) throws ProductException;
	
	public Product updateProduct(Integer productId,ProductDTO product)throws ProductException;
	
	public List<Product> getProductByName(String name)throws ProductException;
	
	//public Page<Product> getAllProduct(String keyword, String sortDirection, String sortBy, int page, int size)throws ProductException;
	//public Page<Product> getAllProduct(String keyword, String sortDirection, String sortBy)throws ProductException;

	public Page<Product> getAllProductsUsingPagination(Pageable pageable);

	//   @Cacheable(cacheNames = "all-products")
	List<Product> getAllProduct(String keyword, String sortDirection, String sortBy) throws ProductException;

	public List<Product> getProductByCategory(String catagory) throws ProductException;
	
	public void removeProduct(Integer productId)throws ProductException;

	public Product getSingleProduct(Integer productId);

	public List<Product> getProductByNameContaining(String name);

	public List<Product> getProductByPriceBetweenRange(double x, double y);
}
 