#include<iostream>

using namespace std;

main() {
	
	int i, vec1[4], vec2[4], suma[4];
	
	for(i=0;i<4;i++) {
		cout<<"introdusca los primeros numeros: ";
		cin>>vec1[i];
		
	}
	
	for(i=0;i<4;i++) {
		cout<<"introdusca los otros numeros: ";
		cin>>vec2[i];
		
	}
	
	for(i=0;i<4;i++) {
		suma[i]=vec1[i]+vec2[i];
			
	}
	
	cout<<"la suma es: ";
	
	for(i=0;i<4;i++) {
		cout<<suma[i]<<" ";
			
	}
	
}
