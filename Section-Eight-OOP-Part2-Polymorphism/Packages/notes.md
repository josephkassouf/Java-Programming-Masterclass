# Organizing Java Classes, Packages & Import Statements
## Package
- `A package is a namespace that organizes a set of related types.`
- In general, a package corresponds to a folder or directory, on the OS, but this isn't a requirement.
- Package structure is hierarchical, meaning you group types in a tree fashion
- You can use any legal Java identifier for your package names, but common practice has package names as all lowe case.
- The period separates the hierarchical level of the package.

## Java Packages
- Should be familiar with 2 of Java's packages, java.lang, java.util.

## Using Import statements with wildcards
- We could use the wildcard, with the asterisks' character, with the import statement.

## What is the purpose of packages?
- Packages let us re-use common class names across different libraries or applications
  and provide a way to identify the correct class, either with an import statement
  or qualifying name.
- Packages let use organize our classes by functionality, or relationships.
- Packages also let us encapsulate our classes, from classes in other packages.

## What would a package name look like?
- Its common practice to use the reverse domain name to start your own package naming conventions.
- If your company is `abccomoany.com`, your package prefixes would be `com.abccompany`

## Using the package statement
- The package statement needs to be the first statement in the code, except 
  comments.
- Package statement comes before any import statements.
- Can be only one package statement, because a class or type can only be in a single package

## The Fully Qualified Class Name `FQCN`
- A `FQCN` consists of the package name and the class name.