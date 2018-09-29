#include <iostream>

using namespace std;
int GCD (int a, int b);
int main(){
    int a ,b ;
    cin>>a>>b;
    cout<<GCD(a,b);
    return 0;
}

int GCD (int a, int b){
    return b==0? a: GCD(b, a%b);
}
