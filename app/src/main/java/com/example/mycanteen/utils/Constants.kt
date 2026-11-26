package com.example.mycanteen.utils

object Constants {
    // Single Theatre Configuration
    const val THEATRE_NAME = "My Canteen Cinema"

    // User Roles
    const val ROLE_CUSTOMER = "customer"
    const val ROLE_OWNER = "owner"

    // Order Statuses (Strict workflow order)
    const val STATUS_PENDING = "Pending"
    const val STATUS_ACCEPTED = "Accepted"
    const val STATUS_PREPARING = "Preparing"
    const val STATUS_READY = "Ready"
    const val STATUS_COMPLETED = "Completed"
    const val STATUS_CANCELLED = "Cancelled"
    const val STATUS_REJECTED = "Rejected"
}