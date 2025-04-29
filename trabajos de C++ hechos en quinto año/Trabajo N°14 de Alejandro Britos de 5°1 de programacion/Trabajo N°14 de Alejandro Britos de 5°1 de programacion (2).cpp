#include<iostream>

using namespace std;

main() {
	
	int socio, deporte, f=0, t=0, v=0;
	char continuar='s';
	
	do {
		
		cout<<"1) futbol \n2) tenis \n3) voley";
	
		cout<<"\ningrese el numero de socio: ";
		cin>>socio;
		cout<<"ingrese el codigo del deporte: ";
		cin>>deporte;
		
		if(deporte==1) {
			f=f+1;
			cout<<"cantidad de socios en futbol: "<<f;
		}
		if(deporte==2) {
			t=t+1;
			cout<<"cantidad de socios en tenis: "<<t;
		}
		if(deporte==3) {
			v=v+1;
			cout<<"cantidad de socios en voley: "<<v;
		}
		
		cout<<"\n¿Desea continuar? S/N ";
		cin>>continuar;
		
	} while(continuar=='s' || continuar=='S');
	
}
