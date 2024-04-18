# Variables
# =========

# Files
# -----
files = ./src/*.java#------------------------<> Sources java 
root = $(shell pwd)#-------------------------<> Fouder root
manifest= ./bin/MANIFEST.MF
binary= ./bin/*

# Drive
# -----
Api = sql/drive/slf4j-api-2.0.9.jar#---------------<> Api 
Provd = sql/drive/slf4j-simple-2.0.12.jar:#--------<> Provedor
Jdbc = sql/drive/sqlite-jdbc-3.45.1.1.jar#---------<> Jdbc sqlite
Som = rec/sound/API/JavaSoundDemo.jar#-------------<> Sounds

# Targets
# =======
all: Program

# Build
# -----
Program: $(files)
	javac -d ./bin $(files);

# clear
# -----
clear:
	rm ./bin/*.class

# Execute 
# -------
run:
	java -cp ".:$(Api):$(Provd):$(Jdbc):bin/" Main "$(root)/"

# Salve git 
# --------- 
git: 
	git add *;\
	git commit -m "...";\
	git push

# Jar
# ---
jar:
	jar cfm Types.jar $(manifest) $(binary)
