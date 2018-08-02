#!/bin/bash

if [ "$#" -ne 2 ]; then
    echo "usage: process.sh filename"
    exit 1
fi

#get the first line of the file
line=$(head -n 1 $1)
echo "Data Type:  $line"
echo "Input Data: $2"

#run javac on our config file and generator-generator

javac java_template_generator.java
echo "$line""_template.java"
cat $1 | java java_template_generator > "$line""_template.java"
javac "$line""_template.java"
cat $2 | java "$line""_template" > "$line.java"
cat "$line.java"
