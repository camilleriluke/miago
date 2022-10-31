import sys
import math

s = input()
t = ''
for e in s:
    if e.isupper():t+= '-'
    elif e.islower():t+='_'
    else: t+='*'
print(t)
