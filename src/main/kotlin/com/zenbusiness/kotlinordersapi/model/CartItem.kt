package com.zenbusiness.kotlinordersapi.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(schema = "carts", name = "item")
class CartItem(
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
    @Column(name = "affiliate_pricing_uuid")
    val affiliatePricingUuid: UUID,
    @Column(name = "affiliate_plan_option_uuid")
    val affiliatePlanOptionUuid: UUID,
    @Column(name = "jurisdiction_definition_uuid")
    val jurisdictionDefinitionUuid: UUID,
    @Column(name = "jurisdiction_state")
    val jurisdictionState: String,
    @Column
    val quantity: Int,
    @Column(name = "credit_balance_uuid")
    val creditBalanceUuid: UUID,
    @Column(name = "coupon_uuid")
    val couponUuid: UUID,
    @Column(name = "coupon_amount")
    val couponAmount: Int?,
    @Column(name = "service_amount")
    val serviceAmount: Int,
    @Column(name = "is_deferred")
    val isDeferred: Boolean?,
    @Column
    val interval: String,
    @ManyToOne
    @JoinColumn(name = "cart_uuid")
    @JsonBackReference
    val cart: Cart,
    @OneToMany(mappedBy = "plan")
    @JsonManagedReference
    val planAddons: List<CartPlanAddon>?,
    @OneToMany(mappedBy = "plan")
    @JsonManagedReference
    val planContent: List<CartPlanContent>?
)