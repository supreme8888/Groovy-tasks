def fib(n)
{n=n+1
int[] f = new int[n];
f[0] = 0;
f[1] = 1;
for (int i = 2; i < n; ++i) {
   f[i] = f[i - 1] + f[i - 2]
}
  return(f[n-1])
}
return this
