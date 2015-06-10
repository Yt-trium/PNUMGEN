JC=javac -Xlint
JR=java
SDIR=src
ODIR=obj

all :
	$(JC) -cp $(ODIR)/commons-cli-1.3.jar -d $(ODIR) src/Main.java


clean :
	rm -f $(ODIR)/*.class

test : clean all run

run : 
	$(JR) -cp $(ODIR)/commons-cli-1.3.jar:$(ODIR) Main
