#!/bin/sh
clear
echo "Bubble Sort:"
time -p java MainApp 100000 1 < piorCaso100.txt > saidaBubble100.txt
echo "--------------------------------"
echo "Selection Sort:"
time -p java MainApp 100000 2 < piorCaso100.txt > saidaSelection100.txt
echo "--------------------------------"
echo "Insertion Sort:"
time -p java MainApp 100000 3 < piorCaso100.txt > saidaInsertion100.txt
echo "--------------------------------"