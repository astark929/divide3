package interfacesDivide;

interface classA {

    void doNeatThings();
}

class classB implements classA{
    public static void main(String [] args){
        classA b = new classB();
        System.out.println("prints out 1-10");
        b.doNeatThings();
    }

    public void doNeatThings() {
        int a = 10;
        for(int i = 0; i < a; i++){
            System.out.println(i+1);
        }
    }
}
