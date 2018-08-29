#!/bin/bash

if [ "$#" -ne 2 ]; then
    echo "usage: process.sh (filename - conf) (filename - data) "
    exit 1
fi

#get the first line of the file
line=$(head -n 1 $1)
echo "Data Type:  $line"
echo "Input Data: $2"

#run javac on our config file and generator-generator

javac java_template_generator.java
echo "generating $line""_template.java..."
cat $1 | java java_template_generator > "$line""_template.java"
if [ $? -eq 0 ]; then
    echo "done."
else
    echo "Failure."
    exit 1
fi
echo "generating #line.java..."
javac "$line""_template.java"
cat $2 | java "$line""_template" > "$line.java"
if [ $? -eq 0 ]; then
    echo "done."
else
    echo "Failure."
    exit 1
fi
echo ""
echo "Compiling generated class..."
javac "$line.java"
if [ $? -eq 0 ]; then
    echo "done"
else
    echo "failure"
    exit 1
fi
less "$line.java"

echo "cleaning up..."
rm "$line""_template.java"
rm "$line""_template.class"
rm "java_template.class"
rm "java_template_generator.class"
rm "$line.class"

echo "done"
