t=int(input())
for _ in range(t):
    s=input()
    result=""
    for ch in s:
        if 'a' <= ch <= 'z':
            result += chr(ord('z') - (ord(ch) - ord('a')))
        elif 'A' <= ch <= 'Z':
            result += chr(ord('Z') - (ord(ch) - ord('A')))
        else:
            result += ch
    print(result)