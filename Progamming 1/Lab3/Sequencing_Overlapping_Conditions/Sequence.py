n = int(input())

# Put your if-elif in here


if( n >= 5 and n <= 10 and n != 7):
    n += 2

elif( n < 5 and n % 2 == 0):
    n = n // 2

elif(n == 7):
    
    n += 1

elif((n < 5 and n % 2 != 0 ) or n > 10):
    n = n * 3

# Anything after the print statement is not useful

print(n)