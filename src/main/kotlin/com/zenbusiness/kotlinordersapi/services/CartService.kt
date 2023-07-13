package com.zenbusiness.kotlinordersapi.services

import com.zenbusiness.kotlinordersapi.repo.CartRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class CartService {
    @Autowired
    lateinit var repo: CartRepo

    fun getCartByUuid(cartUUID: UUID) = repo.findByUuid(cartUUID)
}