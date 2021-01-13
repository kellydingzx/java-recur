coins = [100,50,20,10,5,2,1]
solutions = []

def getCoin(target):
    if target == 0:
        return solutions
    else:
        for i in coins:
            if target >= i:
                solutions.append(i)
                # print(solutions)
                target = target - i
        getCoin(target)
        return solutions

print(getCoin(82))


                