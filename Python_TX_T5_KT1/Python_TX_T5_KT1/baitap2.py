passwords = input().split(",")
special = "$#@!"
valid = []
for pw in passwords:
    if 6 <= len(pw) <= 12:
        has_lower = any(ch.islower() for ch in pw)
        has_upper = any(ch.isupper() for ch in pw)
        has_digit = any(ch.isdigit() for ch in pw)
        has_special = any(ch in special for ch in pw)
        if has_lower and has_upper and has_digit and has_special:
            valid.append(pw)
if valid:
    print(",".join(valid))
else:
    print("INVALID PASSWORD")