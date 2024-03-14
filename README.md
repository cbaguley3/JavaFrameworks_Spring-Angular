<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

All changes/commits will be noted here. Each note will include a prompt, file name, line number, and change.

C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
1. prompt: centered text, file name: mainscreen.html, line number: 18, change:  **style="text-align: center;"**
2. prompt: changed background and font color, file name: mainscreen.html, line number: 18, change:  **style="background-color: black; color: azure;" to body tag**
3. prompt: changed font color, file name: mainscreen.html, line number: 16, change:  **style="background-color: black; color: azure;"**
4. prompt: changed table color, file name: mainscreen.html, line number: 32 & 68, change: **style="color: azure;"**


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
1. prompt: created html file, updated the title and created header with h1, file name: aboutUs.html, line number: 5 & 11, change: <title>About Us</title> && <header><h1>Welcome to Kitchen Connections</h1></header>
2. prompt: added div container, placed header inside it, added navbar and styling, file name: aboutUs.html, line number: 10-15, change: 
    
    <div class="container" style="text-align: center">
    <header><h1>Welcome to Kitchen Connections</h1></header>
    <nav class="navbar navbar-dark bg-dark" style="display: flex; justify-content: space-evenly;" >
            <a href="/mainscreen">Home</a>
            <a href="/aboutUs">About</a>
    </nav>
    </div>
   
3. prompt: Added styling to body, file name: aboutUs.html, line number: 9, change: <body style="background-color: black; color: azure;">
4. prompt: Added div with p tags for summary section, file name: aboutUs.html, line number: 16-20, change:     
    
   <div style="align-content: space-evenly">
   <p>At Kitchen Connections, we're passionate about turning your kitchen dreams into reality. With years of experience in the kitchen design industry, we specialize in providing top-quality countertops, cabinets, tiles, and appliances to transform your space into the heart of your home.
   <p>Our team of experts is dedicated to delivering exceptional customer service and helping you create a kitchen that reflects your unique style and meets your functional needs. Whether you're looking for a sleek and modern design or a cozy rustic retreat, we have the products and expertise to bring your vision to life.</p>
   <p>From the initial consultation to the final installation, we're with you every step of the way, ensuring a smooth and stress-free experience. Discover the endless possibilities for your kitchen makeover with Kitchen Connections.</p>
   </div>
   
5. prompt: Created controller to render the aboutUs template, file name: AboutUsController.java, line number: 6-14, change:

@Controller
@RequestMapping(path = "/aboutUs")
public class AboutUsController {

    @GetMapping
    public String showAboutUsPage() {
        return "aboutUs";
    }
}


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
1. prompt: added if statement to check inventory level == 0 for both products and parts, file name: BootStrapData.java, line number: 45-48, change:
   
   if (partsCount == 0 && productsCount == 0) {
      addSampleInventory();
      addProducts();
   } 

2. prompt: added my five parts, file name: BootStrapData.java, line number: 69-112, change:

      OutsourcedPart sink = new OutsourcedPart();
        sink.setCompanyName("Kitchen Connections");
        sink.setName("Sink");
        sink.setInv(30);
        sink.setPrice(1500.0);
        sink.setId(101L);
        outsourcedPartRepository.save(sink);

      OutsourcedPart shakerCabinets = new OutsourcedPart();
        shakerCabinets.setCompanyName("Kitchen Connections");
        shakerCabinets.setName("Shaker Cabinets");
        shakerCabinets.setInv(35);
        shakerCabinets.setPrice(1000.0);
        shakerCabinets.setId(102L);
        outsourcedPartRepository.save(shakerCabinets);

      OutsourcedPart luxuryCountertops = new OutsourcedPart();
        luxuryCountertops.setCompanyName("Kitchen Connections");
        luxuryCountertops.setName("Luxury Countertops");
        luxuryCountertops.setInv(45);
        luxuryCountertops.setPrice(2500.0);
        luxuryCountertops.setId(103L);
        outsourcedPartRepository.save(luxuryCountertops);

      OutsourcedPart refrigerator = new OutsourcedPart();
        refrigerator.setCompanyName("Kitchen Connections");
        refrigerator.setName("Refrigerator");
        refrigerator.setInv(30);
        refrigerator.setPrice(1500.0);
        refrigerator.setId(104L);
        outsourcedPartRepository.save(refrigerator);

      OutsourcedPart rangeOven = new OutsourcedPart();
        rangeOven.setCompanyName("Kitchen Connections");
        rangeOven.setName("Range/Oven");
        rangeOven.setInv(40);
        rangeOven.setPrice(2000.0);
        rangeOven.setId(105L); 
        outsourcedPartRepository.save(rangeOven);

   List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }

3. prompt: created by 5 products, file name: BootStrapData.java, line number: 124-133, change:

   Product classicElegancePackage = new Product("Classic Elegance Package", 7000.0, 30);
   Product modernChicPackage = new Product("Modern Chic Package", 7500.0, 30);
   Product rusticRetreatPackage = new Product("Rustic Retreat Package", 8100.0, 30);
   Product luxuriousOasisPackage = new Product("Luxurious Oasis Package", 8300.0, 25);
   Product sleekUrbanPackage = new Product("Sleek Urban Package", 7600.0, 30);
   productRepository.save(classicElegancePackage);
   productRepository.save(modernChicPackage);
   productRepository.save(rusticRetreatPackage);
   productRepository.save(luxuriousOasisPackage);
   productRepository.save(sleekUrbanPackage);
4. prompt: created addSampleInventory method, file name: BootStrapData.java, line number: 144-183, change: 
   
   private void addSampleInventory() {
   OutsourcedPart sink = new OutsourcedPart();
           sink.setCompanyName("Kitchen Connections");
           sink.setName("Sink");
           sink.setInv(30);
           sink.setPrice(1500.0);
           outsourcedPartRepository.save(sink);

   OutsourcedPart shakerCabinets = new OutsourcedPart();
           shakerCabinets.setCompanyName("Kitchen Connections");
           shakerCabinets.setName("Shaker Cabinets");
           shakerCabinets.setInv(35);
           shakerCabinets.setPrice(1000.0);
           outsourcedPartRepository.save(shakerCabinets);

   OutsourcedPart luxuryCountertops = new OutsourcedPart();
           luxuryCountertops.setCompanyName("Kitchen Connections");
           luxuryCountertops.setName("Luxury Countertops");
           luxuryCountertops.setInv(45);
           luxuryCountertops.setPrice(2500.0);
           outsourcedPartRepository.save(luxuryCountertops);

   OutsourcedPart refrigerator = new OutsourcedPart();
           refrigerator.setCompanyName("Kitchen Connections");
           refrigerator.setName("Refrigerator");
           refrigerator.setInv(30);
           refrigerator.setPrice(1500.0);
           outsourcedPartRepository.save(refrigerator);

   OutsourcedPart rangeOven = new OutsourcedPart();
           rangeOven.setCompanyName("Kitchen Connections");
           rangeOven.setName("Range/Oven");
           rangeOven.setInv(40);
           rangeOven.setPrice(2000.0);
           outsourcedPartRepository.save(rangeOven);

   List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
   for(OutsourcedPart part:outsourcedParts){
   System.out.println(part.getName()+" "+part.getCompanyName());
   }

5. prompt: created addProducts method, file name: BootStrapData.java, line number: 218-229, change: 

                private void addProducts() {
                Product classicElegancePackage = new Product("Classic Elegance Package", 7000.0, 30);
                Product modernChicPackage = new Product("Modern Chic Package", 7500.0, 30);
                Product rusticRetreatPackage = new Product("Rustic Retreat Package", 8100.0, 30);
                Product luxuriousOasisPackage = new Product("Luxurious Oasis Package", 8300.0, 25);
                Product sleekUrbanPackage = new Product("Sleek Urban Package", 7600.0, 30);
                productRepository.save(classicElegancePackage);
                productRepository.save(modernChicPackage);
                productRepository.save(rusticRetreatPackage);
                productRepository.save(luxuriousOasisPackage);
                productRepository.save(sleekUrbanPackage);
            }


F.  
1. prompt: added buy now button, file name: mainScreen.html, line number: 87-90, change: 

        <form method="post" action="/buyConfirmation">
                <input type="hidden" th:name="productId" th:value="${tempProduct.id}">
                <button class="btn btn-primary btn-sm mb-3" type="submit">Buy Now</button>
        </form>

2. prompt: Added buyConfirmation page, file name: buyConfirmation.html, line number: 1-22, change:

   <!DOCTYPE html>
       <html lang="en" xmlns:th="http://www.thymeleaf.org">
       <head>
           <meta charset="UTF-8">
           <title>Order Confirmation</title>
       <!-- Bootstrap CSS -->
           <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
             integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
       </head>
       <body style="background-color: black; color: azure;">
    
       <div style="text-align: center;" class="container">
           <h1>Kitchen Connections</h1>
           <nav class="navbar navbar-dark bg-dark" style="display: flex; justify-content: space-evenly;" >
               <a href="/mainscreen">Home</a>
               <a href="/aboutUs">About</a>
           </nav>
       </div>
       <div style="display: flex; justify-content: center; margin: 5px;"><h2>Thank you for purchasing! Your order has been confirmed.</h2></div>
       </body>
       </html>

   3. prompt: created BuyProductController w/ inventory decrement logic, file name: BuyProductController.java, line number: 1-42, change:

           package com.example.demo.controllers;
    
           import com.example.demo.domain.Product;
           import com.example.demo.repositories.ProductRepository;
           import org.springframework.beans.factory.annotation.Autowired;
           import org.springframework.stereotype.Controller;
           import org.springframework.web.bind.annotation.*;
        
           import java.util.Optional;
        
           @Controller
           @RequestMapping(path = "/buyConfirmation")
           public class BuyProductController {
    
           private final ProductRepository productRepository;
    
           @Autowired
           public BuyProductController(ProductRepository productRepository) {
               this.productRepository = productRepository;
           }

       @PostMapping
       public String buyProduct(@RequestParam("productId") Long productId) {
           Optional<Product> optionalProduct = productRepository.findById(productId);

           if (optionalProduct.isPresent()) {
               Product product = optionalProduct.get();

               if (product.getInv() > 0) {
                   product.setInv(product.getInv() - 1);
                   productRepository.save(product);
                   return "buyConfirmation";
               } else {
                   // Product out of stock
                   return "outOfStock";
               }
           } else {
               // Product not found
               return "redirect:/error?message=Product not found";
           }
       }
   }

4. prompt: created out of stock page/notification, file name: outOfStock.html, line number: 1-22, change:

        <!DOCTYPE html>
            <html lang="en" xmlns:th="http://www.thymeleaf.org">
            <head>
                <meta charset="UTF-8">
                <title>Order Confirmation</title>
                <!-- Bootstrap CSS -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            
            </head>
            <body style="background-color: black; color: azure;">
            
            <div style="text-align: center;" class="container">
                <h1>Kitchen Connections</h1>
                <nav class="navbar navbar-dark bg-dark" style="display: flex; justify-content: space-evenly;" >
                    <a href="/mainscreen">Home</a>
                    <a href="/aboutUs">About</a>
                </nav>
            </div>
            <div style="display: flex; justify-content: center; margin: 5px;"><h2>Sorry, but this product is out of stock. The order has been cancelled.</h2></div>
            </body>
            </html>

5. prompt: Created out of stock controller, file name: OutOfStockController.java, line number: 1-15, change:

        package com.example.demo.controllers;
    
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        
        @Controller
        @RequestMapping(path = "/outOfStock")
        public class OutOfStockController {
        @GetMapping
        public String showOutOfStockPage() {
        return "outOfStock";
        }
        }
6.  prompt: added boolean method inStock, file name: ProductService.java, line number: 21, change:

         public boolean inStock (Product theProduct);

7. prompt: added inStock method logic, file name: ProductServiceImpl.java, line number: 70-79, change: 

       @Override
       public boolean inStock(Product theProduct) {
       if(theProduct.getInv() == 0) {
       return false;
       }
       else {
       theProduct.setInv(theProduct.getInv()-1);
       return true;
       }
       }



G.
1. prompt: Added additional fields to part entity for max and min inventory, file name: part.java, line number: 116-135, change:

        @Min(value = 0, message = "No inventory")
        int minInv;
    
        public int getMinInv() {
            return minInv;
        }
    
        public void setMinInv(int minInv) {
            this.minInv = minInv;
        }
    
        @Max(value = 100, message = "Inventory cannot be more than 100")
        @ValidNoMoreThan100()
        int maxInv;
    
        public int getMaxInv() {
            return maxInv;
        }
    
        public void setMaxInv(int maxInv) {
            this.maxInv = maxInv;
        }

2. prompt: added min and max values to sample inventory parts, file name: BootStrapData.java, line number: 161-210, change:

            private void addSampleInventory () {
            OutsourcedPart sink = new OutsourcedPart();
            sink.setCompanyName("Kitchen Connections");
            sink.setName("Sink");
            sink.setInv(30);
            sink.setPrice(1500.0);
            sink.setId(101L);
            sink.setMinInv(0);
            sink.setMaxInv(100);
            outsourcedPartRepository.save(sink);

            OutsourcedPart shakerCabinets = new OutsourcedPart();
            shakerCabinets.setCompanyName("Kitchen Connections");
            shakerCabinets.setName("Shaker Cabinets");
            shakerCabinets.setInv(35);
            shakerCabinets.setPrice(1000.0);
            shakerCabinets.setId(102L);
            shakerCabinets.setMinInv(0);
            shakerCabinets.setMaxInv(100);
            outsourcedPartRepository.save(shakerCabinets);

            OutsourcedPart luxuryCountertops = new OutsourcedPart();
            luxuryCountertops.setCompanyName("Kitchen Connections");
            luxuryCountertops.setName("Luxury Countertops");
            luxuryCountertops.setInv(45);
            luxuryCountertops.setPrice(2500.0);
            luxuryCountertops.setId(103L);
            luxuryCountertops.setMinInv(0);
            luxuryCountertops.setMaxInv(100);
            outsourcedPartRepository.save(luxuryCountertops);

            OutsourcedPart refrigerator = new OutsourcedPart();
            refrigerator.setCompanyName("Kitchen Connections");
            refrigerator.setName("Refrigerator");
            refrigerator.setInv(30);
            refrigerator.setPrice(1500.0);
            refrigerator.setId(104L);
            refrigerator.setMinInv(0);
            refrigerator.setMaxInv(100);
            outsourcedPartRepository.save(refrigerator);

            OutsourcedPart rangeOven = new OutsourcedPart();
            rangeOven.setCompanyName("Kitchen Connections");
            rangeOven.setName("Range/Oven");
            rangeOven.setInv(40);
            rangeOven.setPrice(2000.0);
            rangeOven.setId(105L);
            rangeOven.setMinInv(0);
            rangeOven.setMaxInv(100);
            outsourcedPartRepository.save(rangeOven);

3. prompt: added additional text inputs for max and min inventory, file name: InhousePartForm.html & OutsourcedPartForm.html, line number: 26-34, change: *both files

          <p>
            <input type="number" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4" min="1"/>
        </p>
        <p>
            <input type="number" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4" max="100"/>
        </p>

4. prompt: added columns for min and max inventory to mainscreen, file name: mainscreen.html, line number: 42-43 & 52-53, change: 
   
         <th>Min Inventory</th>
         <th>Max Inventory</th>

    and 

         <td th:text="${tempPart.minInv}">1</td>
         <td th:text="${tempPart.maxInv}">1</td>
   
5. prompt: renamed the DB file, file name: spring-boot-h2-db.mv.db & application.properties, line number: 6, change: 

    new file name: my-spring-boot-db.mv

    change in application.properties: spring.datasource.url=jdbc:h2:file:~/my-spring-boot-db

6.
prompt: created Thymeleaf alerts to enforce inventory between min and max inventory, file name: InhousePartForm.html & OutsourcedPartForm.html, line number: 28-34 change:
    
         <p>
            <input type="number" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4" min="1"/>
            <span class="text-danger" th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}"></span>
        </p>
        <p>
            <input type="number" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4" max="100"/>
            <span class="text-danger" th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}"></span>
        </p>
    


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.
