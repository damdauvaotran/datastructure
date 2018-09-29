#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;
struct Point {
    int x;
    int y;
    Point(int x, int y) {
        this->x = x;
        this->y = y;
    }
};

void makeLine(Point pointA, Point pointB, int line[]);
int checkDirection(int line[3], Point point );
double getLength(Point a, Point b);


int main() {
    int x1, y1, x2, y2, x3, y3, x4, y4;
    cin>>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;
    int line1[3] = {0};
    int line2[3] = {0};

    Point a =  Point(x1,y1);
    Point b =  Point(x2,y2);
    Point c =  Point(x3,y3);
    Point d =  Point(x4,y4);

    makeLine(a,b,line1);
    makeLine(c,d, line2);
    int stateA = checkDirection(line2, a);
    int stateB = checkDirection(line2, b);
    int stateC = checkDirection(line1, c);
    int stateD = checkDirection(line1, d);

    int line1State = stateA* stateB;
    int line2State = stateC* stateD;
    if(line1State==-1&& line2State ==-1||(stateA==0&&stateB!=0)&&(stateA=0&&!stateB!=0)||(stateC==0&&stateD!=0)&&(stateC!=0&&stateD==0) ) {
        cout<<"2 doan thang cat nhau";
    } else if (getLength(a,b)+getLength(c,d)> max(max(getLength(a,c),getLength(a,d)), max(getLength(b,c),getLength(b,d)))) {
        cout<< "2 doan thang nam tren cung 1 duong thang co phan trung nhau " <<getLength(a,b)<<" "<<getLength(c,d)<< " "<<getLength(a,d);
    } else {
        cout<< "2 doan thang hoan toan phan biet ";
    }
    cout<<stateA;
    cout<<stateB;
    cout<<stateC;
    cout<<stateD;


    return 0;
}

void makeLine(Point pointA, Point pointB, int line[]) {
    line[0] = pointA.y- pointB.y;
    line[1] = pointB.x-pointA.x;
    line [2] = line[0]* (-pointA.x)+ line[1]*(-pointA.y);
}

int checkDirection(int line[3], Point point ) {
    double result = line[0]*point.x+ line[1]*point.y+ line[2];
    if (result==0) {
        return 0;
    }
    if (result >0) {
        return 1;
    }
    return -1;
}

double getLength(Point a, Point b) {
    return (a.x-b.x)*(a.x-b.x)+ (a.y-b.y)*(a.y-b.y);
}



