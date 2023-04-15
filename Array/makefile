NUMBERS = 1 2 3
JAVA_HOME = /usr/lib/jvm/java-18-openjdk-amd64
all : execute
Lab1:  
	javac -h . Lab1.java
arithmeticMean: Lab1
	g++ -c -fPIC -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux Main.cc -o arithmeticMean.o
libarithmeticMean: Lab1 arithmeticMean
	g++ -shared -fPIC -o libarithmeticMean.so arithmeticMean.o -lc
execute: Lab1 arithmeticMean libarithmeticMean
	java -cp . -Djava.library.path=. Lab1 $(NUMBERS)  
	
clean:
	rm -rf *.class  *.o *.h

