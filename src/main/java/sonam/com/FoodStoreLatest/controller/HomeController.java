package sonam.com.FoodStoreLatest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sonam.com.FoodStoreLatest.dao.CustomerDao;
import sonam.com.FoodStoreLatest.dao.ProductDao;
import sonam.com.FoodStoreLatest.model.Customer;
import sonam.com.FoodStoreLatest.model.Product;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
    private ProductDao productDao=new ProductDao();
    private CustomerDao customerDao=new CustomerDao();
    @RequestMapping("/")
    public String home(Model model) {
        List<Product> productList=productDao.getProductList();
        //   Product product=productList.get(0);
        model.addAttribute("products",productList);
        return "home";
    }

    @RequestMapping("/viewProduct/{productId}")
    public String ViewProduct(@PathVariable String productId,Model model) throws IOException
    {
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }

    @RequestMapping("/viewCustomer")
    public String viewCustomer(Model model)
    {
        String customer=customerDao.getCustomerName();
        model.addAttribute(customer);
        return "viewCustomer";
    }

    @RequestMapping("/viewCardDetails")
    public String viewCardDetails(Model model)
    {
        String customer=customerDao.getCustomerName();
        model.addAttribute(customer);
        return "viewCardDetails";
    }

}