package com.neoteric.map.mapdemo.overriding;

public interface BankAccount<T>  extends WithDrawable{

    T getAccountHolder();
    double getBalance();

}
