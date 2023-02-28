package view;

import Controller.ContInt;

public class Principal {

public static void main( String[] args){

ContInt cont = new ContInt ();

int num = 203018;
int i = 2;

if (num >=10 || num <= 999999){
System.out.println (cont.NumInteiro(num, i));
}
else {
System.out.println(" Número invalido! ");}

int resultado = cont.NumInteiro(num, i);

System.out.println(resultado);
}
}