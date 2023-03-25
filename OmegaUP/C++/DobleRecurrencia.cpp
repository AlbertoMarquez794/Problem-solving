#include <iostream>
#include <unordered_map>
using namespace std;

unordered_map<int, int> memo_f;
unordered_map<int, int> memo_g;

int g(int n);

int f(int n){
    if (memo_f.count(n)) {
        return memo_f[n];
    }

    int result;
    if (n > 0){
        result = f(n-1) - g(n);
    }
    else {
        result = 1;
    }

    memo_f[n] = result;
    return result;
}

int g(int n){
    if (memo_g.count(n)) {
        return memo_g[n];
    }

    int result;
    if (n <= 2){
        result = -2;
    }
    else {
        result = f(n-2) - 1;
    }

    memo_g[n] = result;
    return result;
}

int main() {
    int n;
    cin >> n;
    cout << f(n) << endl;        
    return 0;
}