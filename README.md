# NTUIAutomation
# Amazon Search Functionality Automation

This project automates the UI testing of Amazon's website using Selenium WebDriver and Cucumber BDD. The goal is to ensure that users can search for a specific product and verify that the search results page and product details page function correctly.

## Features

- **Search Functionality**: Verify that the search results contain relevant products.
- **Filter Application**: Validate the application of filters on search results.
- **Pagination**: Test the navigation between search result pages.
- **Product Details Verification**: Ensure that the product details page loads correctly with the necessary information.

## Prerequisites

- Java 8 or higher
- Maven
- Chrome WebDriver(Optional)
- IDE (IntelliJ IDEA is recommended)
- Git

## Project Structure

src/test/java/
├── base/
│ └── BaseTest.java
├── config/
│ └── Config.java
├── hooks/
│ └── Hooks.java
├── pages/
│ ├── AmazonHomePage.java
│ ├── SearchResultsPage.java
│ └── ProductDetailsPage.java
├── runner/
│ └── TestRunner.java
├── steps/
│ └── SearchSteps.java
src/test/resources/
├── features/
│ └── search.feature


## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/NagendraWithTech/NTUIAutomation.git
   cd NTUIAutomation

2. **Install dependencies:**
Make sure you have Maven installed. Navigate to the project directory and run:
mvn clean install



 **Clone the repository**:
   ```bash
   git clone https://github.com/NagendraWithTech/NTUIAutomation.git
   cd NTUIAutomation
Install dependencies:
Make sure you have Maven installed. Navigate to the project directory and run:

bash
Copy code
mvn clean install
Set up WebDriver:
Download the Chrome WebDriver from here and place it in your system PATH or specify the path in the BaseTest setup.

Update Configurations:
Update Config.java with the appropriate base URL and any other configurations.

**Running the Tests**
**Via Maven:**
Run the following command to execute the tests:

**Using IDE:**

Open the project in IntelliJ IDEA or your preferred IDE.
Navigate to src/test/java/runner/TestRunner.java.
Right-click on TestRunner class and select "Run".
