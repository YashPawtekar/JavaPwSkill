package com_example_cal_add;

class addC {
    public void display(){
        System.out.println("Hey this is display");
    }
}

class addN extends addC{

}

public class add{
  public static void main(String[] args){
    addN a=new addN();
    a.display();
  }
}