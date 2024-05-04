# QIMA Fullstack Test User Manual

## Installation
To use the application, you need to have the following dependencies installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Any RDBMS (e.g., MySQL, PostgreSQL)

Once you have installed the necessary dependencies, you can proceed with the installation steps:

1. Clone the repository from GitHub: `git clone https://github.com/brunodpoliveira/QIMATechFullstackTest.git`
2. Navigate to the project directory: `cd qima-test`
3. Build the project using Maven: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

The application will be accessible at `http://localhost:8080` in your web browser.

## Usage
### Home Page
Upon accessing the application, you will be directed to the home page. From here, you can navigate to the product management page and perform various actions.

### Product Management Page
The product management page allows you to view, add, edit, and delete products. The page displays a table with the following columns: name, description, price, categoryPath, available. You can also add additional columns as needed.

#### Sorting and Filtering
To sort the products, click on the column header you want to sort by. Clicking the same column header again will reverse the sorting order.

To filter the products, use the search bar located above the table. Enter a keyword or phrase and press Enter to filter the products based on the search criteria.

#### Adding a Product
To add a new product, click on the "Add Product" button located at the top of the page. Fill in the required fields (name, description, price, categoryPath) and optionally select the "Available" checkbox. Click the "Add Product" button to save the new product.

#### Editing a Product
To edit an existing product, click on the "Edit" button located in the corresponding row of the table. This will open a form where you can modify the product details. Make the necessary changes and click the "Save" button to update the product.

#### Deleting a Product
To delete a product, click on the "Delete" button located in the corresponding row of the table. A confirmation dialog will appear asking you to confirm the deletion. Click "OK" to proceed with the deletion or "Cancel" to cancel the operation.

### Security
The Application implements Spring Security to ensure secure access to the application. By default, there is one superuser with the following credentials:

- Username: admin
- Password: admin

To access the administrative features of the application, you need to log in using these credentials. Once logged in, you will have full access to all product management functionalities.
