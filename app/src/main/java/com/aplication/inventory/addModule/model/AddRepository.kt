package com.aplication.inventory.addModule.model

import com.aplication.inventory.common.MyDataBase
import com.aplication.inventory.entities.Product

class AddRepository {
    private val myDataBase by lazy { MyDataBase.getInstance() }

    fun addProduct(product: Product, callback: (isSuccess: Boolean) -> Unit){
        callback(myDataBase.add(product))
    }
}