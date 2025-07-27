lst = list(input())
height = 10
# print(lst)
for i in range(1, len(lst)):
    if lst[i-1] == lst[i]:
        height += 5
    else:
        height += 10

print(height)