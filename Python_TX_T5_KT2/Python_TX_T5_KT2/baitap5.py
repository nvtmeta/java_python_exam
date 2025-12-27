import json
with open("tips.json", "r") as f:
    data = json.load(f)
t = int(input())
for _ in range(t):
    day, size = input().split()
    size = int(size)
    bills = []
    for rec in data["tips"]:
        if rec["day"] == day and int(rec["size"]) == size:
            bills.append(float(rec["total_bill"]))
    if bills:
        avg = sum(bills) / len(bills)
        print(f"{avg:.4f}")
    else:
        print("Invalid")