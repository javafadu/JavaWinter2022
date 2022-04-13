package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {


    public abstract void AbsTractMethod();

    /*
    Abstract method'lar
    child class larin MUTLAKA override etmesi gereken methodlardir
    dolayisi ile HICBIR ZAMAN direkt calistirilmazlar.
    ve bu sebeple method body sine ihtiyac yoktur.
    (her zaman overriden method calisacak)

    bir class'in veya method un abstract olup olmadigini anlayabilir miyiz?
    - abstract yaziyorsa abstract tir, yazmiyorsa degildir
    (abstract olmayan class lara concrete class / method denir)

    Abstract method lar body ye sahip olamaz
    Concrete method lar ise method body si olmadan olusturulamaz.

     */


}
