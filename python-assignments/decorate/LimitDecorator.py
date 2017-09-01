import time
def Limit(maxPerSecond):
    minInterval = 1.0 /float(maxPerSecond)
    def decorate(func):
        lastTimeCalled = [0.0]
        def LimitedFunction(*args,**kwargs):
            elapsed = time.clock() - lastTimeCalled[0]
            leftToWait = minInterval - elapsed
            if leftToWait>0:
                time.sleep(leftToWait)
            ret = func(*args,**kwargs)
            lastTimeCalled[0] = time.clock()
            return ret
        return LimitedFunction
    return decorate

@Limit(2)  # 2 per second at most
def DisplayNumber(n):
    print(n)

if __name__ == "__main__":
    print ("This should print 1,2,3...10 at about 2 per second.")
    for i in range(1,11):
        DisplayNumber(i)
