t = int(input())
for _ in range(t):
    tokens = input().split()
    stack = []
    ok = True
    for tok in tokens:
        if tok.isdigit():
            stack.append(float(tok))
        elif tok in "+-*/":
            if len(stack) < 2:
                ok = False
                break
            b = stack.pop()
            a = stack.pop()
            if tok == '+': stack.append(a + b)
            if tok == '-': stack.append(a - b)
            if tok == '*': stack.append(a * b)
            if tok == '/':
                if b == 0: 
                    ok = False
                    break
                stack.append(a / b)
        else:
            ok = False
            break
    if not ok or len(stack) != 1:
        print("INVALID")
    else:
        print(f"{stack[0]:.5f}")