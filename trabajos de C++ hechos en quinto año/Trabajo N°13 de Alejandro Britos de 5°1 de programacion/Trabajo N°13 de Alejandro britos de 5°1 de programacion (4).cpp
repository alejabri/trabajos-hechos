#include<iostream>

using namespace std;

main() {
	
	int h, horas, paga, paga_2, resta, casi, suma, g=0;
	
	for(h=1;h<=20;h++) {
		
		cout<<"\ningrese la cantidad de horas trabajadas: ";
		cin>>horas;
		
		if(horas<=40) {
			
			paga=horas*250;
			cout<<"total a pagar: "<<paga;
			 
		}
		else {
			
			resta=horas-40;
			casi=resta*350;
			paga_2=10000+casi;
			cout<<"total a pagar: "<<paga_2;
			g=g+1;
			cout<<"\npersona/s: "<<g;
		}
		
	}
	
}
