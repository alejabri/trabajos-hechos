#include<iostream>
#include<conio.h>

using namespace std;

int main() {
	
	float deuda, descuento, deuda_final, impCuota;
	int opcion,cantCuotas, porcDesc;
	
	cout<<"ingrese deuda: ";
	cin>>deuda;
	cout<<"1- pago 3 cuotas %40 descuento"<<endl;
	cout<<"2- pago 6 cuotas %20 descuento"<<endl;
	cout<<"2- pago 12 cuotas %10 descuento"<<endl;
	cout<<"ingrese opcion: ";
	cin>>opcion;
	
	switch(opcion) {
		case 1: {
			descuento=deuda*40/100;
			deuda_final=deuda-descuento;
			impCuota=deuda_final/3;
			porcDesc=40;
			break;
		}
		case 2: {
			descuento=deuda*20/100;
			deuda_final=deuda-descuento;
			impCuota=deuda_final/6;
			porcDesc=20;
			break;
		}
		case 3: {
			descuento=deuda*10/100;
			deuda_final=deuda-descuento;
			impCuota=deuda_final/12;
			porcDesc=10;
			break;
		}
		default: {
			cout<<"opcion incorrecta";
			break;
		}
	}
	
	cout<<"deuda inicial: "<<deuda<<endl;
	cout<<"cantidad de cuotas: "<<cantCuotas<<endl;
	cout<<"porcentaje de descuento % "<<porcDesc<<endl;
	cout<<"descuento obtenido: "<<descuento<<endl;
	cout<<"deuda final: "<<deuda_final<<endl;
	cout<<"importe de cada cuota: "<<impCuota<<endl;
	
	getch();
	return 0;
}
