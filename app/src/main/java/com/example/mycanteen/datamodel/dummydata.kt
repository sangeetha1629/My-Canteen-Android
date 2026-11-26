package com.example.mycanteen.datamodel

import com.example.mycanteen.utils.Constants

object DummyData {
    val categories = listOf(
        FoodCategory("cat_1", "Popcorn"),
        FoodCategory("cat_2", "Snacks & Puffs"),
        FoodCategory("cat_3", "Cold Drinks"),
        FoodCategory("cat_4", "Combo Deals")
    )

    val foodItems = listOf(
        FoodItem(
            id = "food_1",
            categoryId = "cat_1",
            categoryName = "Popcorn",
            foodName = "Caramel Cheese Popcorn (Large)",
            description = "Freshly popped warm crunchy popcorn coated with rich caramel and cheddar cheese.",
            price = 180.0,
            isAvailable = true
        ),
        FoodItem(
            id = "food_2",
            categoryId = "cat_1",
            categoryName = "Popcorn",
            foodName = "Classic Salted Popcorn",
            description = "Hot buttered theatre-style salted popcorn.",
            price = 120.0,
            isAvailable = true
        ),
        FoodItem(
            id = "food_3",
            categoryId = "cat_2",
            categoryName = "Snacks & Puffs",
            foodName = "Crispy Veg Puff (2 Pcs)",
            description = "Flaky bakery puff stuffed with spicy masala vegetables.",
            price = 80.0,
            isAvailable = true
        ),
        FoodItem(
            id = "food_4",
            categoryId = "cat_2",
            categoryName = "Snacks & Puffs",
            foodName = "Paneer Tikka Sandwich",
            description = "Grilled multi-grain sandwich loaded with spiced paneer and mint mayo.",
            price = 140.0,
            isAvailable = false // Sold out sample to test UI badge!
        ),
        FoodItem(
            id = "food_5",
            categoryId = "cat_3",
            categoryName = "Cold Drinks",
            foodName = "Chilled Cola (500ml)",
            description = "Ice-cold fizzy cola served with straw.",
            price = 70.0,
            isAvailable = true
        ),
        FoodItem(
            id = "food_6",
            categoryId = "cat_4",
            categoryName = "Combo Deals",
            foodName = "Interval Blockbuster Combo",
            description = "1 Large Salted Popcorn + 2 Veg Puffs + 2 Chilled Colas.",
            price = 299.0,
            isAvailable = true
        )
    )

    val sampleOrders = listOf(
        Order(
            id = "ORD-1001",
            customerId = "cust_1",
            customerName = "Arun Kumar",
            seatNumber = "G-12",
            totalAmount = 300.0,
            orderStatus = Constants.STATUS_PENDING,
            createdAt = "Today, 06:45 PM",
            items = listOf(
                OrderItem("oi_1", "ORD-1001", "food_1", "Caramel Cheese Popcorn (Large)", 180.0, 1, 180.0),
                OrderItem("oi_2", "ORD-1001", "food_2", "Classic Salted Popcorn", 120.0, 1, 120.0)
            )
        ),
        Order(
            id = "ORD-1002",
            customerId = "cust_2",
            customerName = "Priya S",
            seatNumber = "D-05",
            totalAmount = 299.0,
            orderStatus = Constants.STATUS_PREPARING,
            createdAt = "Today, 06:30 PM",
            items = listOf(
                OrderItem("oi_3", "ORD-1002", "food_6", "Interval Blockbuster Combo", 299.0, 1, 299.0)
            )
        )
    )
}