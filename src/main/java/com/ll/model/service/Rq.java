package com.ll.model.service;

import com.ll.model.entity.Order;

import java.util.LinkedList;
import java.util.List;

public class Rq {
    String[] orderText;

    public Rq(String command) {
        this.orderText = command.split(" ");
    }

    public Order commandSplit() {
        List<String> operator = new LinkedList<>();
        List<Integer> num = new LinkedList<>();

        for(String o : orderText){
            if(o.matches("[+\\-*/]")){
                operator.add(o);
            }
            else{
                num.add(Integer.parseInt(o));
            }
        }
        return new Order(operator, num);
    }
}
