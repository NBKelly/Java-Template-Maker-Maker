### Java class generator generator

This is a set of java classes that serve the following purpose:

1. Allow for the generation of a java class based on a list of values/types and supplied object insertion code, and system input
2. Allow for the generation for generation of specific implementations of the above, which generate all the given types, names, and object insertion code

The reason I have written these (absolutely abhorrent) pieces of code is so I can generate java code from csv files, with hardcoded data structures, and all the getters and setters, for minimal effort. My time savings will likely be minimal compared to the time I spent writing this.

#### Usage

Write a configuration file, like so:

```
TestFile
public
var public String res
var private String private_res
var protected Integer tester
var protected boolean truthValue
InsertValues '_(, )|,_'
Indices 0 2 7 1
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
4. InsertValues keyword, following by a delimiter (between '_ and _')
5. Indices keyword, followed by inline list of indices
..* The list of indices must have a length equal to the list of variables
6. StartLine keyword, followed by the line of the file that the values start at