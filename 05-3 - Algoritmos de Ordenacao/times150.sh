#!/bin/sh
clear
echo "Bubble Sort:"
time -p java MainApp 150000 1 < piorCaso150.txt > saidaBubble150.txt
echo "--------------------------------"
echo "Selection Sort:"
time -p java MainApp 150000 2 < piorCaso150.txt > saidaSelection150.txt
echo "--------------------------------"
echo "Insertion Sort:"
time -p java MainApp 150000 3 < piorCaso150.txt > saidaInsertion150.txt
echo "--------------------------------"