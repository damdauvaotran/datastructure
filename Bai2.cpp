#include <iostream>
#include <fstream>

using namespace std;
void bubbleSort (int a[], int n);
int main() {
    ifstream input;
    input.open("in.txt");
    int n = 0;
    int a[1000];
    if (input) {
        while (!input.eof()) {
            input>>a[n];
            n++;
        }
    }
    input.close();
    bubbleSort(a,n );
    for (int i =0; i< n; i++) {
        cout<<a[i]<<" ";
    }


    ofstream output;
    output.open("out.txt");
    for (int i =0; i< n; i++) {
        output <<a[i]<<" ";
    }
    output.close();

    return 0;
}


void bubbleSort (int a[], int n) {
    for (int i=0; i<n; i++) {
        for (int j=n-1; j>i; j--)
            if(a[j - 1] > a[j]) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            }
    }
}
