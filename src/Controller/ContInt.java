package Controller;

public class ContInt {

public ContInt () {

super();
}
//ponto de parada
public int NumInteiro (int num, int i ) {

if (num == 0) {
return 0;
}
//função do termo anterior
if (num%10 == i) {
return 1+NumInteiro(num/10, i);
}
return NumInteiro(num/10, i);
}
}