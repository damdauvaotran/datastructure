#include <iostream>
using namespace std;
void makeLine(int , int , int , int , int  []);

int main() {
    int x1, y1, x2, y2, x3, y3;
    cin>>x1>>y1>>x2>>y2>>x3>>y3;
    int line1[3] = {0};
    int line2[3] = {0};
    makeLine(x1,y1,x2,y2,line1);
    for (int i=0; i< 3; i++) {
        cout<<line1[i]<< " ";
    }
    return 0;
}

void makeLine(int x1, int y1, int x2, int y2, int line[]) {
    line[0] = y1-y2;
    line[1] = x2-x1;
    line [2] = line[0]* (-x1)+ line[1]*(-y1);
}
