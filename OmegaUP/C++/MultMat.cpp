#include <bits/stdc++.h>
using namespace std;

const int MAXN = 1005;
int numMat;
pair<int, int> matrices[MAXN];
int aux[MAXN][MAXN];

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);
    cin >> numMat;
    for (int i = 0; i < numMat; i++) {
        cin >> matrices[i].first >> matrices[i].second;
    }

    for (int i = 0; i < numMat; i++) {
        aux[i][i] = 0;
    }

    for (int k = 2; k <= numMat; k++) {
        for (int i = 0; i < numMat-k+1; i++) {
            int j = i + k - 1;
            aux[i][j] = INT_MAX;
            for (int m = i; m < j; m++) {
                int costo = aux[i][m] + aux[m+1][j] + matrices[i].first*matrices[m].second*matrices[j].second;
                aux[i][j] = min(aux[i][j], costo);
            }
        }
    }

    cout << aux[0][numMat-1] << "\n";
    return 0;
}