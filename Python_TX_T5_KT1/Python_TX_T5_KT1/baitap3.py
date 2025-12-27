t = int(input())
for _ in range(t):
    N = input()
    product = 1
    found = False
    for i in range(0, len(N), 2):   # i=0 là vị trí 1, i=2 là vị trí 3, ...
        digit = int(N[i])
        if digit != 0:
            product *= digit
            found = True
    if found:
        print(product)
    else:
        print(0)