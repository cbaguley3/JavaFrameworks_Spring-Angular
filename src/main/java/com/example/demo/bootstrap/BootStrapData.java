package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        if (partRepository.count() == 0 && productRepository.count() == 0) {
            addSampleInventory();
            addProducts();
        }



       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        // My 5 sample inventory Parts
        /*
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

        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }
        */


        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */


        // My 5 Products
        /*
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


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products" + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts" + partRepository.count());
        System.out.println(partRepository.findAll());

    }

         */
    }

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

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }
        }

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

                System.out.println("Started in Bootstrap");
                System.out.println("Number of Products" + productRepository.count());
                System.out.println(productRepository.findAll());
                System.out.println("Number of Parts" + partRepository.count());
                System.out.println(partRepository.findAll());
            }



    private void addPart(String name, String companyName, int inventory, double price, Long id, int minInv, int maxInv) {
        OutsourcedPart part = new OutsourcedPart();
        part.setCompanyName(companyName);
        part.setName(name);
        part.setInv(inventory);
        part.setPrice(price);
        part.setId(id);
        part.setMinInv(minInv);
        part.setMaxInv(maxInv);
        outsourcedPartRepository.save(part);
    }
}