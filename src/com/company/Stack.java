package com.company;

public class Stack {
    private int size;
    private int[] arr;
    private int lastElement;

    public int getLastElement() {
        return lastElement;
    }

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.lastElement = -1;//индекс элемента по умолчанию -1, то есть ничего т.к первый элемент массива индекс 0
    }

    public void StackPush(int value, int lastElement) {
        this.lastElement++;
        if (lastElement > arr.length) {
            Stack stack1 = new Stack(5);
        }
        this.arr[lastElement] = value;
        System.out.println(arr[lastElement]);
    }


    public int pop() {
        return arr[lastElement--];//
    }
}
