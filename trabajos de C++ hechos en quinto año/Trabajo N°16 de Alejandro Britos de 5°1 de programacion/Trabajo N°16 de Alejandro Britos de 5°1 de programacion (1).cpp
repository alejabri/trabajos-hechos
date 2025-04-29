#include<iostream>

using namespace std;

main() {
	
	int i, vec[5], suma=0;
	
	for(i=0;i<5;i++) {
		cout<<"ingrese un numero: ";
		cin>>vec[i];
		suma=suma+vec[i];
	}
	
	cout<<"la suma de todos sus elementos es: "<<suma;
	
}
