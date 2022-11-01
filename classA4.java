package interfacesDivide;

class classA4 {
    public void doNeatThings(int a){
        int temp = a;
        for(int i=1; i<temp; i++){
            a = a * i;
            System.out.println(a);

        }
        System.out.println("the number factorial is : " + a);
    }
}
interface classC4 {
    int a = 5;

}

class classB4 extends classA3 implements classC4{
    public static void main (String [] args){
        classA4 w = new classA4();
        w.doNeatThings(classC4.a);

    }

}

