#include <iostream>
using namespace std;

int thanosSort(int n, int arr[]) {
    int i=0; 
    int anterior = 0;
    int nuevo = n;

    while (i < n-1){
        if (arr[i] <= arr[i+1]){
            i++;
        }
        else {
            nuevo = (n-anterior)/2;
            i = anterior + nuevo;
            anterior = i;
        }
    }

    return nuevo;
}

int main() {
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << thanosSort(n, arr) << endl;
    return 0;
}
