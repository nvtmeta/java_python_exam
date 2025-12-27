N = int(input())
words1 = set()
for _ in range(N):
    line = input().lower().split()
    for w in line:
        words1.add(w)

M = int(input())
words2 = set()
for _ in range(M):
    line = input().lower().split()
    for w in line:
        words2.add(w)

only1 = sorted(words1 - words2)
only2 = sorted(words2 - words1)

print(" ".join(only1))
print(" ".join(only2))