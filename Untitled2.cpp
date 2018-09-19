#include <iostream>
using namespace std;
struct Point {
    int x;
    int y;
    Point(int x, int y) {
        this->x = x;
        this->y = y;
    }
};

void makeLine(Point pointA , Point pointB, int line[]);
int checkDirection(int line[3], Point point );


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
    for (int i=0; i< 3; i++) {
        cout<<line1[i]<< " ";
    }

    return 0;
}

void makeLine(Point pointA , Point pointB, int line[]) {
    line[0] = pointA.y- pointB.y;
    line[1] = pointB.x-pointA.x;
    line [2] = line[0]* (-pointA.x)+ line[1]*(-pointA.y);
}

int checkDirection(int line[3], Point point ){
    double result = line[0]*point.x+ line[1]*point.y+ line[2];
    if (result==0){
        return 0;
    }
    if (result >0){
        return 1;
    }
    return -1;
}

