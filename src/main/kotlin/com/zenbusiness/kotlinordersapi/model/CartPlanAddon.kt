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
@Table(schema = "carts", name = "plan_addon")
class CartPlanAddon(
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
    @Column(name = "plan_option_addon_uuid")
    val planOptionAddonUuid: UUID,
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
    @Column
    val quantity: Int,
    @ManyToOne
    @JoinColumn(name = "cart_item_uuid")
    @JsonBackReference
    val plan: CartItem,
    @OneToMany(mappedBy = "planAddon")
    @JsonManagedReference
    val addonContent: List<CartPlanAddonContent>?
)
