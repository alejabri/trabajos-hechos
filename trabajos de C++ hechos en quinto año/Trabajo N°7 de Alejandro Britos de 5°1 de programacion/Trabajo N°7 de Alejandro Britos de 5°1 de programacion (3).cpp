#include<iostream>

using namespace std;

int main() {
	
	int peso, masa, agua;
	
	cout<<"introdusca su peso: ";
	cin>>peso;
	
	masa=peso/100*30;
	agua=peso/100*70;
	
	cout<<"usted tiene: "<<masa<<"% de masa muscular";
	cout<<"\nusted tiene: "<<agua<<"% de agua";
	
	return 0;
}
