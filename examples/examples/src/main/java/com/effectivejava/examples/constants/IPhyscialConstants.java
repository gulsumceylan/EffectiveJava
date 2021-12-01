package com.effectivejava.examples.constants;

/*
Sabit tanımlamak interfacelerde kolay gibi gözükür.Static ve finaldırlar.
Ancak interfaceler içinde ezilmesi gereken metodlar olmalıdır.(Sözleşme gibidir)
Teknik olarak yanlış olmasa da kavramsal olarak yanlıştır.
 */
public interface IPhyscialConstants {

    // Avogadro's number (1/mol)
    static final double AVOGADROS_NUMBER = 6.02214199e23; //static final yazmasak da öyledirler.

    // Boltzmann constant (J/K)
    static final double BOLTZMANN_CONSTANT = 1.3806503e-23;

    // Mass of the electron (kg)
    static final double ELECTRON_MASS = 9.10938188e-31;
}

//class olarak tanımlayabiliriz ama en doğrusu enum olarak yapmaktır.







