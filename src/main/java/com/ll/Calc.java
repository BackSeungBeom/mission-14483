package com.ll;

import com.ll.controller.Controller;

import java.util.Scanner;

public class Calc {
        public static int run(String command) {
            Controller controller = new Controller();
            return controller.handle(command);
        }
}
