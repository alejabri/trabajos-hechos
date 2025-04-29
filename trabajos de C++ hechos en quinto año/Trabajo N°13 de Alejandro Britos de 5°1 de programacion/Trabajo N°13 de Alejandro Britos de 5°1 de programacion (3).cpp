#include<iostream>

using namespace std;

main() {
	
	int pagar, a;
	
	for(int i; i<=10; i++) {
		
		cout<<"\ningrese total a pagar: ";
		cin>>pagar;
		
		if(pagar>200 && pagar<=550) {
			
			cout<<"mayor a 200 y menor o igual a 550: "<<pagar;
			
		}
		else {
			
			cout<<"mayor a 550: "<<pagar;
		}
		
	a=a+pagar;
	cout<<"\nel total haora es: "<<a;
		
	}
		
}
