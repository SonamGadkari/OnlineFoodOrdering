package sonam.com.FoodStoreLatest.model;

public class Product {
    private String productId;
    private String productName;
    private String productCategory;
    private String productDescription;
    private double productPrice;
    private String productCondition;
    private String productStatus;
    private int unitInStock;
    private String productManufacturer;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }
}