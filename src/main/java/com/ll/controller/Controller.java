package com.ll.controller;

import com.ll.model.entity.Order;
import com.ll.model.service.CalcService;
import com.ll.model.service.Rq;

public class Controller {
    CalcService calc = new CalcService();

    public int handle(String input){
        Rq rq = new Rq(input);
        Order order = rq.commandSplit();

        int numIdx = 1;
        int result = order.getNum(0);

        for(int i=0; i<order.getOrderLen(); i++){
            String op = order.getOperator(i);
            int nextNum = order.getNum(numIdx++);

            result = switch (op) {
                case "+" -> calc.sum(result, nextNum);
                case "-" -> calc.substract(result, nextNum);
                case "*" -> calc.multi(result, nextNum);
                case "/" -> calc.divide(result, nextNum);
                default -> result;
            };
        }

        return result;
    }

}
