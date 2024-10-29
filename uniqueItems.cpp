#include<bits/stdc++.h>
using namespace std;

// int uniqueElements(int arr[], int length){
//     unordered_set <int> uniqueEl;

//     for(int i = 0; i < length; i++){
//         uniqueEl.insert(arr[i]);
//     }
//     return uniqueEl.size();
// }

// vector<int> nextLarger(int arr[], int n){

//     vector <int> larger(n, -1);

//     for(int i = 0; i < n; i++){
//         for(int j = i+1; j < n; j++){
//             if(arr[j]>arr[i]){
//                 larger[i] = arr[j];
//                 break;
//             }
//         }
//     }
//    return larger;
// }

// void zeroAtEnd(int arr[], int n){
//     int temp = 0;
//     for(int i = 0; i < n; i++){
//         if(arr[i] != 0){
//             arr[temp++] = arr[i];
//         }
//     }

//     for(int i = temp; i<n; i++){
//         arr[i] = 0;
//     }

//     for(int i = 0; i < n; i++){
//         cout<<arr[i]<<" ";
//     }
// }

int maxSum(int arr[], int n){
    int ms = 0;
    int cs = 0;

    for(int i = 0; i < n; i++){
        cs = max(arr[i], cs + arr[i]);
        if(cs > ms){
            ms = cs;
        }
    }
    return ms;

}

int main(){
    int arr[] = {3, -1, 2, 5, -6, 3};
    int n = sizeof(arr)/sizeof(arr[0]);

    cout<<maxSum(arr, n);

    return 0;
}