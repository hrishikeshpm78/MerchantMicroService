package com.example.merchant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity @IdClass(MSPIdClass.class)
@Table(name="MerchantSellsProduct")
public class MerchantSellsProduct {
    @Id private int mId;
    @Id private int pId;
    private int stock;
    private int noOfProductsSold;

    public int getmId() {
        return mId;
    }

    public MerchantSellsProduct(int mId, int pId, int stock, int noOfProductsSold) {
        this.mId = mId;
        this.pId = pId;
        this.stock = stock;
        this.noOfProductsSold = noOfProductsSold;
    }

    public MerchantSellsProduct() {
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNoOfProductsSold() {
        return noOfProductsSold;
    }

    public void setNoOfProductsSold(int noOfProductsSold) {
        this.noOfProductsSold = noOfProductsSold;
    }
}
