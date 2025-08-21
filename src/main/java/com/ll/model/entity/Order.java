package com.ll.model.entity;

import java.util.List;

public class Order {
    List<String> operator;
    List<Integer> num;
    int orderLen;


    public Order(List<String> operator, List<Integer> num) {
        this.operator = operator;
        this.num = num;
        this.orderLen = operator.size();
    }

    public String getOperator(int idx) {
        return operator.get(idx);
    }

    public int getNum(int idx) {
        return num.get(idx);
    }

    public int getOrderLen() {
        return orderLen;
    }

}
