/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Stack {
    int stackarray[];
    int size;
    int top;
    Stack(int x){
        this.size=x;
        stackarray= new int[size];
        top=-1;
    }
    void push(int item){
        if(isfull()){
            System.out.println("Stack is full");
        }
        else{
            stackarray[++top]=item;
        }
    }
    int pop(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        else{
            return stackarray[top--];
        }
        return 0;
    }
    boolean isfull(){
        return top==size-1;
    }
    boolean isempty(){
        return top==-1;
    }
    int peek(){
        if(isempty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stackarray[top];
        }
    }
    int issize(){
        return top+1;
    }
    public static void main(String[]args){
        Stack s=new Stack(3);
        s.push(10);
        s.push(20);
        s.push(50);
        s.push(60);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(70);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.issize());
    }
}
