N = input()
count3 = N.count('3')
count5 = N.count('5')
total = count3 + count5
if total == 3 or total == 5:
    print("YES")
else:
    print("NO")