#include<iostream>

using namespace std;

main() {
	
	int i, n;
	
	cout<<"ingrese la cantidad de arreglo: ";
	cin>>n;
	
	int m[n];
	
	for(i=0;i<n-1;i++) {
		cout<<"ingrese numero de las posiciones: ";
		cin>>m[i];
		
	}

	
	for(i=0;i<n-1;i++) {
		cout<<m[i]<<endl;
	}
	
}
