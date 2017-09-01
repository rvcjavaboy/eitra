PROG := list
SHELL := /bin/sh
CC := gcc
CXX := g++

COMPILER_OPTIONS := -m64 -Wall -Wextra -Wshadow -Werror -pedantic -Iinclude
CFLAGS := -std=c99 $(COMPILER_OPTIONS)
CXXFLAGS := -std=c++11 -Weffc++ $(COMPILER_OPTIONS)
LDFLAGS := -Wl,--no-as-needed -lm

DEBUGFLAGS := -g -O0 -D _DEBUG
RELEASEFLAGS := -O2 -D NDEBUG

TARGET  := $(PROG)-test.x
SOURCES := $(shell echo src/*.c)
HEADERS := $(shell echo include/*.h)
COMMON  :=
OBJECTS := $(SOURCES:.c=.o)

all: $(TARGET)

$(TARGET): $(OBJECTS) $(COMMON)
	$(CC) $(FLAGS) $(CFLAGS) $(DEBUGFLAGS) -o $(TARGET) $(OBJECTS)

release: $(SOURCES) $(HEADERS) $(COMMON)
	$(CC) $(FLAGS) $(CFLAGS) $(RELEASEFLAGS) -o $(TARGET) $(SOURCES)

zip:
	-zip $(PROG).zip $(HEADERS) $(SOURCES) Makefile GRADER_INFO.txt

clean:
	-rm -f $(TARGET) $(OBJECTS) $(PROG).zip

%.o: %.c $(HEADERS) $(COMMON)
	$(CC) $(CFLAGS) $(DEBUGFLAGS) -c -o $@ $<

.PHONY : all release
