# CSARCH2 Simulation Project
S13  
CHEN, Ting Rung  
GONZALES, Bryant Kimm Custodio  
PARK, Sehyun  
SILLONA, John Eugene Justiniano  

4-Way BSA LRU

****************To Run the Program****************    

1. Out -> Production -> csarch2_mp -> cmd and run java Launcher
2. Or simply run the project in VSCODE or Intellij IDE

****************Analysis of the Program****************   

Test Case 1) Requires the program to iterate from 0 to input - 1, then repeat the same sequence totaling 4 times. Each main memory block will be assigned to corresponding cache memory block with LRU aspects.
Test Case 2) Has a fixed block number of 64, but the order of the block will be randomly generated from numbers between 0 to input - 1
Test Case 3) Start from 0, then iterate numbers from 1 to input - 2 two times, followed by succeeding number until the number reaches input*2 - 1. Repeat the process totaling 4 times
Example) input = 8, 0 | 1,2,3,4,5,6 | 1,2,3,4,5,6 | 7 ~ 15 {x4}
