### Java template maker maker

This is a set of java classes that serve the following purpose:

1. Allow for the generation of a java class based on a list of values/types and supplied object insertion code, and system input
2. Allow for the generation for generation of specific implementations of the above, which generate all the given types, names, and object insertion code

The reason I have written these (absolutely abhorrent) pieces of code is so I can generate java code from csv files, with hardcoded data structures, and all the getters and setters, for minimal effort. My time savings will likely be minimal compared to the time I spent writing this.

#### Usage

Write a configuration file, like so:

```
TestFile
public
var public String res //this is an optional comment
var private String private_res //if the comment is less than four characters long (including tailing space and slashes)
var protected Integer tester //
var protected boolean truthValue //^ above will not be included, but this will.
var protected boolean duplicate //don't use the variable names data or id, as these are already reserved
InsertValues '_(, )|,_'
Indices 0 2 7 1 1
StartLine 2
```

This configuration file consists of the following:

1. class name
2. class accessability
3. list of variables. Each variable has the following structure:
..1 var
..2 accessability type
..3 data type
..4 variable name
..5 optional comment
4. InsertValues keyword, following by a delimiter (between '_ and _')
5. Indices keyword, followed by inline list of indices. In this case, index 0 is the string res, index 1 is the boolean truthValue, etc
..* The list of indices must have a length equal to the list of variables
6. StartLine keyword, followed by the line of the file that the values start at

Once this is sorted, you can run the script process.sh like so:

```
./process.sh Battery.conf Battery_list.csv
```

This will generate the intermediate class Battery_Template, which will be run to generate the class Battery.

It will also deliver some output afterwards showing you the class and checking to see that it compiles.
You can clean up all the generated files by running:

```
./clean.sh Battery.conf
```

The config file is included so that the names of the files to delete can be determined.

There is no robust error checking throughout the layers, though as far as I can tell, the structure of this program should be functional in most of the indended cases.
