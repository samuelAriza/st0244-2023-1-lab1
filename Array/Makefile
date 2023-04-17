JAVA_HOME = /usr/lib/jvm/java-18-openjdk-amd64
all : run
Lab1:  
	javac -h . Lab1.java -Xlint -Werror
arithmeticMean: Lab1
	g++ -c -fPIC -I/$(JAVA_HOME)/include -I/$(JAVA_HOME)/include/linux Mean.cc -o libArithmeticMean.o -Wall -Wextra -Werror
libarithmeticMean: Lab1 arithmeticMean
	g++ -shared -fPIC -o libArithmeticMean.so libArithmeticMean.o -lc
run: Lab1 arithmeticMean libarithmeticMean
	java -cp . -Djava.library.path=. Lab1 filename.txt 
	
clean:
	rm -rf *.class *.o *.h *.so


