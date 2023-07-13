package com.zenbusiness.kotlinordersapi.model

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
@Table(schema = "carts", name = "cart")
class Cart(
    @Id
    val uuid: UUID,
    @Column(name = "affiliate_uuid")
    val affiliateUuid: UUID,
    @Column(name = "business_entity_uuid")
    val businessEntityUuid: UUID,
    @Column(name = "post_purchase_required")
    val postPurchaseRequired: Boolean?,
    @Column
    val status: String,
    @Column(name = "visit_uuid")
    val vistUuid: UUID,
    @ManyToOne
    @JoinColumn(name = "shopper_uuid")
    val shopper: Shopper,
    @OneToMany(mappedBy = "cart")
    @JsonManagedReference
    val items: List<CartItem>?
)
