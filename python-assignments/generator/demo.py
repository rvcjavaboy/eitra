def demo():
    print("1");
    yield 2
    yield 3
    yield 4

for value in demo():
    print(value)
