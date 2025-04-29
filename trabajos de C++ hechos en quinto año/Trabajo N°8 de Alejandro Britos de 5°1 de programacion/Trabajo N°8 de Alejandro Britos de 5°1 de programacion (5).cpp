#include<iostream>

using namespace std;

int main() {
	
	int n, p;
	
	cout<<"ingrese cuantas maquinas compro: ";
	cin>>n;
	
	switch(n) {
	
	case 1: cout<<"precio unitario: 1000";
	        cout<<"\ncantidad comprada: 1";
	        cout<<"\ndescuento obtenido: 0";
	        cout<<"\ntotal a pagar: 1000"; break;
	        
	case 2: cout<<"precio unitario: 1000";
	        cout<<"\ncantidad comprada: 2";
	        cout<<"\ndescuento obtenido: 0";
	        cout<<"\ntotal a pagar: 2000"; break;
	        
	case 3: cout<<"precio unitario: 1000";
	        cout<<"\ncantidad comprada: 3";
	        cout<<"\ndescuento obtenido: 0";
	        cout<<"\ntotal a pagar: 3000"; break;
	        
	case 4: cout<<"precio unitario: 1000";
	        cout<<"\ncantidad comprada: 4";
	        cout<<"\ndescuento obtenido: 0";
	        cout<<"\ntotal a pagar: 4000"; break;
	        
	case 5: cout<<"precio unitario: 1000";
	        cout<<"\ncantidad comprada: 5";
	        cout<<"\ndescuento obtenido: 15%";
	        cout<<"\ntotal a pagar: 4250"; break;
	        
	case 6: cout<<"precio unitario: 1000";
	        cout<<"\ncantidad comprada: 6";
	        cout<<"\ndescuento obtenido: 15%";
	        cout<<"\ntotal a pagar: 5100";  break;      
	         
	default: cout<<"8lo maximo es 6"; break;
}

	return 0;
}
