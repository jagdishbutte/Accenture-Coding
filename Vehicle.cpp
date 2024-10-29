#include<bits/stdc++.h>
using namespace std;

void vehicleCount(int v, int w){
    if(w < 2 || w % 2 != 0 || v > w){
        cout<<"INVALID INPUT";
        return;
    }

    int tw, fw;
    
    tw = (4*v-w)/2;
    fw = v-tw;

    cout<<"No. of 2-wheelrs: "<<tw<<endl;
    cout<<"No. of 4-wheelrs: "<<fw<<endl;

}

int main(){
    int v;
    cin>>v;
    int w;
    cin>>w;
    vehicleCount(v, w);
}