#include <iostream>
using namespace std;

int minMovimientos(int n, int arr[]){
    int sum1 = 0, sum2 = 0;
    for(int i = 0; i < n; i++){
        if(i % 2 == 0){
            sum1 += (arr[i] != 1);
            sum2 += (arr[i] != 0);
        }
        else{
            sum1 += (arr[i] != 0);
            sum2 += (arr[i] != 1);
        }
    }
    return min(sum1, sum2);
}

int main() {
    int n;
    cin >> n;

    int arr[n];
    for (int i=0; i < n; i++){
        cin >> arr[i];
    }

    cout << minMovimientos(n, arr) << endl;
    return 0;
}