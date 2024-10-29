#include<bits/stdc++.h>
using namespace std;

int CheckPassword(string str, int n){
    if(n<4){
        return 0;
    }

    if(isdigit(str[0])){
        return 0;
    }

    bool hasUpper = false;
    bool hasDigit = false;

    for(int i = 0; i<n; i++){
        if(isupper(str[i])){
            hasUpper = true;
        }

        if(isdigit(str[i])){
            hasDigit = true;
        }

        if(str[i] == ' ' || str[i] == '/'){
            return 0;
        }
    }

    return (hasDigit && hasUpper)? 1 : 0;
}

int main(){
    string str;
    cout<<"Enter the password: ";
    getline(cin, str);

    int n;
    n = str.length();

    int result = CheckPassword(str, n);
    cout<<result;
    return 0;
}