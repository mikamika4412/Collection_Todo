package com.javalessons.Collections;

public class ListRunner {
    public static void main(String[] args) {
        TodoList1 todoList1= new TodoList1();
        printOut();
    }
    private static void printOut(){
        System.out.println("Please choose an action. Please:\n" +
                "1 to add a new item into TodoList:\n" +
                "2 to print out the list:\n" +
                "3 to update in existing uot:\n" +
                "4 to remove in item from the list:\n" +
                "5 to get task prioriy or number of the list:\n" +
                "6 to add a new item specific position:\n" +
                 "press 0 for exit:\n"+
                 "AFTER CHOOSING AN OPTION PLEASE PRESS ENTER");
    }
}
