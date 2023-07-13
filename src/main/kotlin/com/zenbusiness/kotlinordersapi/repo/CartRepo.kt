package com.zenbusiness.kotlinordersapi.repo

import com.zenbusiness.kotlinordersapi.model.Cart
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CartRepo : CrudRepository<Cart, UUID> {
    fun findByUuid(cartUuid: UUID): Cart
}
