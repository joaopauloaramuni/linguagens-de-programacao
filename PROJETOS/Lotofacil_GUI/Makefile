all: program

#  Fields
# ========
src=src/*.java

#  Methods
# =========
program: $(src)
	javac -d .bin $(src)

run:
	java -cp ".:.bin" Main

jar:
	javac -d .bin $(src); \
	jar -cfm Lotofacil.jar src/MANIFEST.MF .bin

clear:
	rm .bin/*.class
