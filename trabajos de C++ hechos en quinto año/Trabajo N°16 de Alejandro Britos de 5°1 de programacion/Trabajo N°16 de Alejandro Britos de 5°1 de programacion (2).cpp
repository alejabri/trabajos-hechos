#include<iostream>

using namespace std;

main() {
	
	int i, vec[8], p=0, n=0;
	
	for(i=0;i<8;i++) {
		cout<<"\ningrese un numero: ";
		cin>>vec[i];
		
		if(vec[i]%2==0) {
			p=p+1;
			cout<<"numeros pares: "<<p;
			
		}
		else {
			n=n+1;
			cout<<"numeros impares: "<<n;
			
		}
		
	}
	
}
