/*
package Ecom.ServiceImpl;

import Ecom.Exception.ProductException;
import Ecom.Model.Product;
import Ecom.Repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductServiceImpl productService;
    private Product product;

    @BeforeEach
    void setUp(){

    }

    @Test
    void getProductByName_ShouldThrowProductException_WhenNotFound() {
        // Given
        when(productRepository.findByName(anyString()))
                .thenReturn(Collections.emptyList());

        // When & Then
        ProductException exception = assertThrows(ProductException.class, () ->
                productService.getProductByName("Nonexistent Product"));
        assertEquals("Product Not found with name Nonexistent Product", exception.getMessage());
    }

    @Test
    void testGetProductByName_ShouldReturnProduct_WhenFound() throws ProductException{
        // arrange.
        when(productRepository.findByName("realme wired earphone"))
                .thenReturn(List.of(product));
        // act
        List<Product> listOfProducts = productService.getProductByName("realme wired earphone");

        // assert.
        assertNotNull(listOfProducts);
        assertEquals(1, listOfProducts.size());
        assertEquals("realme wired earphone", listOfProducts.get(0).getName());
    }

    @Test
    void testAddProduct_ShouldSaveNewProduct_WhenProductNotNull() throws ProductException{
        // arrange.
        when(productRepository.save(any(Product.class)))
                .then(invocation -> invocation.getArgument(0));
        // act.
        Product savedProduct = productService.addProduct(product);

        // assert.
        assertEquals("realme wired earphone", savedProduct.getName());

    }

    @Test
    void testAddProduct_ShouldThrowException_WhenProductIsNull() throws ProductException{

        // arrange & act.
        ProductException productException =
                assertThrows(ProductException.class, () -> productService.addProduct(null));
        // assert
        assertEquals("Product Can not be Null", productException.getMessage());


    }
}*/
