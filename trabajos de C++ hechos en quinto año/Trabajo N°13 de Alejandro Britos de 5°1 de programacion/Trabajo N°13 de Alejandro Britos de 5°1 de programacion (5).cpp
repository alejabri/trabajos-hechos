#include<iostream>

using namespace std;

main() {
	
	int nota_1, nota_2, nota_3, promedio, legajo, a=0, d=0;
	
	do {
		
		cout<<"\ningrese numero legajo: ";
		cin>>legajo;
		cout<<"ingrese primera nota: ";
		cin>>nota_1;
		cout<<"ingrese segunda nota: ";
		cin>>nota_2;
		cout<<"ingrese tercera nota: ";
		cin>>nota_3;
	
		promedio=(nota_1+nota_2+nota_3)/3;
		cout<<"el promedio es: "<<promedio;
	
		if(promedio<7) {
			
			d=d+1;
			cout<<"\ndesaprovado/s: "<<d;
			
		}
		else {
			
			a=a+1;
			cout<<"\naprovado/s: "<<a;
			
		}
	
	} while (legajo!=0);
	
}
