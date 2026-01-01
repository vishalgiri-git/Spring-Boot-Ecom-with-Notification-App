package Ecom.Model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "Products")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @NotNull(message = "Product name is Mandatory ,can Not Be Null")
	@NotBlank(message = "Product name is Mandatory")
    @Column(name = "name")
    private String name;
    
    //@NotNull(message = "Product Image is Mandatory ,can Not Be Null")
	//@NotBlank(message = "Product Image is Mandatory")
    @Column(name = "imageUrl")
    private String imageUrl;
    
    @Column(name = "isAvailable")
    private boolean isAvailable=true;
    
    @NotNull(message = "Product description is Mandatory ,can Not Be Null")
  	@NotBlank(message = "Product description is Mandatory")
    @Column(name = "description")
    private String description;

    @NotNull(message = "Product price is Mandatory ,can Not Be Null")
    @Column(name = "price")
    private Double price;
 
    @NotNull(message = "Product category_name is Mandatory ,can Not Be Null")
  	@NotBlank(message = "Product category_name is Mandatory")
    @Column(name = "category_name")
    private String category; 
    

    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<OrderItem> orderItem= new ArrayList<>();;

    @ToString.Exclude
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<Review> reviews= new ArrayList<>();;

 /*   public Product(int i, String acer, String acersprie3993, boolean b, String thisIsTheAcerLaptop, int i1, String laptop) {
    }

*/
 public Product(Integer productId, String name, String imageUrl, boolean isAvailable,
                String description, Double price, String category) {
     this.productId = productId;
     this.name = name;
     this.imageUrl = imageUrl;
     this.isAvailable = isAvailable;
     this.description = description;
     this.price = price;
     this.category = category;
 }
}

