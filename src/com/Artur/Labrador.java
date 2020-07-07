package com.Artur;

public class Labrador extends Dog{

    public Labrador(String name) {
        super(name);
    }
//    Do not Override the equals on subclass if you want to compare parent and subclass.
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//
//        if(obj instanceof Labrador){
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//        return false;
//    }




}
