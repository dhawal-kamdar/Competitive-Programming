t = int(input())
for _ in range(t):
	n = int(input())
	list = [int(a) for a in input().split()]
	list2 = []
	for x in range(1,len(list)):
		s = abs(list[x] - list[x-1]) - 1
		list2.append(s)
	print(sum(list2))