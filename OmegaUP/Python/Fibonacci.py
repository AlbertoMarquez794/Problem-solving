def matrix_mul(A, B):
    n = len(A)
    C = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            for k in range(n):
                C[i][j] += A[i][k] * B[k][j]
    return C

def matrix_pow(A, k):
    if k == 1:
        return A
    elif k % 2 == 0:
        B = matrix_pow(A, k // 2)
        return matrix_mul(B, B)
    else:
        B = matrix_pow(A, k // 2)
        return matrix_mul(matrix_mul(B, B), A)

def fibonacci(n):
    if n == 0:
        return 0
    A = [[1, 1], [1, 0]]
    A_n = matrix_pow(A, n - 1)
    return A_n[0][0]

if __name__ == "__main__":
    n = int(input())
    resultado = fibonacci(n)
    if resultado%2 != 0:
        print("Impar")
    else:
        print(resultado)
