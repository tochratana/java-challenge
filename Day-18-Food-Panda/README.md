# FoodPanda - Java Console Application

## Overview
FoodPanda is a Java-based console application that simulates a simple food ordering system. Users can log in, browse products, add items to their cart, and place orders. The application follows the Model-View-Controller (MVC) pattern and incorporates Object-Oriented Programming (OOP) principles.

## Features
- **User Authentication**: Users must log in to access the system.
- **Product Listing**: Displays a list of available products in a tabular format.
- **Shopping Cart**: Users can add or remove products from their cart.
- **Order Placement**: Users can place orders, which include details like product name, quantity, price, and order date.
- **Exception Handling**: Custom exceptions are used to handle invalid user input.
- **Sound Alerts**: Alerts users with sounds during key actions (e.g., successful login, order placement).

## Technologies Used
- **Java**: Core programming language.
- **OOP Concepts**: Encapsulation, Inheritance, Polymorphism, Abstraction.
- **MVC Pattern**: Separation of concerns into Model, View, and Controller.
- **Exception Handling**: Custom and built-in exceptions for robust error handling.

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Ensure you have JDK 8 or later installed.
- **Terminal or Command Prompt**: To compile and run the application.

### Installation
#### Clone the Repository:
```bash
git clone https://github.com/your-username/FoodPanda.git
```

#### Navigate to the Project Directory:
```bash
cd FoodPanda
```

#### Compile the Application:
```bash
javac -d out src/main/java/com/foodpanda/*.java src/main/java/com/foodpanda/controller/*.java src/main/java/com/foodpanda/model/*.java src/main/java/com/foodpanda/service/*.java src/main/java/com/foodpanda/view/*.java src/main/java/com/foodpanda/exception/*.java
```

#### Run the Application:
```bash
java -cp out com.foodpanda.FoodPandaApp
```

## Usage
### Login:
Enter your username and password when prompted.

**Default credentials:**
- **Username**: `user`
- **Password**: `password`

### Main Menu:
After logging in, you will see the following options:
```bash
1. Add Product to Cart
2. Remove Product from Cart
3. View Cart
4. Start Order
5. Exit
```

### Add Product to Cart:
- Choose option **1** to view the list of products.
- Enter the product ID and quantity to add it to your cart.

### Remove Product from Cart:
- Choose option **2** to remove a product from your cart.
- Enter the product ID to remove it.

### View Cart:
- Choose option **3** to view the products in your cart.

### Place Order:
- Choose option **4** to place an order.
- The application will display the order details, including the total price and items.

### Exit:
- Choose option **5** to exit the application.

## Folder Structure
```
FoodPanda/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── foodpanda/
│   │   │   │   │   ├── controller/       # Controller classes
│   │   │   │   │   ├── model/            # Model classes (e.g., User, Product)
│   │   │   │   │   ├── service/          # Service classes (e.g., AuthenticationService)
│   │   │   │   │   ├── view/             # View classes (e.g., View)
│   │   │   │   │   ├── exception/        # Custom exception classes
│   │   │   │   │   └── FoodPandaApp.java # Main application class
│   │   ├── resources/                    # Configuration files (if any)
│   ├── test/                             # Unit tests
└── README.md                             # Project documentation
```

## Custom Exceptions
The application uses custom exceptions to handle invalid user input. For example:
- **InvalidUsernameException**: Thrown when the username is incorrect.
- **InvalidPasswordException**: Thrown when the password is incorrect.
- **InvalidProductIdException**: Thrown when an invalid product ID is entered.

## Contributing
Contributions are welcome! If you'd like to contribute, please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes.
4. Submit a pull request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Acknowledgments
- Inspired by real-world food delivery applications.
- Built as a learning project to practice Java, OOP, and MVC patterns.

## Contact
For questions or feedback, please contact:
- **Your Name**: your-email@example.com
- **GitHub**: [your-username](https://github.com/your-username)

