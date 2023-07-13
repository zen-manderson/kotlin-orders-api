package com.zenbusiness.kotlinordersapi.controllers

import com.zenbusiness.kotlinordersapi.services.CartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/orders/api/v1/carts")
class CartsController(@Autowired val cartService: CartService) {
    @GetMapping("/{cartUuid}")
    fun getCart(@PathVariable cartUuid: UUID) = cartService.getCartByUuid(cartUuid)
}