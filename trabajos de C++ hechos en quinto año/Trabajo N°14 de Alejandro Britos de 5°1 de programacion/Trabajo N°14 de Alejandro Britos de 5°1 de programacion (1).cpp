#include<iostream>

using namespace std;

main() {
	
	int nota, a=0, d=0;
	
	for(int i=1; i<=10; i++) {
		
		cout<<"\ningrese la nota: ";
		cin>>nota;
		
		if(nota>=7) {
			
			a=a+1;
			cout<<"aprobado/s: "<<a;
			
		}
		else {
			
			d=d+1;
			cout<<"desaprobado/s: "<<d;
			
		}
		
	}
	
}
