def Fib(n):
  if n == 0 or n == 1:
    return 1
  else:
    return Fib(n-1) + Fib(n-2)
