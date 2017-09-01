from functools import wraps
from time import time

def timing(f):
    @wraps(f)
    def wrapper(*args, **kwargs):
        start = time()
        result = f(*args, **kwargs)
        end = time()
        print ('Elapsed time: {}'.format(end-start))
        return result
    return wrapper

@timing
def f(a):
    for _ in range(a):
        pass

print(f(3000000))
