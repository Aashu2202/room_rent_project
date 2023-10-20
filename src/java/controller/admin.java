/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Ashshi
 */
public class admin {
    
    private String type , price, size , address, description,email,pin,foodType, city;
    private int count;
   public int getcount()
            {
                return count;
            }
    public void setcount(int count)
    {
        this.count = count;
    }
    public String getType()
            {
                return type;
            }
    public void setType(String type)
    {
        this.type = type;
    }
    public String getPrice()
            {
                return price;
            }
    public void setPrice(String price)
    {
        this.price = price;
    }
    public String getSize()
            {
                return size;
            }
    public void setSize(String size)
    {
        this.size = size;
    }
    public String getAddress()
            {
                return address;
            }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getDescription()
            {
                return description;
            }
    public void setDescription(String description)
    {
        this.description = description;
    }
     public String getemail()
   {
                return email;
    }
    public void setemail(String email)
    {
        this.email = email;
    }
    public String getfoodType()
   {
                return foodType;
    }
    public void setfoodType(String foodType)
    {
        this.foodType= foodType;
    }
    public String getcity()
   {
                return city;
    }
    public void setcity(String city)
    {
        this.city = city;
    }
    public String getpin()
   {
                return pin;
    }
    public void setpin(String pin)
    {
        this.pin = pin;
    }
}