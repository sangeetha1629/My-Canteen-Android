package com.example.mycanteen.datamodel

data class UserProfile(
    val id: String = "",
    val fullName: String = "",
    val email: String = "",
    val phone: String = "",
    val role: String = "customer"
)

data class FoodCategory(
    val id: String = "",
    val categoryName: String = ""
)

data class FoodItem(
    val id: String = "",
    val categoryId: String = "",
    val categoryName: String = "",
    val foodName: String = "",
    val description: String = "",
    val price: Double = 0.0,
    val imageUrl: String = "",
    val isAvailable: Boolean = true
)

data class CartItem(
    val foodItem: FoodItem,
    val quantity: Int = 1
) {
    val subtotal: Double
        get() = foodItem.price * quantity
}

data class OrderItem(
    val id: String = "",
    val orderId: String = "",
    val foodId: String = "",
    val foodName: String = "",
    val price: Double = 0.0,
    val quantity: Int = 1,
    val subtotal: Double = 0.0
)

data class Order(
    val id: String = "",
    val customerId: String = "",
    val customerName: String = "",
    val seatNumber: String = "",
    val totalAmount: Double = 0.0,
    val orderStatus: String = "Pending",
    val createdAt: String = "",
    val items: List<OrderItem> = emptyList()
)