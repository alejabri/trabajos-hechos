#include<iostream>

using namespace std;

main() {
	
	int i, j, vec1[6], vec2[6];
	
	for(i=0;i<6;i++) {
		cout<<"ingrese los numeros: ";
		cin>>vec1[i];
		
	}
	
	for(i=0;i<6;i++) {
		cout<<vec1[i]<<" ";
		
	}
	
	for(j=6;j>0;j--) {
		vec2[j]=vec1[i];
		
	}
	
		cout<<"\n";
		
	for(j=6;j>0;j--) {
		cout<<vec1[i]<<" ";
		
	}
	
}
