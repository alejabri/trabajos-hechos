//ingresar que numeros desea sumar y sacar el promedio//
#include<iostream>

using namespace std;

int main(){
    
    int i=0, temperatura, promedio=0, suma=0;
    
    cout<<"Ingrese los numeros que desea calcular: "<<endl;//el ultimo numero ingresado se debe repetir y se sumara al calculo//
    while(temperatura>i){
        cin>>temperatura;
        suma = suma+temperatura;
        promedio = suma/temperatura;
		i++;
    }
    
    cout<<"la suma es: "<< suma <<endl;
    cout<<"El promedio de temperatura es: "<< promedio ;
    
    return 0;
}
