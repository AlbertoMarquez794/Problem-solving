[n,m]=[int(x) for x in input().split(' ')]
pelotas=[int(x) for x in input().split(' ')]

for i in range(1,m+1):
    print(str(i)+": "+str(pelotas.count(i)))