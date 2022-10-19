package oops.abstraction.interfaces;

interface InterfaceOfAnimals {
    public void size();
    public void colour();
}

class Panda implements InterfaceOfAnimals{
    public void size(){
        System.out.println("Its size is average.");
    }
    public void colour(){
        System.out.println("Its colour is black & white.");
    }
}
class Fox implements InterfaceOfAnimals{
    public void size(){
        System.out.println("Its size is small.");
    }
    public void colour(){
        System.out.println("Its colour is brown.");
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Panda p = new Panda();
        Fox f = new Fox();
        p.colour();
        p.size();
        f.colour();
        f.size();
    }
}


