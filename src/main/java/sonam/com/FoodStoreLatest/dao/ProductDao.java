package sonam.com.FoodStoreLatest.dao;

import sonam.com.FoodStoreLatest.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> productList;
    public List<Product> getProductList()
    {
        Product product1=new Product();
        product1.setProductId("ID01");
        product1.setProductName("Veggie Burger");
        product1.setProductCategory("Burgers");
        product1.setProductDescription("Burger is made from special ingrediants beans, " +
                "especially soybeans and tofu, nuts, grains, seeds or mushrooms or mycoprotein.");
        product1.setProductPrice(15);
        product1.setProductCondition("Authentic dish");
        product1.setProductStatus("Active");
        product1.setUnitInStock(200);
        product1.setProductManufacturer("Britannia Foods");

        Product product2=new Product();
        product2.setProductId("ID02");
        product2.setProductName("Chicken Burger");
        product2.setProductCategory("Burgers");
        product2.setProductDescription("Burger made of Mix ground chicken,  bread crumbs, " +
                "onion, egg, garlic, salt, and black pepper");
        product2.setProductPrice(17);
        product2.setProductCondition("Made with special ingrediants and spices");
        product2.setProductStatus("Active");
        product2.setUnitInStock(20);
        product2.setProductManufacturer("Jubiliant foods and Halal chicken");

        Product product3=new Product();
        product3.setProductId("ID03");
        product3.setProductName("Veggie Wonder Pizza");
        product3.setProductCategory("Pizza");
        product3.setProductDescription("Pizza is made from special ingrediants  " +
                "such as tofu, nuts, grains, seeds, mushrooms, cheese and butter");
        product3.setProductPrice(17);
        product3.setProductCondition("Made with special ingrediants and spices");
        product3.setProductStatus("Active");
        product3.setUnitInStock(20);
        product3.setProductManufacturer("Jubiliant foods");

        Product product4=new Product();
        product4.setProductId("ID04");
        product4.setProductName("Non-veg paradise Pizza");
        product4.setProductCategory("Pizza");
        product4.setProductDescription("Pizza is made from special ingrediants  " +
                "such as cheese,butter and halal chicken");
        product4.setProductPrice(17);
        product4.setProductCondition("Made with special ingrediants and spices");
        product4.setProductStatus("Active");
        product4.setUnitInStock(20);
        product4.setProductManufacturer("Jubiliant foods");

        Product product5=new Product();
        product5.setProductId("ID05");
        product5.setProductName("Ginger garlic breads");
        product5.setProductCategory("Special Breads");
        product5.setProductDescription("Made from special wheat and almond batter  " +
                "added with cheese, butter, ginger and garlic");
        product5.setProductPrice(17);
        product5.setProductCondition("Made with special ingrediants");
        product5.setProductStatus("Active");
        product5.setUnitInStock(20);
        product5.setProductManufacturer("Jubiliant foods");

        Product product6=new Product();
        product6.setProductId("ID06");
        product6.setProductName("Coke or icecreams");
        product6.setProductCategory("Sides");
        product6.setProductDescription("Manufactured by certified vendors");
        product6.setProductPrice(10);
        product6.setProductCondition("Quantity sufficient for one");
        product6.setProductStatus("Active");
        product6.setUnitInStock(200);
        product6.setProductManufacturer("Pepsico holdings");

        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        return productList;
    }
    public Product getProductById(String productId) throws IOException
    {
        for (Product product: getProductList())
        {
            if(product.getProductId().equals(productId))
            {
                return product;
            }
        }
       throw new IOException("No products found");
    }
}