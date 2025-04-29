#include<iostream>

using namespace std;

main() {
	
	int numero, suma=0;
	
	cout<<"ingrese un numero: ";
	cin>>numero;
	
	for(int i=1;i<=numero;i++) {
		
		suma +=i;
		
	}
	
	cout<<"la suma es: "<<suma<<endl;
	
}
