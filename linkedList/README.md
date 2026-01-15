# Linked List
The linked list is an important data structure for all programmers to be familiar with; in this exercise, you'll create your own implementation of one. Linked lists are a way to store an arbitrarily-sized list of data. Compared to arrays, linked lists have the advantages of being able to change size with virtually no waste of memory, and not requiring large contiguous pieces of memory. This is thanks to their structure: A linked list isn't a single chunk of memory like an array, but rather a series of nodes that each hold a piece of data and a pointer to the next node. To go through each item in a linked list, just start at the first node and follow the pointers until you reach the end.

Your task is to figure out how to implement a linked list. For C++, the LinkedList header is provided; for Java, the empty MyLinkedList class is. You may add more methods or fields to the class as needed, but don't alter the signatures of the methods that are already there.

To compile and run your C++ code, either import this directory into Eclipse as a makefile project, or run the command "make" in a command shell and run the "linkedListTest" executable produced. For Java, open UT_MyLinkedList and click the "Run" button, or use the "Linked List Tests" run configuration.

# Background
This exercise is focused on the following topics:

 * [classes](https://github.com/Skunkworks1983/Skunkworks-code-exercises/wiki/Class)
 * references/pointers (note: these are two different things in C++, while Java doesn't have pointers at all)
 * [data structure](https://github.com/Skunkworks1983/Skunkworks-code-exercises/wiki/Data-structure) traversal

If you need help, ask a mentor or search [the wiki](https://github.com/Skunkworks1983/Skunkworks-code-exercises/wiki). Be careful about searching the internet more broadly for help on this, because you may stumble upon someone else's fully-implemented linked list and end up not learning anything.

# Tips
 * You'll need a way to represent the nodes of your linked list in your code, as well as the overall list itself. A separate class for the nodes may be a good design decision.
 * Linked lists may be easier to figure out with a visual example. Ask a mentor or a student who knows about linked lists to draw one for you.
 * Remember that each node in a linked list is strictly ordered: a node should only point to one node as the next one in line, and should only have one node that points to it.

# Extensions
Once you're done, you can make these additions:

1. Your current implementation is a *singly-linked list*, meaning that each node only has a pointer to the next node. Change it to a *doubly-linked list*, where each node has a pointer to the next node and the previous node.
2. Replace iteration (loops) with recursive function calls without changing the overall functionality of the list.
3. Templatize your linked list so it can store arbitrary data types instead of just ints and create an iterator.
