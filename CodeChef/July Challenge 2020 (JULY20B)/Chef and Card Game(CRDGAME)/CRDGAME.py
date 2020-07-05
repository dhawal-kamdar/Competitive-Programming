def addDigit(d):
	sum = 0
	for x in d:
		sum = sum + int(x)
	return sum

t = int(input())
for _ in range(t):
	n = int(input())
	chef = 0
	morty = 0
	for _ in range(n):
		a, b = input().split(" ")
		a = addDigit(a)
		b = addDigit(b)
		if a > b:
			chef += 1
		elif a < b:
			morty += 1
		else:
			chef += 1
			morty += 1
	if chef > morty:
		print(0, chef)
	elif chef < morty:
		print(1, morty)
	else:
		print(2, chef)