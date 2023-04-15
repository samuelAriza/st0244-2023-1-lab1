JAVA_HOME = /usr/lib/jvm/java-18-openjdk-amd64
all : libarithmeticMean
Lab1:  
	javac -h . Lab1.java
arithmeticMean: 
	g++ -c -fPIC -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux Main.cc -o arithmeticMean.o
libarithmeticMean: Lab1 arithmeticMean libarithmeticMean
	g++ -shared -fPIC -o libarithmeticMean.so arithmeticMean.o -lc
clean:
	rm -rf *.class  *.o *.h

