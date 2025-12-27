n = int(input())
count_dict = {}
for _ in range(n):
    path = input().strip()
    student_id = path.split('/')[0]
    count_dict[student_id] = count_dict.get(student_id, 0) + 1
for student_id in sorted(count_dict.keys()):
    print(f"{student_id} {count_dict[student_id]}")