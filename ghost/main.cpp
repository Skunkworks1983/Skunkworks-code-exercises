#include "GhostGameHandler.h"
#include "HumanGhostPlayer.h"
#include <iostream>
#include <vector>

int main(int argc, char** argv)
{
	std::vector<GhostPlayer*> list = std::vector<GhostPlayer*>();
	list.push_back(new HumanGhostPlayer());
	list.push_back(new HumanGhostPlayer());
	GhostGameHandler::getInstance()->runGame("words.txt", list, 5);
	return 0;
}
