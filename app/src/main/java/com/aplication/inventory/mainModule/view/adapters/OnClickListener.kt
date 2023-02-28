package com.aplication.inventory.mainModule.view.adapters

import com.aplication.inventory.entities.Product

interface OnClickListener {
    fun onClick(product: Product)
    fun onLongClick(product: Product)
}