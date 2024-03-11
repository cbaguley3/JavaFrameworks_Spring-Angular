<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

All changes/commits will be noted here. Each note will include a prompt, file name, line number, and change.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
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
            <a href="mainscreen.html">Home</a>
            <a href="aboutUs.html">About</a>
    </nav>
    </div>
   
3. prompt: Added styling to body, file name: aboutUs.html, line number: 9, change: <body style="background-color: black; color: azure;">
4. prompt: Added div with p tags for summary section, file name: aboutUs.html, line number: 16-20, change:     
    
   <div style="align-content: space-evenly">
   <p>At Kitchen Connections, we're passionate about turning your kitchen dreams into reality. With years of experience in the kitchen design industry, we specialize in providing top-quality countertops, cabinets, tiles, and appliances to transform your space into the heart of your home.
   <p>Our team of experts is dedicated to delivering exceptional customer service and helping you create a kitchen that reflects your unique style and meets your functional needs. Whether you're looking for a sleek and modern design or a cozy rustic retreat, we have the products and expertise to bring your vision to life.</p>
   <p>From the initial consultation to the final installation, we're with you every step of the way, ensuring a smooth and stress-free experience. Discover the endless possibilities for your kitchen makeover with Kitchen Connections.</p>
   </div>
   
5. prompt: Created controller to render the aboutUs template, file name: AboutUsController.java, line number: 5-12, change:
   
   @Controller
   public class AboutUsController {

   @GetMapping("/aboutUs")
   public String showAboutUsPage() {
   return "aboutUs";
   }
   }


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
1. prompt: added if statement to check inventory level == 0, file name: BootStrapData.java, line number: 46-48, change:
   
   if (partsCount == 0 && productsCount == 0) {
      addSampleInventory();
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


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.
