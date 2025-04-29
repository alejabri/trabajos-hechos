#include<iostream>

using namespace std;

main() {
	
	int i, valor, ventas[8]={600,239,810,772,100,389,991,553};
	
	for(i=0;i<8;i++) {
		cout<<ventas[i]<<" ";
		
	}
	
	cout<<"\ningrese un valor: ";
	cin>>valor;
	
	ventas[i]=valor;
	
	for(i=0;i<8;i++) {
		cout<<valor<<" ";
		
	}
	
}
