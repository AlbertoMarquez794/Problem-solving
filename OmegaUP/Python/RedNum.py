import math
from itertools import combinations

def is_perfect_square(n):
    root = int(math.sqrt(n)) #Sacamos la raiz cuadrada del numero que buscamos
    return root*root == n #Verificamos si la raiz al cuadrado es igual al numero de entrada

def count_digits_to_square(n):
    s = str(n) #Convertimos el número en cadena
    n = len(s) #Sacamos la longitud de la cadena
    minDigitos = n - 1 #El peor de los casos es que la cantidad máxima de dígitos que se pueden eliminar es n-1
    for i in range(minDigitos + 1):
        for digitos in combinations(range(n), i):
            cadNueva = ''.join(s[i] for i in range(n) if i not in digitos)
            if cadNueva[0] != '0': # verificar que no queden ceros a la izquierda
                num = int(cadNueva)
                if is_perfect_square(num):
                    return i
    return -1

n = int(input())
print(count_digits_to_square(n))