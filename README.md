## Overview

This project involves customizing a pre-built Spring web application with a Java backend and a basic HTML user interface to meet specific customer requirements for a sample shop. The main tasks include defining a product and parts inventory, implementing a "Buy Now" functionality, adding inventory constraints with validation, and writing unit tests.

## Technologies Used

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate (implicitly used by Spring Data JPA)
* Thymeleaf (for HTML templating)
* Maven (for build automation and dependency management)
* Lombok (for reducing boilerplate code - getters, setters, constructors)

### Frontend

* HTML
* CSS

### Database

* H2 (in-memory database, configured in `application.properties`)

### Development Environment & Tools

* IntelliJ IDEA
* Git

## Feature Implementation

### Task C: Main Screen Customization

* Modified `mainscreen.html` to reflect a chosen custom shop (e.g., bicycle shop), updating titles and headers accordingly.

### Task D: About Page Creation

* Created a new HTML template (`about.html`) to describe the business.
* Developed a Spring `@Controller` to map a URL (e.g., `/about`) to the `about.html` template.
* Added a button or link on `mainscreen.html` to navigate to the about page.
* Added a link or button on `about.html` to return to the main screen.

### Task E: Sample Inventory

* Modified `BootStrapData.java` to create and load a sample inventory of 5 distinct products and 5 generic parts.
* Implemented logic (e.g., checking counts) to prevent adding duplicate inventory on application restart.

### Task F: Buy Now Functionality

* Added a "Buy Now" button next to product listings in `mainscreen.html`.
* Configured the button to send a POST request to a `/buyProduct` URL, including the product ID as a hidden input.
* Created a new Spring `@Controller` to handle the `/buyProduct` request.
* Implemented logic in the controller to:
    * Retrieve the purchased product using its ID.
    * Decrement the product's inventory by one if available.
    * Display a success or error message (potentially using new HTML templates).

### Task G: Part Inventory Constraints

* Added `minInv` and `maxInv` fields to the `Part` entity in `Part.java`, including `@Min(0)` validation.
* Added a constructor including the new inventory fields and generated getters/setters.
* Updated `BootStrapData.java` to include `minInv` and `maxInv` values for the sample parts.
* Modified `InhousePartForm.html` and `OutsourcedPartForm.html` to include input fields for minimum and maximum inventory.
* Renamed the H2 database file in the file system and updated the `spring.datasource.url` in `application.properties`.
* Created a method in `Part.java` (`isInvValid`) to check if an inventory value is within the min/max range.
* Implemented validation in the `InhousePartController` and `OutsourcedPartController` using the `isInvValid` method and `BindingResult` to display error messages if the inventory is out of range.

### Task H: Enhanced Error Messages

* Modified `InhousePartController` and `OutsourcedPartController` to provide more specific error messages for inventory below minimum and above maximum.
* Edited `EnufPartsValidator.java` to check if adding/updating a product would cause any associated part's inventory to fall below its minimum.
* Updated the error message in `EnufPartsValidator.java` to be more descriptive.

### Task I: Unit Tests for Part Inventory

* Added two unit tests to `PartTest.java` to verify the functionality of the `maxInv` and `minInv` fields in the `Part` entity using `@Test` annotation and `assertEquals()`.

### Task J: Remove Unused Validators

* Identified and removed any unused validator class files from the `validators` directory.

## Setup

1. Ensure IntelliJ Ultimate is downloaded and installed.
2. Obtain the project files and open them in IntelliJ.
3. The application can be run within IntelliJ by running the main application class or using Maven (`mvn spring-boot:run`).
4. Access the web application in a browser at `http://localhost:8080`.

## Git Repository

* **Repository URL:** https://github.com/cbaguley3/JavaFrameworks_Spring-Angular
* **Branch:** working

## Commit History (Relevant to described features)

* Customized main screen.
* Created about page with navigation.
* Added sample inventory of products and parts.
* Implemented "Buy Now" button and functionality.
* Added min and max inventory fields and updated forms.
* Implemented inventory range validation for parts.
* Enhanced error messages for inventory issues.
* Added unit tests for part inventory limits.
* Removed unused validator classes.
