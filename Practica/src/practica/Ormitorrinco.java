package practica;
public class Ormitorrinco extends Mamifero  implements Piruetas,Oviparo {

@Override
public void amamantarCrias(){
    System.out.println("El ormitorrinco amamanta sus crias");
}

@Override
public void ponerHuevos (){
    System.out.println("El ormitorrinco pone huevos");
}

@Override
public void hacePiruetas(){
    System.out.println("El ormitorrinco hace piruetas");
}
    
}
