#include<iostream>

using namespace std;

main() {
	
	float desayuno, almuerzo, merienda, cena, promedio;
	
	cout<<"ingrese cantidad de calorias en el desayuno: ";
	cin>>desayuno;
	
	if(desayuno>1200) {
		cout<<"mayor a 1200 calorias";
	}
	
	cout<<"\ningrese cantidad de calorias en el almuerzo: ";
	cin>>almuerzo;
	
	if(almuerzo>1200) {
		cout<<"mayor a 1200 calorias";
	}
	
	cout<<"\ningrese cantidad de calorias en la merienda: ";
	cin>>merienda;
	
	if(merienda>1200) {
		cout<<"mayor a 1200 calorias";
	}
	
	cout<<"\ningrese cantidad de calorias en la cena: ";
	cin>>cena;
	
	if(cena>1200) {
		cout<<"mayor a 1200 calorias";
	}
	
	promedio=desayuno+almuerzo+merienda+cena;
	cout<<"\nel promedio de las calorias consumidas es: "<<promedio;
	
}
