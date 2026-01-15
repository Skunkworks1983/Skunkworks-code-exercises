all: human main
human: GhostPlayer.h HumanGhostPlayer.h HumanGhostPlayer.cpp
	g++ -c GhostPlayer.h HumanGhostPlayer.h HumanGhostPlayer.cpp
# add your own task here, and add it to the main task below
main: human main.cpp
	g++ HumanGhostPlayer.o GhostGameHandler.h main.cpp -L. -lghosthandler -o GhostGame
clean:
	rm *.h.gch
	rm *.o
	rm GhostGame
