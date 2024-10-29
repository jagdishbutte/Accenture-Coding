#include<bits/stdc++.h>
using namespace std;

// 

// int SuperiorElements(int arr[], int n){
//     int count = 0;
//     int superior = INT_MIN;
//     for(int i = n-1; i>=0; i--){
//         if(arr[i]>superior) count++;
//         superior = arr[i];
//     }

//     return count;
// }

// int maxCakePieces(int n){
//     int max = n*(n+1)/2 + 1;
//     return max;
// }

// int inversionPairs(int arr[], int n){
//     int pairs = 0;
//     for(int i = 0; i < n; i++){
//         for(int j = i+1; j < n; j++){
//             if(arr[j]<arr[i]) pairs++;
//         }
//     }
//     return pairs;
// }

int main(){
    // int n;
    // cout<<"Enter no. of elements: ";
    // cin>>n;

    // int arr[n];
    // for(int i = 0; i < n; i++){
    //     cin >> arr[i];
    // }

    // cout<<inversionPairs(arr, n);

    srand(static_cast<unsigned int>(time(0)));
    int computerChoice = rand() % 3;
    int yourChoice;
    cout<<" Enter your choice 0: rock, 1:paper, 2:scissors: ";
    cin>>yourChoice;

    cout<<"Your Choice: "<<yourChoice<<endl;
    cout<<"Computers Choice: "<<computerChoice<<endl;

    if(yourChoice<0 || yourChoice>2){
        cout<<"invalid input"<<endl;
        return 0;
    }

    if(yourChoice == computerChoice){
        cout<<"its tie"<<endl;
    }
    else if(
        (yourChoice == 0 && computerChoice == 2) ||
        (yourChoice == 1 && computerChoice == 0) ||
        (yourChoice == 3 && computerChoice == 1)
    ){
        cout<<"You win"<<endl;
    }
    else{
        cout<<"Computer win"<<endl;
    }

    return 0;
}