C++ =g++
CXXFLAGS += -std=gnu++11 #没有用,

all: TwoSum 
.PHONY:all clean

TwoSum:TwoSum.cpp
	$(C++)  -std=gnu++11 TwoSum.cpp   -o TwoSum

clean:
	rm TwoSum 
