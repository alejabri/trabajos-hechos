#include<iostream>

using namespace std;

int main () {
	
	int o;
	
	for (o=1; o<=10; o++){
		cout<<o<<endl;
	}

	int n,s=0;
	cout<<"ingrese hasta que numero se hara la suma: ";
	cin>>n;
	for(int i=1;i<=n;i++) {
		s=s+i;
		cout<<i<<" + ";
	}
	cout<<"\nla suma es igual a: "<<s;
	
	return 0;
}
