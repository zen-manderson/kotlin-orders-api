package com.zenbusiness.kotlinordersapi.model

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(schema = "carts", name = "plan_content")
class CartPlanContent(
    @Id
    val uuid: UUID,
    @Column(name = "service_pricing_uuid")
    val servicePricingUuid: UUID,
    @Column(name = "fees_uuid")
    val feesUuid: UUID,
    @Column(name = "fees_amount")
    val feesAmount: Int?,
    @Column(name = "service_name")
    val serviceName: String,
    @Column(name = "has_formation")
    val hasFormation: Boolean?,
    @Column(name = "plan_option_content_uuid")
    val planOptionContentUuid: UUID,
    @ManyToOne
    @JoinColumn(name = "cart_item_uuid")
    @JsonBackReference
    val plan: CartItem
)