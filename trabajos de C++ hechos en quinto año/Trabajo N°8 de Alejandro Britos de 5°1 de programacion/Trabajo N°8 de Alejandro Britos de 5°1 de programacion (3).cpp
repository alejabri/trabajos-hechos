#include<iostream>

using namespace std;

int main() {
	
	int n1, n2, menor, mayor;
	
	cout<<"ingrese el primer numero: ";
	cin>>n1;
	
	cout<<"ingrese el segundo numero: ";
	cin>>n2;
	
	if(n1 < n2) {
		mayor = n1;
		menor = n2;
		
		cout<<menor<<"\n"<<mayor;
	}
	else {
		mayor = n2;
		menor = n1;
		
		cout<<menor<<"\n"<<mayor;
	}
	
	return 0;
}
