package com.vm.training.project.cafeteria;
import java.util.ArrayList;
public class Payment {
    
    //required Object
    
    private String payment_date;
    private String payment_method;
    
    private boolean hasDiscount;
    private float discount;
    
    int totalBill;
   
    
    

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
    
    public int calculateTotalBill()
    {
        int orderTotal = 0;
        
        
        return totalBill;
    }
    
    
    
    
    
}
