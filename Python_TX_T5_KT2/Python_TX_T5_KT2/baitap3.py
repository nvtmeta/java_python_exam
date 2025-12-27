t = int(input())
for _ in range(t):
    a = list(map(int, input().split()))
    a.sort()
    n = len(a)
    cnt = 0
    for k in range(n - 1, 1, -1):
        i, j = 0, k - 1
        while i < j:
            if a[i] + a[j] > a[k]:
                cnt += j - i
                j -= 1
            else:
                i += 1
    print(cnt)
