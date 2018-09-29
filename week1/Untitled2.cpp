#include <iostream>
#include <fstream>

using namespace std;
void insertionSort (int[], int );
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
    insertionSort(a,n );
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


void insertionSort (int a[], int n) {
    for (int i =1; i<n; i++) {
        int temp = a[i];
        int j = i-1;
        while (temp< a[j]&& j>=0) {
            a[j+1] = a[j];
            j--;
        }
        a[j+1]= temp;

    }
}