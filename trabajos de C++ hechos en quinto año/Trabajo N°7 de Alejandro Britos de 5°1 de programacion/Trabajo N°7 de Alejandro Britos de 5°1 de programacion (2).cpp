#include<iostream>

using namespace std;

int main() {
	
	int s,j, iva, r; 
	
	cout>>"ingrese el precio total de las 20 sillas: ";
	cin>>s;
	
	iva=s/100*21;
	j=s+iva;
	r=j-30;
	
	cout<<"lo que debe abonar es: "<<r<<"$";
	
	return 0;
}
