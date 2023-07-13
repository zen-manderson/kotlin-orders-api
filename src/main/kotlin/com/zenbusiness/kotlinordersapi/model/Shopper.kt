package com.zenbusiness.kotlinordersapi.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(schema = "carts", name = "shopper")
class Shopper(
    @Id
    val uuid: UUID,
    @Column(name = "account_uuid")
    val accountUuid: UUID
)
