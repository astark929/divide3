package interfacesDivide;

import betterFormArch.Main;
import java.lang.Math;
import java.lang.*;

interface ClassA2 {

    default void doNeatThings(){
        System.out.println("i wonder whats going to be printed");
    }
}

interface classC2{

    final int a = 10;
}

class classB2 implements classC2, ClassA2{

    public static void main(String [] args){

        classB2 b = new classB2();

        b.doNeatThings();
        System.out.println(classC2.a);


    }
}
