t = int(input())
for _ in range(t):
	k = int(input())
	print("O", end="")
	k -= 1
	for i in range(1,9):
		for j in range(1,9):
			if i==1 and j==1:
				continue
			elif k:
				k -= 1
				print(".",end="")
			else:
				print("X",end="")
		print()