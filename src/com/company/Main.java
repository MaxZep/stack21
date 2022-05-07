package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.StackPush(1,0);
        stack.StackPush(2,1);
        stack.StackPush(3,2);
        stack.StackPush(4,3);
        stack.StackPush(5,4);
        System.out.println(stack.pop()+"xx"+stack.getLastElement());
        System.out.println(stack.pop()+"xx"+stack.getLastElement());
        System.out.println(stack.pop()+"xx"+stack.getLastElement());
        System.out.println(stack.pop()+"xx"+stack.getLastElement());
        System.out.println(stack.pop()+"xx"+stack.getLastElement());
        System.out.println(stack.pop()+"xx"+stack.getLastElement());


	    }
}
//Самостоятельная работа.
//Как известно, слишком высокая стопка тарелок может развалиться. Следовательно, в реальной жизни, когда высота стопки
// превысила бы некоторое пороговое значение, мы начали бы складывать тарелки в новую стопку. Реализуйте структуру
// данных SetofStacks, имитирующую реальную ситуацию. Структура SetofStacks должна состоять из нескольких стеков, новый
// стек создается, как только предыдущий достигнет порогового значения. Методы SetofStacks.push() и SetofStacks.pop()
// должны вести себя так же, как при работе с одним стеком (то есть метод pop() должен возвращать те же значения,
// которые бы он возвращал при использовании одного большого стека). Реализуйте функцию popAt(int index), которая
// осуществляет операцию pop c заданным внутренним стеком.